package com.esethuraman.liquibase.demo.service;

import com.esethuraman.liquibase.demo.persistence.Entity.Alumni;
import com.esethuraman.liquibase.demo.persistence.Repository.AlumniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlumniServiceImpl {

    @Autowired
    private AlumniRepository alumniRepository;

    @Autowired
    public AlumniServiceImpl(AlumniRepository alumniRepository){
        this.alumniRepository = alumniRepository;
    }

    public List<Alumni> gerAllAlumni(){
        return (List<Alumni>) alumniRepository.findAll();
    }

    public void setAlumni(Alumni alumni){
        alumniRepository.save(alumni);
        System.out.println("alumni created...");
    }
}
