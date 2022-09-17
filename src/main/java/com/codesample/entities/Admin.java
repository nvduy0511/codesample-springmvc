package com.codesample.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
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
    @JsonIgnore
    private Set<Exercise> exercises;

    @OneToMany(mappedBy = "admin")
    @JsonIgnore
    private Set<AdminRole> adminRoles;


}
