package com.employees.control;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.employees.control.Controller.EmployeeStub;
import com.employees.control.Model.Employee;


public class EmployeeControllerTest {

	@Test
	public void IsEmployeeListNotNull() {
		EmployeeStub es = new EmployeeStub();
		List<Employee> list = new ArrayList<Employee>();
		list = EmployeeStub.list();
		
		//assert that the list is not null 
		assertNotNull(list);
		//and that is equal to four elements
		assertThat(list.size(), is(4));
		
	}

}
