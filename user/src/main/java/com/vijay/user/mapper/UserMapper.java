package com.vijay.user.mapper;


import dto.UserDto;
import com.vijay.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto UserEntityToDto(User user);

    User UserDtoToEntity(UserDto userDto);
}
