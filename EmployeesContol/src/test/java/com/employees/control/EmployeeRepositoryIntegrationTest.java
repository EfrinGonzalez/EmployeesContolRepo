package com.employees.control;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.employees.control.Model.Employee;
import com.employees.control.Respository.EmployeeRepository;

/*Documentation 
 * https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/test/context/junit4/SpringRunner.html
 * https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/context/SpringBootTest.html
 * */

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepositoryIntegrationTest {

	@Autowired
	private EmployeeRepository employeeRepository; 
	@Test
	public void testFindAll() {
		List<Employee> employees = employeeRepository.findAll();
		assertThat(employees.size(), is(greaterThanOrEqualTo(0)));
	}

}
