package com.codesample.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "doexercise")
public class DoExercise {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "idUser")
    private int idUser;

    @Column(name = "idExercise")
    private int idExercise;

    @Column(name = "status")
    private int status;

    @Lob
    @Column(name = "code")
    private String code;

    @Column(name = "language", length = 10)
    private String language;

    @Column(name = "testCasePass")
    private int testCasePass;

    @Column(name = "time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

    public DoExercise() {
    }

}
