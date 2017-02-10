package com.rahulweb.spring.springdatajapa.service;

import java.util.List;

import javax.transaction.Transactional;

import com.rahulweb.spring.springdatajapa.dao.StudentRepository;

@org.springframework.stereotype.Service
@Transactional
public class Service {

	private final StudentRepository repository;
	
	public Service(StudentRepository repository){
		this.repository = repository;
	}
	

	public List<String> passedInCourse(String coursename){
		return repository.passsedInCourse(coursename);		
	}
	
	public List<String> getNameByCourse(String coursename){
		return repository.nameByCourse(coursename);
	}
	
	public List<String> getTop(){
		return repository.topInCourse();
	}
	
	public List<Object[]> failedInSub(){
		return repository.failedInSub();
	}
	
	public List<Object[]> studentByState(){
		return repository.studentByState();
	}
	
	public List<String> ageGreaterThan(){
		return repository.ageGreaterThan();
	}
	
}
