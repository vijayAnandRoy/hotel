package com.vijay.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private List<FoodItemsDTO> foodItemsList;
    private int userId;
    private RestaurentDTO restaurentDTO;
}


