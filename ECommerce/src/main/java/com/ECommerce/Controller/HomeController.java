package com.ECommerce.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ECommerce.model.Customer;

@Controller
public class HomeController
{
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() 
	{
		return "index";
	}
	

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) 
	{
		Customer customer = new Customer();
		model.addAttribute("Customer", customer);
		return "register";
	}
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String cart() 
	{
		return "cart";
	}
	

	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public String checkout() 
	{
		return "checkout";
	}
	

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String product() 
	{
		return "products";
	}
	

	@RequestMapping(value = "/product_details", method = RequestMethod.GET)
	public String product_details() 
	{
		return "product_details";
	}
	

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contact() 
	{
		return "contact";
	}
	
	
}
