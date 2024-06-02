package com.datajpa.demo.service;

import com.datajpa.demo.model.Course;

import java.util.List;

public interface CourseService {
    public Course addCourse(Course course);
    public List<Course> getAllCourse();
    public Course getCourse(long courseId);
    public Course updateCourse(Course course);
    public void deleteCourse(long courseId);

}
