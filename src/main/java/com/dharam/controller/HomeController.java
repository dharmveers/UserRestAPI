package com.dharam.controller;


import java.util.List;

import com.dharam.model.Course;
import com.dharam.services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dharam.model.User;
import com.dharam.services.UserService;

@RestController
@CrossOrigin
public class HomeController {
	@Autowired
	private UserService userService;
	@Autowired
	private CourseServices courseServices;
	
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

	//course controller
	@PostMapping("/addCourse")
	public ResponseEntity<String> addCourse(@RequestBody Course course){
		return courseServices.addCourse(course);
	}
	@GetMapping("/getCourse/{id}")
	public ResponseEntity<Course> getCourseById(@PathVariable Integer id){
		return courseServices.getCourseById(id);
	}
	@PostMapping("/deleteCourse/{id}")
	public ResponseEntity<String> deleteCourseById(@PathVariable Integer id){
		return courseServices.deteleCourseById(id);
	}
	@GetMapping("/getCourses")
	public ResponseEntity<List<Course>> getCourses(){
		return courseServices.getCourses();
	}
}
