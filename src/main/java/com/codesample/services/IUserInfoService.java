package com.codesample.services;

import com.codesample.entities.User;

import java.util.List;

public interface IUserInfoService {
    User findOneById(int id);
}
