package com.codesample.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "passWord", length = 32)
    private String passWord;

    @Column(name = "userName", length = 50)
    private String userName;

    @Column(name = "avatarUrl", length = 256)
    private String avatarUrl;

    @Column(name = "birthDay")
    private Date birthDay;

    @Column(name = "fullName")
    private String fullName;

}
