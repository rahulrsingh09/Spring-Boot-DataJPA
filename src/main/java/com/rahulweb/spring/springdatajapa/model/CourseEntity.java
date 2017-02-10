package com.rahulweb.spring.springdatajapa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class CourseEntity {
	@Id
	private int courseid;
	private String coursename;
	
	public CourseEntity(int courseid, String coursename) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
	}
	
	public CourseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	
	
}
