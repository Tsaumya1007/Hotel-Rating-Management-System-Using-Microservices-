package com.saumyat.microservice.userService.controllers;


import com.saumyat.microservice.userService.entities.User;
import com.saumyat.microservice.userService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User ruser = userService.saveUser(user);
        return new ResponseEntity<>(ruser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> resUser = userService.getAllUser();
        return new ResponseEntity<>(resUser,HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getAllUser(@PathVariable String userId){
        User resUser = userService.getUser(userId);
        return new ResponseEntity<>(resUser,HttpStatus.OK);
    }
}
