package com.codesample.services;

import com.codesample.models.RunCodeRequest;
import com.codesample.models.RunCodeResponse;

import java.util.List;

public interface IRunCodeService {
    RunCodeResponse runCode(RunCodeRequest runCodeRequest);
    List<Integer> runCodes(RunCodeRequest runCodeRequest, int id);
}
