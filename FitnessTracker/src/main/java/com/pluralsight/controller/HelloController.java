package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
	
	@RequestMapping(value ="/greeting") // http://localhost:8080/FitnessTracker/hello.html
	public String sayHello (Model model) { 
		model.addAttribute("greeting", "Hello World");
		return "hello"; // this is view file name	
	}
}
