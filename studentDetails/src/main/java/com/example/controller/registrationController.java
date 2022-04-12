package com.example.controller;

import com.example.model.registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class registrationController {
@GetMapping("registration")
public String getRegistration(@ModelAttribute("registrations") registration registration) {
	
	return "registration";
}
@PostMapping("registration")
public String addRegistration(@ModelAttribute ("registrations")registration registration) {
	System.out.println("Registration  :"+ registration.getName());
	return "registration";
}
}
