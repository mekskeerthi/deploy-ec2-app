package com.learn.deployec2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/home")
	public Object home() {
		Map<String, String> object = new HashMap<>();
		object.put("name", "Tom");
		object.put("email", "tom@gmail.com");
		System.out.println("Hai .. Controller");
		return object;
	}

}
