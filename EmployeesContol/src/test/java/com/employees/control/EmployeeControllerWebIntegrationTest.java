package com.employees.control;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

//import com.boot.App;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/*TODO: Notice that with this two annotations the application fails. Check why?
 * While, whit the other annotation below is runs OK.*/
//@RunWith(SpringRunner.class)
//@SpringBootTest

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
@WebIntegrationTest

public class EmployeeControllerWebIntegrationTest {

	@Test
	public void testListAll() throws IOException {
		TestRestTemplate restTemplate = new TestRestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/api/v1/employees", String.class);

	    assertThat( response.getStatusCode() , equalTo(HttpStatus.OK));

	    ObjectMapper objectMapper = new ObjectMapper();
	    JsonNode responseJson = objectMapper.readTree(response.getBody());

	    assertThat( responseJson.isMissingNode() , is(false) );
	    //assertThat( responseJson.toString() , equalTo("[]") );
		
	}


}
