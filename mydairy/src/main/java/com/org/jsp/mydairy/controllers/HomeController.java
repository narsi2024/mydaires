package com.org.jsp.mydairy.controllers;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.jsp.mydairy.business.EntryInterfaceBusiness;
import com.org.jsp.mydairy.business.UserInterfaceBusiness;
import com.org.jsp.mydairy.entities.Entry;
import com.org.jsp.mydairy.entities.User;




@Controller
public class HomeController 
{
	@Autowired
	HttpSession session;
	@Autowired
	private UserInterfaceBusiness userInterfaceBusiness;
	
	
	public EntryInterfaceBusiness getEntryInterfaceBusiness() {
		return entryInterfaceBusiness;
	}

	public void setEntryInterfaceBusiness(EntryInterfaceBusiness entryInterfaceBusiness) {
		this.entryInterfaceBusiness = entryInterfaceBusiness;
	}
	@Autowired
	private EntryInterfaceBusiness entryInterfaceBusiness;
	
	public UserInterfaceBusiness getUserInterfaceBusiness() {
		return userInterfaceBusiness;
	}

	public void setUserInterfaceBusiness(UserInterfaceBusiness userInterfaceBusiness) {
		this.userInterfaceBusiness = userInterfaceBusiness;
	}

	@RequestMapping("home")
	public ModelAndView homePageMethod()
	{
		ModelAndView model= new ModelAndView("register");
		
		
		return model;	
		
	}
	
	@RequestMapping("saveuser")
	public ModelAndView saves(@ModelAttribute("user") User user)
	{
		ModelAndView model= new ModelAndView("login");
		
		userInterfaceBusiness.save(user);
		
		
		return model;	
		
	}
	@RequestMapping("authenticate")
	public ModelAndView auth(@ModelAttribute("user") User user)
	{
		ModelAndView model= new ModelAndView("login");
		
		User datauser= userInterfaceBusiness.findByUsername(user.getUsername());
		
		if (datauser!=null && user.getPassword().equals(datauser.getPassword()))
			
		{
			
			model.setViewName("loggedinpage");
			model.addObject("user", datauser);
			session.setAttribute("user", datauser);
			
			
		}
		List<Entry> entries=null;
		
		
		
		try
		{
			entries=entryInterfaceBusiness.findByUserid(datauser.getId());
			System.out.println(datauser.getId());
			
			
			
			model.addObject("entri", entries);
				
		} 
		catch (Exception e)
		{
			e.printStackTrace();	
		}	
		
		
		
		
	
		return model;	
		
	}
	@RequestMapping("saveentry")
	public ModelAndView saveentry()
	{
		ModelAndView model= new ModelAndView("entryform");
		
		return model;	
		
	}
	@RequestMapping("viewentry")
	public ModelAndView viewentry(@RequestParam("id") int id)
	{
		ModelAndView model=new ModelAndView("viewentry");
		
		Entry entry = entryInterfaceBusiness.findById(id);
		
		model.addObject("entry", entry);
		
		return model;
	}
	
	
	
	
	
	
	
	
	
	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}

	@RequestMapping("addentry")
	public ModelAndView addentry(@ModelAttribute("entry") Entry entry)
	{
		ModelAndView model= new ModelAndView("loggedinpage");
		
		entryInterfaceBusiness.save(entry);
				User user1 =(User) session.getAttribute("user");
          List<Entry> entries=null;
		
		
		
		try
		{
			entries=entryInterfaceBusiness.findByUserid(user1.getId());
			
			
			
			
			model.addObject("entri", entries);
				
		} 
		catch (Exception e)
		{
			e.printStackTrace();	
		}	
		
		
		return model;	
		
	}
	
	
	
	
	
}
