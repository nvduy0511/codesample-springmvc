package com.codesample.entity;

import javax.persistence.*;

@Entity
@Table(name = "feedback")
public class FeedBack {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "star")
    private int star;

    @Lob
    @Column(name = "messages")
    private String messages;

    @Column(name = "idUser")
    private int idUser;
}
