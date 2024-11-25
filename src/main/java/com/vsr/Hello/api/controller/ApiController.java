package com.vsr.Hello.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@GetMapping("/get")
	public ResponseEntity<String> welcome(){
		
		return new ResponseEntity<>("WELCOME TO HELLO API", HttpStatus.OK);
	}

}
