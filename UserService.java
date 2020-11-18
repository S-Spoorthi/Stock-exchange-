package com.waleed.stock.training;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public List<User> getAllUsers(){
		return Arrays.asList(
				new User(206,"ab","234","user","ab@mail.com",852565544,"y")
				);
	}
	
}
