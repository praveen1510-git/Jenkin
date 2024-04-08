package com.rock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RockController {
	
	
	@GetMapping(value = "/got")
	public String hi() {
		return "how are you";
	}

}
