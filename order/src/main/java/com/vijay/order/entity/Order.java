package com.vijay.order.entity;

import com.vijay.order.dto.FoodItemsDTO;
import com.vijay.order.dto.RestaurentDTO;
import com.vijay.order.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("order")
public class Order
{
    @Id
    private int orderId;
    private List<FoodItemsDTO> foodItemsList;
    private UserDTO userDto;
    private RestaurentDTO restaurentDTO;
}
