package com.techotip.userservice.controller;

import com.techotip.userservice.model.Order;
import com.techotip.userservice.model.Orders;
import com.techotip.userservice.model.User;
import com.techotip.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable Integer userId) {
        userService.deleteUser(userId);
    }

    @GetMapping("/users/{userId}/orders")
    public Orders getOrderByUserId(@PathVariable Integer userId) {
        return userService.getOrdersByUserId(userId);
    }

    @PostMapping("/users/{userId}/orders")
    public ResponseEntity createOrder(@PathVariable Integer userId, @RequestBody Order order) {
        order.setUserId(userId);
        userService.createOrder(order);
        return new ResponseEntity(HttpStatus.OK);
    }
}
