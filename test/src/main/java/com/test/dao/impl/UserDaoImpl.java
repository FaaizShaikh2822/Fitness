package com.test.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.UserDao;
import com.test.model.User;

@Transactional
@Repository
public class UserDaoImpl implements UserDao
{
	@Autowired
	SessionFactory sessionfactory;

	public void addUser(User user)
	{
		Session session = sessionfactory.getCurrentSession();
		session.saveOrUpdate(user);
		
	}

}
