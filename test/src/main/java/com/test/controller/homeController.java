package com.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController 
{
	
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("message", "devops project");
		return"index";
	}
	@RequestMapping("/login")
	public String login(Model model)
	{
		model.addAttribute("k", "welcome to login page");
		return"login";
	}

	@RequestMapping("/register")
	public String register(Model model)
	{
		model.addAttribute("reg", "welcome to register page");
		return "register";
		
	}
	
	@RequestMapping("/Catagory")
	public String Catagory(Model model)
	{
		model.addAttribute("cat", "Choose Catagory");
		return "Catagory";
	}
}
