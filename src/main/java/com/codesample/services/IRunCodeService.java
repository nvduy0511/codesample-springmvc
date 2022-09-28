package com.codesample.services;

import com.codesample.models.RunCodeRequest;
import com.codesample.models.RunCodeResponse;

public interface IRunCodeService {
    RunCodeResponse runCode(RunCodeRequest runCodeRequest);
}
