package com.dharam.model;

import org.hibernate.annotations.Proxy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Proxy(lazy = false)
public class User {
	@Id
	private String userID;
	private String userName;
	private String userPass;
	private String userRole;
	public String getUserName() {
		return userName;
	}
	public String getUserID() {
		return userID;
	}
	public String getUserPass() {
		return userPass;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userPass=" + userPass + ", userRole=" + userRole
				+ "]";
	}
	
}
