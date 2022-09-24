package com.codesample.repositories;

import com.codesample.entities.FeedBack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<FeedBack, Integer> {
}
