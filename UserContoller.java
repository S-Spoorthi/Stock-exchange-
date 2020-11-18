package com.waleed.stock.training;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserContoller {
	
	@Autowired
	UserService theService;
	
	@RequestMapping("/all")
	List<User> getAllUsers(){
		return theService.getAllUsers();
	}
}
