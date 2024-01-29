package com.dharam.services;

import com.dharam.dao.CourseDao;
import com.dharam.model.Course;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CourseServices{
    public ResponseEntity<String> addCourse(Course course);
    public ResponseEntity<Course> getCourseById(Integer id);

    public ResponseEntity<List<Course>> getCourses();
    public ResponseEntity<String> deteleCourseById(Integer id);
}
