package com.vijay.foodCatalog.service;

import com.vijay.foodCatalog.dto.FoodCatalogDto;
import com.vijay.foodCatalog.dto.FoodItemDto;
import com.vijay.foodCatalog.dto.RestaurentDto;
import com.vijay.foodCatalog.entity.FoodItem;
import com.vijay.foodCatalog.repository.FoodCatalogRepository;
import mapper.FoodItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FoodCatalogService {

    @Autowired
    FoodCatalogRepository foodCatalogRepository;

    @Autowired
    RestTemplate restTemplate;

    public FoodItemDto addFoodItem(FoodItemDto foodItemDto){
       return FoodItemMapper.INSTANCE.mapFoodItemToFoodItemDto(foodCatalogRepository.save(FoodItemMapper.INSTANCE.mapFoodItemDtotoFoodItem(foodItemDto)));
    }

    public FoodCatalogDto fetchFoodCatalogByRestaurentId(Long id){
        return getFoodCatalogDetails(id);
    }
    private List<FoodItem> foodItemListByRestaurentId(Long id){
        return foodCatalogRepository.findByRestaurentId(id);
    }

    private RestaurentDto fetchRestaurentDetails(Long id){
        return restTemplate.getForObject("http://RESTAURENT-SERVICE/restaurent/fetchRestuarentById/"+id, RestaurentDto.class);
    }

    private FoodCatalogDto getFoodCatalogDetails(Long id){
        FoodCatalogDto foodCatalogDtoResponse = new FoodCatalogDto();
        foodCatalogDtoResponse.setFoodItemList(foodItemListByRestaurentId(id));
        foodCatalogDtoResponse.setRestaurentDto(fetchRestaurentDetails(id));
        return foodCatalogDtoResponse;
    }

}
