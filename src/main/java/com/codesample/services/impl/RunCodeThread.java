package com.codesample.services.impl;

import com.codesample.models.RunCodeRequest;
import com.codesample.models.RunCodeResponse;
import com.codesample.services.fetchapi.FetchRunCode;
import com.codesample.services.fetchapi.RunCodeGenerator;
import lombok.SneakyThrows;
import retrofit2.Call;
import retrofit2.Response;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class RunCodeThread extends Thread{
    private RunCodeRequest runCodeRequest;
    private RunCodeResponse runCodeResponse;

    public RunCodeThread(){

    }
    public RunCodeThread(String code, String language, String input){
        this.runCodeRequest = new RunCodeRequest(code,language,input);
    }

    public RunCodeThread(RunCodeRequest runCodeRequest){
        this.runCodeRequest = runCodeRequest;
    }


    public void run(){
        FetchRunCode fetchRunCode = RunCodeGenerator.createService(FetchRunCode.class);
        Call<RunCodeResponse> runCodeResponseCall = fetchRunCode.runCode(runCodeRequest);
        try {
            Response<RunCodeResponse> response = runCodeResponseCall.execute();
            runCodeResponse = response.body();
        } catch (Exception ex) {
            runCodeResponse = new RunCodeResponse();
            runCodeResponse.setSuccess(false);
            runCodeResponse.setOutput(ex.getMessage());
        }

    }

    public RunCodeRequest getRunCodeRequest() {
        return runCodeRequest;
    }

    public void setRunCodeRequest(RunCodeRequest runCodeRequest) {
        this.runCodeRequest = runCodeRequest;
    }

    public RunCodeResponse getRunCodeResponse() {
        return runCodeResponse;
    }

    public void setRunCodeResponse(RunCodeResponse runCodeResponse) {
        this.runCodeResponse = runCodeResponse;
    }
}
