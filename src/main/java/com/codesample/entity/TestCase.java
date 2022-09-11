package com.codesample.entity;

import javax.persistence.*;

@Entity
@Table(name = "testcase")
public class TestCase {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "input", length = 500)
    private String input;

    @Column(name = "output", length = 500)
    private String output;

    @Column(name = "idExercise")
    private int idExercise;

}
