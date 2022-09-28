package com.codesample.services;

import com.codesample.entities.Exercise;

import java.util.List;

public interface IExerciseService {

    List<Exercise> getAll();
    Exercise getOne(int id);
}
