package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDao;
import com.test.model.User;
import com.test.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserDao userDao;
	
	public void addUser(User user)
	{
		userDao.addUser(user);
		
	}

}
