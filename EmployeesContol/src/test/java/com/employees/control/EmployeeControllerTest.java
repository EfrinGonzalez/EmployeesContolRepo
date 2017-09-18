package com.employees.control;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.employees.control.Controller.EmployeeController;
import com.employees.control.Controller.EmployeeStub;
import com.employees.control.Model.Employee;
import com.employees.control.Respository.EmployeeRepository;


public class EmployeeControllerTest {

	@InjectMocks
	private EmployeeController ec;
	
	@Mock
	private EmployeeRepository  employeeRepository;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void testEmployeeGet(){
		Employee em = new Employee();
		em.setId(1L);
		when(employeeRepository.findOne(1L)).thenReturn(em);
		
		Employee employee = ec.get(1L);
		
		verify(employeeRepository).findOne(1L);
		
		assertEquals(1L, employee.getId().longValue());
		assertThat(em.getId(), is(1L));
	}
	
	
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
