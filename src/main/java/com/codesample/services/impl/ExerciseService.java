package com.codesample.services.impl;

import com.codesample.entities.Exercise;
import com.codesample.repositories.ExerciseRepository;
import com.codesample.services.IExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService implements IExerciseService {

    @Autowired
    ExerciseRepository exerciseRepository;

    @Override
    public List<Exercise> getAll() {
        return exerciseRepository.findAll();
    }

    @Override
    public Exercise getOne(int id) {
        return exerciseRepository.findOne(id);
    }
}
