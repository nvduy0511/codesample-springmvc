package com.codesample.repositories;

import com.codesample.entities.AdminRole;
import com.codesample.models.AdminCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRoleRepository extends JpaRepository<AdminRole, Integer> {
    @Query(value = "INSERT INTO adminrole(`idAdmin`, `idRole`) VALUES (?1,?2)", nativeQuery = true)
    Object addAD(int id, String idR);
}
