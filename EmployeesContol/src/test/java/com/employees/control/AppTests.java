package com.employees.control;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.employees.control.Controller.HomeController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTests {

	@Test
	public void isHomeControllerRunning() {
		HomeController homeCtrl = new HomeController();
		String result = homeCtrl.home();
		assertEquals(result, "Employee Control Reporter");
		
	}

}
