package com.webservice.springwebapp.mongodb.controller;

import com.webservice.springwebapp.mongodb.entity.User;
import com.webservice.springwebapp.mongodb.entityservice.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserEntityService userEntityService;

    @GetMapping("")
    public List<User> findAll(){
        return userEntityService.findAll();
    }

    @GetMapping("/id/{userId}")
    public User findById(@PathVariable String userId){
        return userEntityService.findById(userId);
    }

    @PostMapping("")
    public User save(@PathVariable User user){
        return userEntityService.save(user);
    }

    @DeleteMapping("delete/{userId}")
    public void deleteById(@PathVariable String userId){
        userEntityService.deleteById(userId);
    }
}
