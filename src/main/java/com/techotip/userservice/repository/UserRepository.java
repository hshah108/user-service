package com.techotip.userservice.repository;

import com.techotip.userservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,Integer> {
}
