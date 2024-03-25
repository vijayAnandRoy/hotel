package com.vijay.foodCatalog.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemDto {
    private Long id;

    private String itemName;

    private String itemDescription;

    private Boolean isVeg;

    private Double price;

    private Long restaurentId;

    private Integer quantity;

}
