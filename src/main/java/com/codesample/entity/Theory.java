package com.codesample.entity;

import javax.persistence.*;

@Entity
@Table(name = "theory")
public class Theory {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "title",length = 200)
    private String title;

    @Lob
    @Column(name = "content")
    private String content;

    @Column(name = "idSubject")
    private int idSubject;


}
