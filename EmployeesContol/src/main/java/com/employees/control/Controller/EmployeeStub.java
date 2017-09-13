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
		
		Employee e0 = new Employee(0, "cero");
		employeeList.add(e0);
		Employee e1 = new Employee(1, "uno");
		employeeList.add(e1);
		Employee e2 = new Employee(2, "dos");
		employeeList.add(e2);
		Employee e3 = new Employee(3, "tres");
		employeeList.add(e3);
		return employeeList;
	}

	public static Employee create() {
		Employee e4 = new Employee(4, "cuatro");
		employeeList.add(e4);
		return e4;
		
	}

	public static Employee findOne(int id) {
		return employeeList.get(id);
	}
}
