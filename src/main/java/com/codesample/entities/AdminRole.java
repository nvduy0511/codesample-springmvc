package com.codesample.entities;

import com.codesample.entities.key.AdminRolesKey;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "adminrole")
@IdClass(AdminRolesKey.class)
public class AdminRole {
    @Id
    @ManyToOne
    @JoinColumn(name = "idAdmin", nullable = false)
    private Admin admin;

    @Id
    @ManyToOne
    @JoinColumn(name = "idRole", nullable = false)
    private Role role;

}
