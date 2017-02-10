package com.rahulweb.spring.springdatajapa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class AddressEntity {
	@Id
	private int studentid;
	private String city;
	private String state;
	private int zipcode;
	
	public AddressEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressEntity(int studentid, String city, String state, int zipcode) {
		super();
		this.studentid = studentid;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	

}
