package com.codesample.services.impl;

import com.codesample.models.RunCodeRequest;
import com.codesample.models.RunCodeResponse;
import com.codesample.services.IRunCodeService;
import com.codesample.services.fetchapi.FetchRunCode;
import com.codesample.services.fetchapi.RunCodeGenerator;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

@Service
public class RunCodeService  implements IRunCodeService {
    @Override
    public RunCodeResponse runCode(RunCodeRequest runCodeRequest) {
        FetchRunCode fetchRunCode = RunCodeGenerator.createService(FetchRunCode.class);
        Call<RunCodeResponse> runCodeResponseCall = fetchRunCode.runCode(runCodeRequest);
        RunCodeResponse runCodeResponse = null;
        try {
            Response<RunCodeResponse> response = runCodeResponseCall.execute();
            runCodeResponse = response.body();
        } catch (Exception ex) {
            runCodeResponse = new RunCodeResponse();
            runCodeResponse.setOutput(ex.getMessage());
            runCodeResponse.setLanguage(runCodeRequest.getCode());
            return runCodeResponse;
        }
        return runCodeResponse;
    }
}