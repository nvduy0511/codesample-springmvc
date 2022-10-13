package com.codesample.services;

import com.codesample.entities.Exercise;

import java.util.List;

public interface IExerciseService {

    List<Exercise> getAll();
    Exercise getOne(int id);
    int getCountExercise();
    List<Exercise> findAll();
    boolean createExercise(String level, String title, String content, String constraint, String inputFormat, String outputFormat, String sampleInput, String sampleOutput, int status, String tag);
    Exercise getExerciseById(int id);
}
