package com.tweetapp.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Comment {

	private String username;
	private String comment;

	public Comment() {
		super();
	}

	public Comment(String username, String comment) {
		super();
		this.username = username;
		this.comment = comment;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Comment [username=" + username + ", comment=" + comment + "]";
	}

}
