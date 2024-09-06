package com.org.jsp.mydairy.business;

import java.util.List;

import com.org.jsp.mydairy.entities.User;

public interface UserInterfaceBusiness
{
	public void save(User user);
	public void update(User user);
	public void delete(User user);
	public List<User> findAll( User user);
	public User findByUsername(String username);
	
}
