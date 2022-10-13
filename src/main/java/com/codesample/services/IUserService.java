package com.codesample.services;

import com.codesample.entities.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    User login(String email, String pass);
    User addUser(String name, String email, String pass);
    String forgotPassword(String email);
    int getCountUser();
}
