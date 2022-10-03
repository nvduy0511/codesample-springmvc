package com.codesample.repositories;

import com.codesample.entities.TestCase;
import com.codesample.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestcaseRepository extends JpaRepository<TestCase, Integer> {

    @Query("SELECT u FROM TestCase u WHERE u.exercise.id = ?1")
    List<TestCase> getByIdExercise(int id);
}
