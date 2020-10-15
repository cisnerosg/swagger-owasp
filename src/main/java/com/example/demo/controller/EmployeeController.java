package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
@Tag(name = "EmployeeController")
public class EmployeeController {
	
	@Autowired
	EmployeeService eservice;
	
	@RequestMapping("/healthCheck")
	public ResponseEntity<String> gethealthCheck() {
		return ResponseEntity.ok("DemoApplication OK!");
	}
	
	@Operation(summary = "Get employees", description = "Get employees demo")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK"),
			@ApiResponse(responseCode = "401", description = "Unauthorized"),
			@ApiResponse(responseCode = "403", description = "Forbidden"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error")
	})
	@RequestMapping("/employees")
	public ResponseEntity<List<Employee>> getEmployees(){
		return  ResponseEntity.ok(eservice.getEmployees()); 
	}
	
	@Operation(summary = "Get employee by id", description = "Get employee by id")
	@RequestMapping("/employee/{id}")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK"),
			@ApiResponse(responseCode = "401", description = "Unauthorized"),
			@ApiResponse(responseCode = "403", description = "Forbidden"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error")
	})
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id){
		return  ResponseEntity.ok(eservice.getEmployeebyId(id)); 
	}
	
}
