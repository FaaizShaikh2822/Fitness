package com.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.Dao.UserDao;

public class UserDaoImpl implements UserDao
{
	@Autowired
	SessionFactory sessionFac;
	
	public void insertUser(UserDao user)
	{
		Session session= sessionFac.openSession(); 
		session.beginTransaction();
		session.persist(user);
		session.getTransaction().commit();
	}
	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory)
	{
		super();
		sessionFac = sessionFactory;
	}
	
}
