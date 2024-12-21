package com.saumyat.microservice.userService.services;

import com.saumyat.microservice.userService.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);
}
