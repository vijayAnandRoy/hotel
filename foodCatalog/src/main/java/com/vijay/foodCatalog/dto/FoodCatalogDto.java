package com.vijay.foodCatalog.dto;

import com.vijay.foodCatalog.entity.FoodItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodCatalogDto
{

    private List<FoodItem> foodItemList;
    private RestaurentDto restaurentDto;
}
