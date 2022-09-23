package com.codesample.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;
@Data
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

//    @Transient
    @ManyToOne
    @JoinColumn(name = "idSubject", nullable = false)
    private Subject subject;


    @Transient
    @OneToMany(mappedBy = "theory")
    @JsonIgnore
    private Set<Learned> learneds;

}
