package com.codesample.entity;

import javax.persistence.*;

@Entity
@Table(name = "exercise")
public class Exercise {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "level", length = 11)
    private String level;

    @Column(name = "title", length = 200)
    private String title;

    @Lob
    @Column(name = "content")
    private String content;

    @Lob
    @Column(name = "constraint")
    private String constraint;

    @Lob
    @Column(name = "inputFormat")
    private String inputFormat;

    @Lob
    @Column(name = "outputFormat")
    private String outputFormat;

    @Lob
    @Column(name = "sampleInput")
    private String sampleInput;

    @Lob
    @Column(name = "sampleOutput")
    private String sampleOutput;

    @Column(name = "countPeople")
    private int countPeople;

    @Column(name = "countPeoplePass")
    private int countPeoplePass;

    @Column(name = "status")
    private int status;

    @Column(name = "idUser")
    private int idUser;

    @Column(name = "tag", length = 20)
    private String tag;

    public Exercise() {
    }

}
