package com.codesample.services.impl;

import com.codesample.entities.Role;
import com.codesample.repositories.RoleRepository;
import com.codesample.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public Role findRole(String id)
    {
        Role role = new Role();
        role = roleRepository.findRole(id);
        return role;
    }
}
