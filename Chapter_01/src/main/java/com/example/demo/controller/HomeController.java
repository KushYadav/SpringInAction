package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")   //Handles request for root path
	public String home() {  
		return "home";   //Return the view name
	}
}
