package com.datajpa.demo.dao;

import com.datajpa.demo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {


}
