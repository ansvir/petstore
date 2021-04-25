package com.petstore.backend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "TROLE")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private RoleEnum name;

    public Role() {}

    public Role(RoleEnum name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "roles")
    List<User> users;
}
