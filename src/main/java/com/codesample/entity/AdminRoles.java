package com.codesample.entity;

import com.codesample.entity.key.AdminRolesKey;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "adminroles")
@IdClass(AdminRolesKey.class)
public class AdminRoles {
    @Id
    @ManyToOne
    @JoinColumn(name = "idAdmin", nullable = false)
    private Admin admin;

    @Id
    @ManyToOne
    @JoinColumn(name = "idRoles", nullable = false)
    private Roles roles;

    public AdminRoles() {
    }

}
