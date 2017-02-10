package com.rahulweb.spring.springdatajapa.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rahulweb.spring.springdatajapa.service.Service;

@RestController
public class TestController {

	@Autowired
	private Service service;
	

	@GetMapping("/studentpassedinallsub")
	public String studentPassedInCourse(@RequestParam("name") String coursename){
		//return service.customValue(id);
		return Arrays.deepToString(service.passedInCourse(coursename).toArray());
	}
	
	@GetMapping("/studentbycourse")
	public String studentByCourse(@RequestParam("name") String coursename){
		//return service.customValue(id);
		return Arrays.deepToString(service.getNameByCourse(coursename).toArray());
	}
	
	
	@GetMapping("/topInCourse")
	public String topByCourse(){
		return Arrays.deepToString(service.getTop().toArray());
	}
	
	@GetMapping("/failedInSub")
	public String failedInSub(){
		return Arrays.deepToString(service.failedInSub().toArray());
	}
	
	@GetMapping("/studentByState")
	public String studentByState(){

		return Arrays.deepToString(service.studentByState().toArray());
	}
	
	@GetMapping("/ageGreaterThan")
	public String ageGreaterThan(){

		return Arrays.deepToString(service.ageGreaterThan().toArray());
	}
	
	
	
}
