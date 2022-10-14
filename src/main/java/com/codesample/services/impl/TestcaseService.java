package com.codesample.services.impl;

import com.codesample.entities.Subject;
import com.codesample.entities.TestCase;
import com.codesample.repositories.TestcaseRepository;
import com.codesample.services.ITestcaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestcaseService implements ITestcaseService {
    @Autowired
    TestcaseRepository testCaseRepository;

    @Override
    public List<TestCase> findAll() {
        return testCaseRepository.findAll();
    }

    @Override
    public List<TestCase> getTestCaseByID(int id)
    {
        return testCaseRepository.getTCByID(id);
    }
    @Override
    public List<Integer> getByIdExercise(int id) {
        int len = testCaseRepository.getByIdExercise(id).size();
        List<Integer> lsTestCase = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            lsTestCase.add(2);
        }
        return lsTestCase;
    }

    @Override
    public List<TestCase> getTestCase(int id) {
        return  testCaseRepository.getByIdExercise(id);
    }
}
