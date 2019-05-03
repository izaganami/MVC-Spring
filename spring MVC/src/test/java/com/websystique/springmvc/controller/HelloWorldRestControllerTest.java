package com.websystique.springmvc.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.websystique.springmvc.configuration.HelloWorldConfiguration;
import com.websystique.springmvc.configuration.HelloWorldInitializer;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { HelloWorldInitializer.class, HelloWorldConfiguration.class })
public class HelloWorldRestControllerTest {

	@Autowired
	private HelloWorldRestController helloRestController;

	@Test
	public void validateUser_Test_Positive() 
{
	Map params = new HashMap();
	params.put("email", "admin@admin.com");
	params.put("password","admin");
	InnerPerson result = helloRestController.sayHelloAgain();
	assertNotNull(result);
	assertEquals(result.getStatusCode(), HttpStatus.OK);
	}
}