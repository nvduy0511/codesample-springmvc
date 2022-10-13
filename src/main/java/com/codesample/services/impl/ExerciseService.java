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
    public int getCountExercise()
    {
        int count = exerciseRepository.getCountExercise();
        return count;
    }

    @Override
    public List<Exercise> findAll()
    {
        return exerciseRepository.findAll();
    }

    @Override
    public boolean createExercise(String level, String title, String content, String constraint, String inputFormat, String outputFormat, String sampleInput, String sampleOutput, int status, String tag)
    {
        try {
            Exercise ex = new Exercise();
            ex.setLevel(level);
            ex.setTitle(title);
            ex.setContent(content);
            ex.setConstraint(constraint);
            ex.setInputFormat(inputFormat);
            ex.setOutputFormat(outputFormat);
            ex.setSampleInput(sampleInput);
            ex.setSampleOutput(sampleOutput);
            ex.setStatus(status);
            ex.setTag(tag);
            ex.setCountPeople(0);
            ex.setCountPeoplePass(0);
            exerciseRepository.save(ex);
            return true;
        }catch (Exception e){
            System.out.println("Loi: "+e.toString());
            return false;
        }
    }

    @Override
    public Exercise getExerciseById(int id)
    {
        Exercise ex = new Exercise();
        ex = exerciseRepository.getExerciseById(id);
        if(ex!=null)
        {
            return ex;
        }
        return null;
    }
}
