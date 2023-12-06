package com.dharam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dharam.model.User;


public interface UserDao extends JpaRepository<User, String>{

}
