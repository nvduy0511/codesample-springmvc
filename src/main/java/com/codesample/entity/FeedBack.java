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


    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private User user;
}
