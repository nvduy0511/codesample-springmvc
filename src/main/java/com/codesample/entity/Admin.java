package com.codesample.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "passWord")
    private String passWord;

    @Column(name = "email")
    private String email;

    @Column(name = "fullName")
    private String fullName;

    // One to Many relationship
    @OneToMany(mappedBy = "admin")
    private Set<Exercise> exercises;

    @OneToMany(mappedBy = "admin")
    private Set<AdminRoles> adminRoless;

    public Admin() {
    }

}
