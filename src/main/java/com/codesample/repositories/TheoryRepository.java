package com.codesample.repositories;

import com.codesample.entities.Theory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheoryRepository extends JpaRepository<Theory, Integer> {
    @Query("select th from Theory th where th.subject.id = ?1")
    List<Theory> findAllBySubject_Id(int id);

    @Query("SELECT COUNT(id) FROM Theory")
    int getCountTheory();
}