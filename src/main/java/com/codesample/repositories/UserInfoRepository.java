package com.codesample.repositories;


import com.codesample.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<User, Integer> {
    User findUserById(int id);
}
