package com.codesample.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "id", length = 50)
    private String id;

    @Column(name = "name", length = 100)
    private String name;

    // One to Many relationship
    @Transient
    @OneToMany(mappedBy = "role")
    @JsonIgnore
    private Set<AdminRole> adminRoles;

}
