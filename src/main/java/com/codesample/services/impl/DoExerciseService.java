package com.codesample.services.impl;

import com.codesample.entities.DoExercise;
import com.codesample.repositories.DoExerciseRepository;
import com.codesample.services.IDoExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoExerciseService implements IDoExerciseService {

    @Autowired
    private DoExerciseRepository doExerciseRepository;
    @Override
    public List<DoExercise> getAll() {
        return doExerciseRepository.findAll();
    }
}
