package com.vijay.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemsDTO {
    private Long id;

    private String itemName;

    private String itemDescription;

    private Boolean isVeg;

    private Double price;

    private Long restaurentId;

    private Integer quantity;

}
