package com.codesample.services.impl;

import com.codesample.entities.DoExercise;
import com.codesample.models.Rank;
import com.codesample.repositories.DoExerciseRepository;
import com.codesample.services.IDoExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DoExerciseService implements IDoExerciseService {

    @Autowired
    private DoExerciseRepository doExerciseRepository;
    @Override
    public List<DoExercise> getAll() {
        return doExerciseRepository.findAll();
    }

    @Override
    public List<DoExercise> getAllByIdUserAndIdExercise(int idUser, int idExercise) {
        return doExerciseRepository.getDoExerciseByIdUserAndIdExercise(idUser,idExercise);
    }

    @Override
    public List<Rank> getRankByIdExercise(int idExercise) {
        List<Object[]> lsObjects =  doExerciseRepository.getRankByIdExercise(idExercise);
        List<Rank> lsRank = new ArrayList<Rank>();
        for (Object[] i: lsObjects) {
            lsRank.add(new Rank((String) i[0], (Integer) i[1], (Date) i[2]));
        }
        return lsRank;
    }
}
