package com.codesample.controllers.web;

import com.codesample.entities.AdminRole;
import com.codesample.entities.DoExercise;
import com.codesample.entities.User;
import com.codesample.services.IAdminRoleService;
import com.codesample.services.IDoExerciseService;
import com.codesample.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private IUserService userService;

    @Autowired
    private IDoExerciseService doExerciseService;

    @Autowired
    private IAdminRoleService adminRoleService;

    @GetMapping("/get-all-user")
    public List<User> getAll(){
        return userService.findAll();
    }

    @GetMapping("/get-all-doexercise")
    public List<DoExercise> getAllDo(){
        return doExerciseService.getAll();
    }

    @GetMapping("/get-all-adminrole")
    public  List<AdminRole> getAllAdminRole(){
        return adminRoleService.getAll();
    }

}
