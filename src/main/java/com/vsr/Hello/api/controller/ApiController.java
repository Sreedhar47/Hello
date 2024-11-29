package com.vsr.Hello.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vsr.Hello.api.model.Employee;

//Swagger UI: http://localhost:8080/swagger-ui.html	
//OpenAPI JSON: http://localhost:8080/v3/api-docs

@RestController
@CrossOrigin(origins = "*") // Allow all origins
public class ApiController {
	
	@GetMapping("/get")
	public ResponseEntity<String> welcome(){
		return new ResponseEntity<>("WELCOME TO HELLO API", HttpStatus.OK);
	}

	@GetMapping("/employee/get")
	public ResponseEntity<Employee> getEnployee(){
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Sreedhar");
		employee.setAge(18);
		
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	
	 @PostMapping("/employee/insert")
	    public ResponseEntity<Employee> insertData(@RequestBody Employee payload) {
	       System.out.println(payload.getName());
		 return new ResponseEntity<>(payload, HttpStatus.OK);
	    }
	
	
}
