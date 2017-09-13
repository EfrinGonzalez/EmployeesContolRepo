package com.employees.control;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.employees.control.Controller.EmployeeStub;
import com.employees.control.Model.Employee;


public class EmployeeControllerTest {

	@Test
	public void IsEmployeeListNotNull() {
		EmployeeStub es = new EmployeeStub();
		List<Employee> list = new ArrayList<Employee>();
		list = EmployeeStub.list();
		//assert that the list is not null and that is equal to four elements
	}

}
