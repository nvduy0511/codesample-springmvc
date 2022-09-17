package com.codesample.services.impl;

import com.codesample.entities.AdminRole;
import com.codesample.repositories.AdminRoleRepository;
import com.codesample.services.IAdminRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminRoleService implements IAdminRoleService {

    @Autowired
    private AdminRoleRepository adminRoleRepository;

    @Override
    public List<AdminRole> getAll() {
        return adminRoleRepository.findAll();
    }
}
