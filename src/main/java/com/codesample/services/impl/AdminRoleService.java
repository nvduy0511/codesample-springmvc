package com.codesample.services.impl;

import com.codesample.entities.AdminRole;
import com.codesample.models.AdminCustom;
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

    @Override
    public boolean addAD(int id, String idR)
    {
        Object a = adminRoleRepository.addAD(id, idR);
        if(a!=null)
        {
            return true;
        }
        return false;
    }
}
