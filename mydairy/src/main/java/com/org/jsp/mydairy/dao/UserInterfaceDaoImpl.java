package com.org.jsp.mydairy.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.org.jsp.mydairy.entities.User;

@Component
public class UserInterfaceDaoImpl implements UserInterfaceDao
{	
     @Autowired
	 private HibernateTemplate  hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional(readOnly = false)
	public void save(User user) 
	{
		hibernateTemplate.save(user);
		
	}
	@Transactional(readOnly = false)
	public void update(User user) 
	{
		hibernateTemplate.update(user);
	}
	@Transactional(readOnly = false)
	public void delete(User user)
	{
		hibernateTemplate.delete(user);
	}

	public List<User> findAll(User user)
	{
		return hibernateTemplate.loadAll(User.class);
	}

	public User findByUsername(String username) 
	{
		
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		criteria.add(Restrictions.eq("username", username));
		User user =null;
		
		try {
			 user	=(User) hibernateTemplate.findByCriteria(criteria).get(0);
		     } 
		catch (Exception e) 
		{
			e.printStackTrace();    	 
		}
		

		return user;
	    
		
	}

}
