package com.vijay.restaurent.dto;


import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurentDto {
    private long id;
    private String name;
    private String address;
    private String city;
    private String description;
}
