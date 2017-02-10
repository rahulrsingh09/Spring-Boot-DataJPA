 package com.rahulweb.spring.springdatajapa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

	
	@GetMapping("/home")
	public String home(@RequestParam(value = "value", required = false, defaultValue = "Rahul")String name,Model model){
		model.addAttribute("name", name);
		return "index";
	}
	

	
}
