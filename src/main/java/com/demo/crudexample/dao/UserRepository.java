package com.demo.crudexample.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.crudexample.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	User findOne(String userId);

}
