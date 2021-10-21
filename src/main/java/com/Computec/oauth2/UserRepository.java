package com.Computec.oauth2;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {

	User findByUsername(String username);

}