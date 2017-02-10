package com.rahulweb.spring.springdatajapa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class SubjectEntity {
	@Id
	private int courseid;
	private String subjectname;
	
	
	public SubjectEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SubjectEntity(int courseid, String subjectname) {
		super();
		this.courseid = courseid;
		this.subjectname = subjectname;
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
	
	
	
}
