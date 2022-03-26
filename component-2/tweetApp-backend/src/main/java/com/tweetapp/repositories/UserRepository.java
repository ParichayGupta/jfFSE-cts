package com.tweetapp.repositories;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tweetapp.entities.UserModel;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {

	UserModel findByUsername(String username);
//	List<UserModel> findByUsername(String username);
}
