package com.esethuraman.liquibase.demo.service;

import com.esethuraman.liquibase.demo.persistence.Entity.User;
import com.esethuraman.liquibase.demo.persistence.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        List<User> users = (List)(userRepository.findAll());
        for(User user : users){
            System.out.println("---------------------");
            System.out.println(user.getFirstName());
            System.out.println(user.getEmailId());
            System.out.println("---------------------");
        }
        return users;
    }
}
