package com.codesample.services.impl;

import com.codesample.entities.User;
import com.codesample.repositories.UserInfoRepository;
import com.codesample.repositories.UserRepository;
import com.codesample.services.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService implements IUserInfoService {

    @Autowired
    UserInfoRepository userInfoRepository;


    @Override
    public User findOneById(int id) {

        return userInfoRepository.findUserById(id);
    }
}
