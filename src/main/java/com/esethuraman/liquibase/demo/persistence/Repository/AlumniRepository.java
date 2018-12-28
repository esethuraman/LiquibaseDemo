package com.esethuraman.liquibase.demo.persistence.Repository;

import com.esethuraman.liquibase.demo.persistence.Entity.Alumni;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumniRepository extends CrudRepository<Alumni, Integer> {
}
