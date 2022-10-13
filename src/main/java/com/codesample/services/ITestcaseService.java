package com.codesample.services;

import com.codesample.entities.TestCase;

import java.util.List;

public interface ITestCaseService {
    List<Integer> getByIdExercise(int id);
    List<TestCase> getTestCase(int id);
    List<TestCase> findAll();
    List<TestCase> getTestCaseByID(int id);
}
