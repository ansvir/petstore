package com.petstore.backend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TPRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String description;
    String image;
    Float price;
}
