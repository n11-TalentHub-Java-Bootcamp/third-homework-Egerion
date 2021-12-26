package com.webservice.springwebapp.mongodb.repository;

import com.webservice.springwebapp.mongodb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
