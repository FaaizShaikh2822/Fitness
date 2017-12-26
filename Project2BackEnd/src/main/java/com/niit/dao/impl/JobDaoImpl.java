package com.niit.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.JobDao;
import com.niit.model.Job;

@Transactional
@Repository
public class JobDaoImpl implements JobDao
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveJob(Job job) 
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(job);
	}

}
