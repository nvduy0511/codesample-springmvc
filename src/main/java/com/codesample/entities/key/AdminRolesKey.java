package com.codesample.entities.key;

import com.codesample.entities.Admin;
import com.codesample.entities.Role;

import java.io.Serializable;

public class AdminRolesKey implements Serializable {
    private Admin admin;
    private Role role;
}
