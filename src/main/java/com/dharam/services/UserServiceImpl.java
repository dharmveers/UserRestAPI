package com.dharam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dharam.dao.UserDao;
import com.dharam.model.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public User addUser(User user) {
		return userDao.save(user);
	}

	@Override
	public User getUser(String userID) {
		
		return userDao.getOne(userID);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.findAll();
	}
		
}
