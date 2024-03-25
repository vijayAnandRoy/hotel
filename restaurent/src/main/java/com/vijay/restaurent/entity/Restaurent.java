package com.vijay.restaurent.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurent {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String address;
    private String city;
    private String description;
}
