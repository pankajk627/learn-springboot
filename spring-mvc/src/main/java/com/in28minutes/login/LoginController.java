package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	//LoginService service = new LoginService();
	@Autowired
	LoginService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		boolean isValidUser = service.validateUser(name, password);
		if(isValidUser) {
		model.put("name", name);
		return "welcome";
		}
		
		else {
			model.put("errorMessage", "Invalid Credentials!");
			return "login";
		}
	}

}
