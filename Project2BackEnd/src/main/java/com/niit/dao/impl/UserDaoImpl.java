package com.niit.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserDao;
import com.niit.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void registerUser(User user) 
	{
		Session session = sessionFactory.getCurrentSession();
		session.save(user);

	}

	public boolean IsEmailValid(String email) 
	{
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from user where email ='"+email+"'");
		User user = (User) query.uniqueResult();
		if(user==null)
		{
			return true;
		}
		else
		return false;
	}

	public boolean IsUsernameValid(String username)
	{
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.get(User.class,username);
		if(user==null)
		{
			return true;
		}
		else
		return false;
	}

	public User login(User user) 
	{
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from user where username=? and password=?");
		query.setString(0, user.getUsername());
		query.setString(1, user.getPassword());
		User validUser = (User) query.uniqueResult();
		return validUser;
	}

	public void updateUser(User user) 
	{
		Session session = sessionFactory.getCurrentSession();
		session.update(user);
		
	}

	public User getUserByUsername(String username)
	{
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.get(User.class, username);
		return user;
	}

}
