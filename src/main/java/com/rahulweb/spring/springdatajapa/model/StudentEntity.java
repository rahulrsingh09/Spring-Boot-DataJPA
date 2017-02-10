package com.rahulweb.spring.springdatajapa.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "student")
public class StudentEntity {
	@Id
	private int studentid;
	private String studentname;
	private int age ;
	private int courseid;
	@OneToOne(fetch=FetchType.EAGER)
	private AddressEntity address;
	
	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public StudentEntity(int studentid, String studentname, int age, int courseid) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.age = age;
		this.courseid = courseid;
	}

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	
	
	

}
