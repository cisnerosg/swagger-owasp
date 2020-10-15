package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeService {
	
	public Employee getEmployeebyId(Integer id) {
		List<Employee> list = getEmployees();
		Employee e = list.stream().filter((user) -> user.getId() == id).findAny().get();
		return e;
	}
	
	
	public List<Employee> getEmployees(){
		List<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1, "Juan", "Martinez", "juan@gmail.com");
		Employee e2 = new Employee(2, "Marcelo", "Perez", "marcelo@gmail.com");
		
		list.add(e1);
		list.add(e2);
		
		return list;
		
	}

}
