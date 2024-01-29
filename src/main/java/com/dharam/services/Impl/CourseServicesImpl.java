package com.dharam.services.Impl;

import com.dharam.dao.CourseDao;
import com.dharam.model.Course;
import com.dharam.services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseServicesImpl implements CourseServices {
    @Autowired
    private CourseDao dao;

    @Override
    public ResponseEntity<String> addCourse(Course course){
        dao.save(course);
        return new ResponseEntity<>("Course Added Successfully", HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Course> getCourseById(Integer id) {
        return new ResponseEntity<>(dao.findById(id).orElseThrow(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Course>> getCourses() {
        return new ResponseEntity<>(dao.findAll(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deteleCourseById(Integer id) {
        dao.deleteById(id);
        return new ResponseEntity<>("Course deleted successfully",HttpStatus.ACCEPTED);
    }

}
