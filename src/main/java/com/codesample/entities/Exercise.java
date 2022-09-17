package com.codesample.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
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

    @Column(name = "tag", length = 20)
    private String tag;

    //foreign key
    @ManyToOne
    @JoinColumn(name="idAdmin", nullable=false)
    private Admin admin;

    //One to Many relationship
    @OneToMany(mappedBy = "exercise")
    @JsonIgnore
    private Set<TestCase> testCases;

    @OneToMany(mappedBy = "exercise")
    @JsonIgnore
    private Set<DoExercise> doExercises;

}
