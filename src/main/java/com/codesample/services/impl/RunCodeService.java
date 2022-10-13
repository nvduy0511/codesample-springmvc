package com.codesample.services.impl;

import com.codesample.entities.TestCase;
import com.codesample.models.RunCodeRequest;
import com.codesample.models.RunCodeResponse;
import com.codesample.services.IExerciseService;
import com.codesample.services.IRunCodeService;
import com.codesample.services.ITestCaseService;
import com.codesample.services.fetchapi.FetchRunCode;
import com.codesample.services.fetchapi.RunCodeGenerator;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.util.ArrayList;
import java.util.List;

@Service
public class RunCodeService  implements IRunCodeService {

    @Autowired
    ITestCaseService testcaseService;

    @Override
    public RunCodeResponse runCode(RunCodeRequest runCodeRequest) {
        try {
            RunCodeThread runCodeThread = new RunCodeThread(runCodeRequest);
            Thread thread = new Thread(runCodeThread);
            thread.start();
            thread.join();
            return runCodeThread.getRunCodeResponse();
        }catch (Exception e){
            RunCodeResponse r = new RunCodeResponse();
            r.setOutput(e.getMessage());
            return r;
        }
    }

    @Override
    public List<Integer> runCodes(RunCodeRequest runCodeRequest, int id) {

        List<TestCase> testCases = testcaseService.getTestCase(id);
        List<RunCodeThread> runCodeThreads = new ArrayList<RunCodeThread>();
        List<Integer> result = new ArrayList<Integer>();
        for (TestCase testCase : testCases) {
            RunCodeThread r = new RunCodeThread(runCodeRequest.getCode(), runCodeRequest.getLanguage(), testCase.getInput());
            r.start();
            runCodeThreads.add(r);
        }
        int i =0;
        for (RunCodeThread runCodeThread : runCodeThreads){
            try {
                runCodeThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(runCodeThread.getRunCodeResponse().isSuccess()){
                if(runCodeThread.getRunCodeResponse().getOutput().equals(testCases.get(i++).getOutput()))
                    result.add(1);
                else
                    result.add(0);
            }
            else
                result.add(0);
        }

        return result;
    }
}