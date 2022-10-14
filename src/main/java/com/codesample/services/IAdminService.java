package com.codesample.services;

import com.codesample.entities.Admin;

public interface IAdminService {
    Admin loginAdmin(String userName, String passWord);
}
