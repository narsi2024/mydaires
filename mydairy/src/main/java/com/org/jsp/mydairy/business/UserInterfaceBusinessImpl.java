package com.org.jsp.mydairy.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.org.jsp.mydairy.dao.UserInterfaceDao;
import com.org.jsp.mydairy.entities.User;

@Component
public class UserInterfaceBusinessImpl implements UserInterfaceBusiness
{
	  public UserInterfaceDao getUserInterfaceDao() {
		return userInterfaceDao;
	}

	public void setUserInterfaceDao(UserInterfaceDao userInterfaceDao) {
		this.userInterfaceDao = userInterfaceDao;
	}

	@Autowired
	  private UserInterfaceDao userInterfaceDao;
	
	@Transactional(readOnly = false)
	public void save(User user) 
	{
		userInterfaceDao.save(user);
	}
	@Transactional(readOnly = false)
	public void update(User user) 
	{
		userInterfaceDao.update(user);
	}
	@Transactional(readOnly = false)
	public void delete(User user) 
	{
		userInterfaceDao.delete(user);
	}

	public List<User> findAll(User user)
	{
		
		return userInterfaceDao.findAll(user);
	}

	public User findByUsername(String username) 
	{
		return userInterfaceDao.findByUsername(username);
	}

}
