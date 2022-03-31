package com.tweetapp.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetapp.entities.UserModel;
import com.tweetapp.exception.UsernameAlreadyExists;
import com.tweetapp.repositories.UserRepository;

/**
 * @author Parichay Gupta
 */
@Service
public class UserModelService {

//  injected User Repository bean
	@Autowired
	private UserRepository userRepository;
	
	

	/**
	 * find user by username
	 * 
	 * @return UserModel
	 */
	public UserModel findByUsername(String username) {
		UserModel userModel = userRepository.findByUsername(username);
		UserModel newUserModel = new UserModel(userModel.getUsername(), userModel.getFirstName(),
				userModel.getLastName(), userModel.getEmail(), userModel.getPassword(), userModel.getContactNum());
		return newUserModel;
	}

	/**
	 * create a new user
	 * 
	 * @return UserModel
	 */
	public UserModel createUser(UserModel user) throws UsernameAlreadyExists {
		UserModel foundedUser = userRepository.findByUsername(user.getUsername());
		if (foundedUser != null) {
			throw new UsernameAlreadyExists("username already exists");
		}
		return userRepository.save(user);
	}

	/**
	 * Method to get all users
	 * 
	 * @return List<UserModel>
	 */
	public List<UserModel> getAllUsers() {
		List<UserModel> userModels = (List<UserModel>) userRepository.findAll();
		List<UserModel> newUserModel = userModels.stream().map(user -> {
			return new UserModel(user.getUsername(), user.getFirstName(), user.getLastName(), user.getEmail(), "null",
					"null");
		}).collect(Collectors.toList());
		return newUserModel;
	}

	/**
	 * Reset User password
	 * 
	 * @return userModel
	 */
	public UserModel changePassword(String username, String newPassword, String contact) throws Exception {
		UserModel userDetails = userRepository.findByUsername(username);
		if (userDetails.getContactNum().equalsIgnoreCase(contact)
				&& userDetails.getUsername().equalsIgnoreCase(username)) {
			userDetails.setPassword(newPassword);
			return userRepository.save(userDetails);
		} else {
			throw new Exception("Unable to change password");
		}
	}

}
