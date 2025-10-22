package com.springboot.sampleProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sampleProject.model.Employee;
import com.springboot.sampleProject.repository.EmployeeRepository;

@RestController
public class EmpController {
	
	@Autowired
    private EmployeeRepository repository;
	
	 @GetMapping("/")
	    public List<Employee> getAllEmployees() {
	        return repository.findAll();
	    }

}
