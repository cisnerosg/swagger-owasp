package com.example.demo.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.model.Employee;

@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService eservice;
	
	@Test
	public void getEmployeesTest(){
		List<Employee> list = eservice.getEmployees();
		assertEquals(2, list.size());
	}
	
	@Test
	public void getEmployeeByIdTest(){
		Employee e = eservice.getEmployeebyId(1);
		assertEquals(1, e.getId());
	}
	
}
