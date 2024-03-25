package com.vijay.restaurent.mapper;

import com.vijay.restaurent.dto.RestaurentDto;
import com.vijay.restaurent.entity.Restaurent;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurentMapper {

    RestaurentMapper INSTANCE = Mappers.getMapper(RestaurentMapper.class);

    Restaurent mapRestaurentDtoToEntity(RestaurentDto restaurentDto);

    RestaurentDto mapRestaurentEntityToDto(Restaurent restaurent);
}
