package com.vijay.foodCatalog.controller;

import com.vijay.foodCatalog.dto.FoodCatalogDto;
import com.vijay.foodCatalog.dto.FoodItemDto;
import com.vijay.foodCatalog.entity.FoodItem;
import com.vijay.foodCatalog.service.FoodCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/foodCatalog")
public class FoodCatalogController {

    @Autowired
    FoodCatalogService foodCatalogService;

    @PostMapping("/addFoodItem")
    ResponseEntity<FoodItemDto> addFoodItem(@RequestBody FoodItemDto foodItemDto){
        return new ResponseEntity<>(foodCatalogService.addFoodItem(foodItemDto), HttpStatus.CREATED);
    }

    @GetMapping("/fetchFoodCatalogByRestaurentId/{id}")
    ResponseEntity<FoodCatalogDto> fetchFoodCatalogByRestaurentId(@PathVariable Long id){
        FoodCatalogDto foodCatalogDto = foodCatalogService.fetchFoodCatalogByRestaurentId(id);
        if(foodCatalogDto != null)
        return new ResponseEntity<>(foodCatalogDto, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

}
