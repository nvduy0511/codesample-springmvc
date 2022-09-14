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

    @ManyToOne
    @JoinColumn(name = "idExercise", nullable=false)
    private Exercise exercise;

}
