package com.esethuraman.liquibase.demo.controller;

import com.esethuraman.liquibase.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/")
    public void getUsers(){
        userService.getAllUsers();
    }
}
