package com.codesample.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "doexercise")
public class DoExercise {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

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
    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

    //foreign key
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idExercise", nullable = false)
    private Exercise exercise;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idUser", nullable = false)
    private User user;

}
