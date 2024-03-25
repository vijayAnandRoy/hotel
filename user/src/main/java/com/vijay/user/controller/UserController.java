package com.vijay.user.controller;


import dto.UserDto;
import com.vijay.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto){
        UserDto userResponse = userService.addUser(userDto);
        return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
    }

    @GetMapping("/fetchUser/{id}")
    public ResponseEntity<UserDto> fetchUser(@PathVariable Long id){
            UserDto userDto = userService.fetchUser(id);
            if(userDto != null)
                return new ResponseEntity<>(userDto, HttpStatus.OK);
            else
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    }


}
