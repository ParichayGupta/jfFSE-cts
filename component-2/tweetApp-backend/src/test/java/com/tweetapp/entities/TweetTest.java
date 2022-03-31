package com.tweetapp.entities;

import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.tweetapp.dto.Comment;


public class TweetTest {

	@Test
	public void getTweetId() {

	}

	private String tweetId;

	private String username;

	private String tweetText;

	private String firstName;

	private String lastName;

	private String tweetDate;

	private List<String> likes = new ArrayList<>();

	private List<Comment> comments = new ArrayList<>();
}
