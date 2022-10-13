package com.codesample.repositories;

import com.codesample.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    @Query("select ad from Admin ad where ad.userName=?1 and ad.passWord=?2")
    Admin loginAdmin(String userName, String passWord);
}
