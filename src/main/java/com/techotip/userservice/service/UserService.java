package com.techotip.userservice.service;

import com.techotip.userservice.exception.UserNotFoundException;
import com.techotip.userservice.model.User;
import com.techotip.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUserById(Integer userId) {
        return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }
}
