package com.example.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class greetingControllerimplementation {
	@GetMapping("greeting")
	public String greeting(Map<String, Object>model){
		model.put("message", "heloo kishor");
		System.out.println("hai");
		return "greeting";
		
	}

}
