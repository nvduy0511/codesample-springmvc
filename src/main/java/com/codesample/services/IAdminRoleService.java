package com.codesample.services;

import com.codesample.entities.AdminRole;
import com.codesample.models.AdminCustom;

import java.util.List;

public interface IAdminRoleService {
    List<AdminRole> getAll();
    boolean addAD(int id, String idR);
}
