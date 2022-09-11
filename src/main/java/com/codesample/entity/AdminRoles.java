package com.codesample.entity;

import com.codesample.entity.key.AdminRolesKey;

import javax.persistence.*;

@Entity
@Table(name = "adminroles")
@IdClass(AdminRolesKey.class)
public class AdminRoles {
    @Id
    @Column(name = "idAdmin")
    private int idAdmin;

    @Column(name = "idRoles")
    @Id
    private String idRoles;

    public AdminRoles() {

    }

}
