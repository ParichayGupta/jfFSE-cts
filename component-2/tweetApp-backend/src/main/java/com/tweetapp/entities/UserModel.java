package com.tweetapp.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class UserModel implements Serializable {
	/**
	 * 	
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String username;

	private String firstName;

	private String lastName;

	private String email;

	private String password;

	private String contactNum;

	public UserModel() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserModel(String username, String firstName, String lastName, String email, String contactNum,
			String password) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNum = contactNum;
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserModel [username=" + username + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + ", contactNum=" + contactNum + "]";
	}

}
