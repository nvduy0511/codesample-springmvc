package com.codesample.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Roles {
    @Id
    @Column(name = "id", length = 50)
    private String id;

    @Column(name = "name", length = 100)
    private String name;

    // One to Many relationship
    @OneToMany(mappedBy = "roles")
    private Set<AdminRoles> adminRoless;

    public Roles() {
    }

}
