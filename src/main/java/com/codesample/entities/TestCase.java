package com.codesample.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
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

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idExercise", nullable=false)
    private Exercise exercise;

}
