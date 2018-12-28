package com.esethuraman.liquibase.demo.controller;

import com.esethuraman.liquibase.demo.persistence.Entity.Alumni;
import com.esethuraman.liquibase.demo.service.AlumniServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumniController {

    @Autowired
    AlumniServiceImpl alumniService;

    @GetMapping("/alumni")
    public void getAlumni(){
        alumniService.gerAllAlumni();
    }

    @GetMapping("/alumni/create")
    public void createAlumni(){
        Alumni alumni = new Alumni();
        alumni.setId(5037);
        alumni.setBatch(2019);
        alumniService.setAlumni(alumni);
        System.out.println("alumni created ....");
    }
}
