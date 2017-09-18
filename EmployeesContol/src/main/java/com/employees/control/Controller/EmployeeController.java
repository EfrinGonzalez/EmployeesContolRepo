package com.employees.control.Controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employees.control.Model.Employee;
import com.employees.control.Respository.EmployeeRepository;
@RestController
@RequestMapping("api/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping(value = "employees", method = RequestMethod.GET)
	public List<Employee> list(){
		//return EmployeeStub.list();
		return employeeRepository.findAll();
	}
	
	@RequestMapping(value = "employees/{id}", method = RequestMethod.GET)
	public Employee get(@PathVariable Long id) {
		//return EmployeeStub.findOne(id);
		return employeeRepository.findOne(id);
	}
	

	
	@RequestMapping(value = "employees", method = RequestMethod.POST)
	public Employee create(@RequestBody Employee employee) {
		//return EmployeeStub.create();
		return employeeRepository.saveAndFlush(employee);
	}
	
	


	@RequestMapping(value = "employees/{id}", method = RequestMethod.PUT)
	public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
		Employee existingEmployee = employeeRepository.findOne(id);
		BeanUtils.copyProperties(employee, existingEmployee);
		return employeeRepository.saveAndFlush(existingEmployee);
	}
	
	@RequestMapping(value = "employees/{id}", method = RequestMethod.DELETE)
	public Employee delete(@PathVariable Long id) {
		Employee existingEmployee = employeeRepository.findOne(id);
		employeeRepository.delete(existingEmployee);
		return existingEmployee;
	}

}
