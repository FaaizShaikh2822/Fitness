package com.ECommerce.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ECommerce.dao.CustomerDao;
import com.ECommerce.model.Customer;

@Transactional
@Repository
public class CustomerDaoImpl implements CustomerDao
{
	SessionFactory sessionFactory;
	
	public void addCustomer(Customer customer) 
	{
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
		
	}

	

}
