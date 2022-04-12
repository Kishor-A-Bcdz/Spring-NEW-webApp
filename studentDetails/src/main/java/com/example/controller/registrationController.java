package com.example.controller;

import com.example.model.registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class registrationController {
	@GetMapping("registration")
	public String getRegistration(@ModelAttribute("registrations") registration registration) {

		return "registration";
	}

	@PostMapping("registration")
	public String addRegistration(@Valid @ModelAttribute("registrations") registration registration, BindingResult result) {

		if (result.hasErrors()) {
			System.out.println("there were errors");
			return "registration";
		}
		System.out.println("Registration  :" + registration.getName());
		return "redirect:registration";
	}
}
