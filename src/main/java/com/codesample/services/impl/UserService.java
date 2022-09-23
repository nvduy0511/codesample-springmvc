package com.codesample.services.impl;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import com.codesample.entities.User;
import com.codesample.repositories.UserRepository;
import com.codesample.services.IMD5Service;
import com.codesample.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    IMD5Service md5Service;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User login(String email, String pass) {
        return userRepository.login(email,pass);
    }

    @Override
    public User addUser(String name, String email, String pass) {
        User user = new User();
        try {
            pass = md5Service.hash(pass);
            user.setFullName(name);
            user.setEmail(email);
            user.setPassWord(pass);
            userRepository.save(user);
        }catch (Exception e){
            return null;
        }
        return user;
    }

    @Override
    public String forgotPassword(String email) {
        String pass = NanoIdUtils.randomNanoId();
        User user = userRepository.findByEmail(email);
        if(user != null)
        {
            user.setPassWord(md5Service.hash(pass));
            userRepository.save(user);
            return pass;
        }
        return "Error because not exits email in database!";
    }
}
