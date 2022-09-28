package com.codesample.services.impl;

import com.codesample.entities.TestCase;
import com.codesample.repositories.TestcaseRepository;
import com.codesample.services.ITestcaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class TestcaseService implements ITestcaseService {

    @Autowired
    TestcaseRepository testcaseRepository;

    @Override
    public List<Integer> getByIdExercise(int id) {
        int len = testcaseRepository.getByIdExercise(id).size();
        List<Integer> lsTestCase = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            lsTestCase.add(2);
        }
        return lsTestCase;
    }
 }
