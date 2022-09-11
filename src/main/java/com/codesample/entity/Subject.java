package com.codesample.entity;

import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", length = 50)
    private String name;

    @Lob
    @Column(name = "description")
    private String description;

    @Lob
    @Column(name = "image_Url")
    private String image_Url;

}
