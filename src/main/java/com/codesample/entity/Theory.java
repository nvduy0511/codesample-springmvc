package com.codesample.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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


    @ManyToOne
    @JoinColumn(name = "idSubject", nullable = false)
    private Theory theory;

    @OneToMany(mappedBy = "learned")
    private Set<Learned> learneds;

}
