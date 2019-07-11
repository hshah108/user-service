package com.techotip.userservice.controller;

import com.techotip.userservice.model.User;
import com.techotip.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("users")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable Integer userId) {
        userService.deleteUser(userId);
    }
}
