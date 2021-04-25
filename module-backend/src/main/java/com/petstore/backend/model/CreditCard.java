package com.petstore.backend.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TCC")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String number;
    String expiration;
    String cvv;
}
