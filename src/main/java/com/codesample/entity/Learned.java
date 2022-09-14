package com.codesample.entity;

import com.codesample.entity.key.LearnedKey;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "learned")
@IdClass(LearnedKey.class)
public class Learned {

    @Id
    @ManyToOne
    @JoinColumn(name = "idTheory", nullable = false)
    private Theory theory;

    @Id
    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private User user;

}
