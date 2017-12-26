package com.niit.dao;

import com.niit.model.User;

public interface UserDao 
{
	public void registerUser(User user);
	boolean IsEmailValid(String email);
	boolean IsUsernameValid(String username);
	public User login(User user);
	public void updateUser(User validUser);
	User getUserByUsername(String username);
}
