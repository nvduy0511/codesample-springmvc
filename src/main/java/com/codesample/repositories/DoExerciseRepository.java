package com.codesample.repositories;

import com.codesample.entities.DoExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoExerciseRepository extends JpaRepository<DoExercise, Integer> {
}
