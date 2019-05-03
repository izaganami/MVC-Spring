package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.developerstack.service.UserService;

@Controller
@RequestMapping("/yassin")
public class HelloWorldController {
@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		return "welcomeYassine";
	}
}
public void validateUser(Map user, HttpServletRequest request) {
		String userName = user.get("email");
		String password = user.get("password");
		
	private UserService userService; = userService.findUserByEmail(email);
		if(userDetails == null || !userDetails.getPassword().equals(password)) {
			throw new RuntimeException("Invalid credentials.");
		}
		return userDetails;
		}
	}