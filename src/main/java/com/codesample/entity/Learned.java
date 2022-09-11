package com.codesample.entity;

import com.codesample.entity.key.LearnedKey;

import javax.persistence.*;

@Entity
@Table(name = "learned")
@IdClass(LearnedKey.class)
public class Learned {

    @Id
    @Column(name = "idTheory")
    private int idTheory;

    @Id
    @Column(name = "idUser")
    private String idUser;

    public Learned() {
    }

}
