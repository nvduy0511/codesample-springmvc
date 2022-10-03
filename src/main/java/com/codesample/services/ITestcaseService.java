package com.codesample.services;

import com.codesample.entities.TestCase;

import java.util.List;

public interface ITestcaseService {
    List<Integer> getByIdExercise(int id);
    List<TestCase> getTestCase(int id);
}
