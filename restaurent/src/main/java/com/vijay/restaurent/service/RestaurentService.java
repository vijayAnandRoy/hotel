package com.vijay.restaurent.service;

import com.vijay.restaurent.dto.RestaurentDto;
import com.vijay.restaurent.entity.Restaurent;
import com.vijay.restaurent.mapper.RestaurentMapper;
import com.vijay.restaurent.repository.RestaurentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RestaurentService {

    @Autowired
    RestaurentRepo restaurentRepo;

    public List<RestaurentDto> fetchRestaurents(){
        List<Restaurent> restaurentList =  restaurentRepo.findAll();
       return restaurentList.stream().map(restaurent->RestaurentMapper.INSTANCE.mapRestaurentEntityToDto(restaurent)).collect(Collectors.toList());
    }

    public RestaurentDto addRestaurent(RestaurentDto restaurentDto){
       Restaurent restaurent =  RestaurentMapper.INSTANCE.mapRestaurentDtoToEntity(restaurentDto);
        return RestaurentMapper.INSTANCE.mapRestaurentEntityToDto(restaurentRepo.save(restaurent));
    }

    public RestaurentDto fetchRestuarentById(Long id){
        Optional<Restaurent> restaurent = restaurentRepo.findById(id);
        if(restaurent.isPresent())
          return  RestaurentMapper.INSTANCE.mapRestaurentEntityToDto(restaurent.get());
        else
            return null;
    }

    public void deleteRestaurent(Long id){
       restaurentRepo.deleteById(id);
    }
}
