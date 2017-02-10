package com.rahulweb.spring.springdatajapa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marks")
public class MarksEntity {
	@Id
	private int studentid;
	private int courseid;
	private String subjectname;
	private int marks;
	
	
	public MarksEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getStudentid() {
		return studentid;
	}


	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}


	public int getCourseid() {
		return courseid;
	}


	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}


	public String getSubjectname() {
		return subjectname;
	}


	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public MarksEntity(int studentid, int courseid, String subjectname, int marks) {
		super();
		this.studentid = studentid;
		this.courseid = courseid;
		this.subjectname = subjectname;
		this.marks = marks;
	}
	
	

}
