package com.pluralsight.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pluralsight.model.Exercise;

@Controller
public class MinutesController {
	
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		System.out.println("exercise: " + exercise.getMinutes());
//		return "redirect:addMoreMinutes.html";	// start new and forget session data or reinitial model data
//		return "forward:addMoreMinutes.html";	// keep old just call addMoreFunc	
		return "addMinutes"; // normal case
	}// continue to other
	
	@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		System.out.println("exercising: " + exercise.getMinutes());
		return "addMinutes";
}
	}
