package com.esethuraman.liquibase.demo.persistence.Repository;

import com.esethuraman.liquibase.demo.persistence.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
