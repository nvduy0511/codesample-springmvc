package com.codesample.services;

import com.codesample.entities.TestCase;

import java.util.List;

public interface ITestCaseService {
    List<TestCase> findAll();
    List<TestCase> getTestCaseByID(int id);
}
