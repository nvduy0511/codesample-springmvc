package com.codesample.services;

import com.codesample.entities.DoExercise;
import com.codesample.models.Rank;

import java.util.List;

public interface IDoExerciseService {
    List<DoExercise> getAll();
    List<DoExercise> getAllByIdUserAndIdExercise(int idUser, int idExercise);
    List<Rank> getRankByIdExercise(int idExercise);
}
