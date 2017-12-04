package com.ECommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommerce.dao.CustomerDao;
import com.ECommerce.model.Customer;
import com.ECommerce.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	CustomerDao customerDao;

	public void addCustomer(Customer customer) 
	{
		customerDao.addCustomer(customer);
		
		
	}
	
}
