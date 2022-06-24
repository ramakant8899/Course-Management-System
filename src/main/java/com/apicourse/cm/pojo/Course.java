package com.apicourse.cm.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course 
{
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String courseName;
	private String courseDescription;
	private String courseDuration;
	private String courseImage;
	
	public String getCourseImage() 
	{
		return courseImage;
	}

	public void setCourseImage(String courseImage)
	{
		this.courseImage = courseImage;
	}

	private int fee;
	
	public Course() {
		super();
	}

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getCourseName()
	{
		return courseName;
	}

	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}

	public String getCourseDescription() 
	{
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) 
	{
		this.courseDescription = courseDescription;
	}

	public String getCourseDuration() 
	{
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration)
	{
		this.courseDuration = courseDuration;
	}

	public int getFee() 
	{
		return fee;
	}

	public void setFee(int fee) 
	{
		this.fee = fee;
	}

	public Course(long id, String courseName, String courseDescription, String courseDuration, int fee) 
	{
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseDuration = courseDuration;
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", courseDescription=" + courseDescription
				+ ", courseDuration=" + courseDuration + ", courseImage=" + courseImage + ", fee=" + fee + "]";
	}
	
	
	
}
