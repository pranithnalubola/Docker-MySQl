package com.springboot.sampleProject.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.sampleProject.model.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}

