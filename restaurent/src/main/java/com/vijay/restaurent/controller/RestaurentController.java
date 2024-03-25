package com.vijay.restaurent.controller;

import com.vijay.restaurent.dto.RestaurentDto;
import com.vijay.restaurent.entity.Restaurent;
import com.vijay.restaurent.service.RestaurentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurent")
@Slf4j
public class RestaurentController {

    @Autowired
    RestaurentService restaurentService;

    @GetMapping("/getRestaurents")
    public ResponseEntity<List<RestaurentDto>> fetchRestaurents(){
        return ResponseEntity.ok(restaurentService.fetchRestaurents());
    }

    @PostMapping("/addRestaurent")
    public ResponseEntity<RestaurentDto> saveRestaurent(@RequestBody RestaurentDto restaurentDto){
        return new ResponseEntity<>(restaurentService.addRestaurent(restaurentDto), HttpStatus.CREATED);
    }

    @GetMapping("/fetchRestuarentById/{id}")
    public ResponseEntity<RestaurentDto> fetchRestuarentById(@PathVariable Long id){
          RestaurentDto restaurentDto = restaurentService.fetchRestuarentById(id);
          if(restaurentDto != null)
            return new ResponseEntity(restaurentDto, HttpStatus.OK);
          else
              return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/deleteRestaurent/{id}")
    public ResponseEntity<RestaurentDto> deleteRestaurent(@PathVariable Long id){
        restaurentService.deleteRestaurent(id);
        return ResponseEntity.ok(null);
    }
}
