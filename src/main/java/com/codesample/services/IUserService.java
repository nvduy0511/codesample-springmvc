package com.codesample.services;

import com.codesample.entities.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
}
