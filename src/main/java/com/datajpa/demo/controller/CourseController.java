package com.datajpa.demo.controller;

import com.datajpa.demo.model.Course;
import com.datajpa.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/create")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @GetMapping("/allcourses")
    public List<Course> getAllCourses(){
        return this.courseService.getAllCourse();
    }

    @GetMapping("{courseId}")
    public Course getCourse(@PathVariable long courseId){
        return this.courseService.getCourse(courseId);
    }
    @PutMapping("update")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/{courseId}")
    public void deleteCourse(@PathVariable long courseId){
        this.courseService.deleteCourse(courseId);
    }
}
