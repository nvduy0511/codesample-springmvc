package com.codesample.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
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
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date birthDay;

    @Column(name = "fullName")
    private String fullName;

    //One to Many relationship
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<DoExercise> doExercises;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Learned> learneds;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<FeedBack> feedBacks;


}
