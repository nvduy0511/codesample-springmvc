package com.codesample.repositories;

import com.codesample.entities.Theory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheoryRepository extends JpaRepository<Theory, Integer> {
//    @Query(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?0", nativeQuery = true);
    List<Theory> findAllBySubject_Id(int subject);
}
