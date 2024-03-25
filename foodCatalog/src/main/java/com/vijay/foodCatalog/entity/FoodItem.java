package com.vijay.foodCatalog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String itemName;

    private String itemDescription;

    private Boolean isVeg;

    private Double price;

    private Long restaurentId;

    @Column(nullable = false, columnDefinition = "INT DEFAULT 0")
    private Integer quantity;
}
