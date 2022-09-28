package com.codesample.services.fetchapi;

import com.codesample.models.RunCodeRequest;
import com.codesample.models.RunCodeResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface FetchRunCode {

    @Headers("Content-Type: application/json")
    @POST("/")
    public Call<RunCodeResponse> runCode(@Body RunCodeRequest runCodeRequest);

}
