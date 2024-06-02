package com.datajpa.demo.service;

import com.datajpa.demo.dao.CourseDao;
import com.datajpa.demo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

    List<Course> courseList;

    public CourseServiceImpl(){

    }

    @Override
    public Course addCourse(Course course) {

         return courseDao.save(course);
    }

    @Override
    public List<Course> getAllCourse() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {

        return courseDao.findById(courseId).get();
    }

    @Override
    public Course updateCourse(Course course) {

        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
       Course c =  courseDao.findById(courseId).get();
       courseDao.delete(c);
    }
}
