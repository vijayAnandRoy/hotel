package com.vijay.foodCatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurentDto {
    private long id;
    private String name;
    private String address;
    private String city;
    private String description;
}
