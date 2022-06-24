package com.apicourse.cm.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.apicourse.cm.pojo.Course;

@EnableJpaRepositories
public interface CourseData extends JpaRepository<Course, Long> 
{

//	List<Course> findByName(String courseName);

}
