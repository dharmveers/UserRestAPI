package com.dharam.services;

import java.util.List;

import com.dharam.model.User;


public interface UserService {
	public User addUser(User user);
	public User getUser(String userID);
	public List<User> getAllUser();
}
