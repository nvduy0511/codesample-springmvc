package com.codesample.services.impl;

import com.codesample.models.RunCodeRequest;
import lombok.SneakyThrows;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class RunCodeThread extends Thread{
    private RunCodeRequest runCodeRequest;

    public RunCodeThread(){

    }

    public RunCodeThread(RunCodeRequest runCodeRequest){
        this.runCodeRequest = runCodeRequest;
    }


    @SneakyThrows
    public void run(){
        URL url = new URL("https://codex-api.herokuapp.com/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");

        Map<String, String> parameters = new HashMap<>();
        parameters.put("code", runCodeRequest.getCode());
        parameters.put("input", runCodeRequest.getInput());
        parameters.put("language", runCodeRequest.getLanguage());

    }
}
