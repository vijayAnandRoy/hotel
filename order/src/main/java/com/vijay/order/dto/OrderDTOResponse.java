package com.vijay.order.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTOResponse {
    private Long orderId;
    private List<FoodItemsDTO> foodItemsList;
    private Long userId;
    private RestaurentDTO restaurentDTO;
}
