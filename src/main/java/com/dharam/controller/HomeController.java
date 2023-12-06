package com.dharam.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dharam.model.User;
import com.dharam.services.UserService;

@RestController
@CrossOrigin
public class HomeController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home() {
		return "Server running on 8000";
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	@GetMapping("/getUser/{userID}")
	public User getUser(@PathVariable String userID) {
		System.out.println(userID);
		return this.userService.getUser(userID);
		
	}
	@GetMapping("/getUsers")
	public List<User> getUsers(){
		return this.userService.getAllUser();
	}
}
