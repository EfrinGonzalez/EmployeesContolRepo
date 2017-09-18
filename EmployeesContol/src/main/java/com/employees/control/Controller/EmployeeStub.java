package com.employees.control.Controller;

import java.util.ArrayList;
import java.util.List;

import com.employees.control.Model.Employee;

public class EmployeeStub {

	static List<Employee> employeeList;
	
	public EmployeeStub(){
		
	}
	
	public static List<Employee> list(){
		employeeList = new ArrayList<Employee>();
		
		Employee e0 = new Employee(0L, "cero");
		employeeList.add(e0);
		Employee e1 = new Employee(1L, "uno");
		employeeList.add(e1);
		Employee e2 = new Employee(2L, "dos");
		employeeList.add(e2);
		Employee e3 = new Employee(3L, "tres");
		employeeList.add(e3);
		return employeeList;
	}

	public static Employee create() {
		Employee e4 = new Employee(4L, "cuatro");
		employeeList.add(e4);
		return e4;
		
	}

	public static Employee findOne(int id) {
		return employeeList.get(id);
	}
}
