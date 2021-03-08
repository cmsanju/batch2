package com.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	
	@RequestMapping("/")
	public String showHomepage()
	{
		return "home";
	}
	
	@RequestMapping("/showLoginPage")
	public String showLoginPage()
	{
		return "login";
	}
	
	@RequestMapping("/showRegistrationPage")
	public String showRegPage()
	{
		return "Say Hello";
	}
	
	@PostMapping("/showLoginPage")
	public void submitLoginPgae(HttpServletRequest request)
	{
		String name = request.getParameter("fname");
		System.out.println(name);
	}

}
