package com.techotip.userservice.service;

import com.techotip.userservice.exception.UserNotFoundException;
import com.techotip.userservice.model.Order;
import com.techotip.userservice.model.User;
import com.techotip.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    public User getUserById(Integer userId) {
        return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }

    public Order getOrder(Integer userId) {
        ResponseEntity<Order> responseEntity = restTemplate.getForEntity("http://localhost:8083/orders/user/"+userId, Order.class);
        return responseEntity.getBody();
    }

    public Order putOrder(Integer userId, Order order) {
       ResponseEntity<Order> responseEntity = restTemplate.postForEntity("http://localhost:8083/orders/user"+userId, order, Order.class);
       return responseEntity.getBody();
    }
}
