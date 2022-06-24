package com.apicourse.cm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apicourse.cm.pojo.Admin;
import com.apicourse.cm.pojo.Course;
import com.apicourse.cm.services.CourseService;
@CrossOrigin(origins = "*")
@RestController
public class CourseController 
{
	@Autowired
	private CourseService service;
	
	
	@GetMapping ("/home")
	public String home() 
	{
		return "Course Management System";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return service.getCourses();	
	}
	
//	@RequestMapping(value="/courses/courseName/{courseName}")
//	public List<Course> getCourseByName(@PathVariable String courseName)
//	{
//		return service.getCourseByName(courseName);	
//	}
	
	@GetMapping ("/courses/{courseId}")
	public Optional<Course> getCourses(@PathVariable String courseId)
	{
		return this.service.getCourses(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public ResponseEntity<HttpStatus> addCourses(@RequestBody Course course)
	{
		try
		{
		  this.service.addCourses(course);	
		  return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/courses")
	public  ResponseEntity<HttpStatus> updateCourses(@RequestBody Course course)
	{
		try
		{
		 this.service.updateCourses(course);
		 return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourses(@PathVariable String courseId)
	{
		try
		{
			this.service.deleteCourses(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	//==========FOR ADMIN METHODS===============
	
	
}