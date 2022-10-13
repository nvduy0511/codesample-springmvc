package com.codesample.services.impl;

import com.codesample.entities.Admin;
import com.codesample.repositories.AdminRepository;
import com.codesample.services.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin loginAdmin(String userName, String passWord)
    {
        return adminRepository.loginAdmin(userName, passWord);
    }
}
