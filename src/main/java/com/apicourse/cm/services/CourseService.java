package com.apicourse.cm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apicourse.cm.dao.AdminRepo;
import com.apicourse.cm.dao.CourseData;
import com.apicourse.cm.pojo.Admin;
import com.apicourse.cm.pojo.Course;


@Service
public class CourseService 
{
	@Autowired
	private CourseData data;
	@Autowired
	AdminRepo adminRepo;
	
	public List<Course> getCourses() 
	{
		return data.findAll();
	}

	public Optional<Course> getCourses(long courseId) 
	{
		return data.findById(courseId);
	}

	public Course addCourses(Course course) 
	{
		data.save(course);
		return course;
	}

	public Course updateCourses(Course course) 
	{
		data.save(course);
		return course;
		
	}

	public void deleteCourses(long parseLong) 
	{
	    Course cms= data.getOne(parseLong);
	    data.delete(cms);
	}

//	public List<Course> getCourseByName(String courseName) 
//	{
//		return  data.findByName(courseName);
//	}

	

	
}
