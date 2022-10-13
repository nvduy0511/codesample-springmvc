package com.codesample.repositories;

import com.codesample.entities.Exercise;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Integer>{
    @Query("SELECT COUNT(id) FROM Exercise")
    int getCountExercise();

    @Query("SELECT e FROM Exercise e WHERE e.id = ?1")
    Exercise getExerciseById(int id);
}
