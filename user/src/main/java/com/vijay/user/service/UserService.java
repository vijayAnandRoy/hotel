package com.vijay.user.service;

import dto.UserDto;
import com.vijay.user.entity.User;
import com.vijay.user.mapper.UserMapper;
import com.vijay.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDto addUser(UserDto userDto){
      User user =  userRepository.save(UserMapper.INSTANCE.UserDtoToEntity(userDto));
      return UserMapper.INSTANCE.UserEntityToDto(user);
    }

    public UserDto fetchUser(Long id){
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent())
        return UserMapper.INSTANCE.UserEntityToDto(userRepository.findById(id).get());
        else
            return null;
    }
}
