package com.codesample.services.impl;

import com.codesample.entities.Subject;
import com.codesample.entities.TestCase;
import com.codesample.repositories.TestCaseRepository;
import com.codesample.services.ITestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestCaseService implements ITestCaseService {
    @Autowired
    TestCaseRepository testCaseRepository;

    @Override
    public List<TestCase> findAll() {
        return testCaseRepository.findAll();
    }

    @Override
    public List<TestCase> getTestCaseByID(int id)
    {
        return testCaseRepository.getTCByID(id);
    }
}
