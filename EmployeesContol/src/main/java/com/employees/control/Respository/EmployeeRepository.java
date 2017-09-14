package com.employees.control.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employees.control.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
}
