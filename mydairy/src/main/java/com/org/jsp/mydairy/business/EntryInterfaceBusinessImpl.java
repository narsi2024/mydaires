package com.org.jsp.mydairy.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.org.jsp.mydairy.dao.EntryInterfaceDao;
import com.org.jsp.mydairy.entities.Entry;

@Component
public class EntryInterfaceBusinessImpl implements EntryInterfaceBusiness
{
	@Autowired
	 private EntryInterfaceDao entryInterfaceDao;
	
	
	public EntryInterfaceDao getEntryInterfaceDao() {
		return entryInterfaceDao;
	}

	public void setEntryInterfaceDao(EntryInterfaceDao entryInterfaceDao) {
		this.entryInterfaceDao = entryInterfaceDao;
	}

	
	@Transactional(readOnly = false)
	public void save(Entry entry)
	{
		entryInterfaceDao.save(entry);
	}
	
	@Transactional(readOnly = false)
	public void update(Entry entry)
	{
		entryInterfaceDao.update(entry);
	}
	
	@Transactional(readOnly = false)
	public void delete(Entry entry) 
	{
		entryInterfaceDao.delete(entry);
		
	}

	public List<Entry> findAll(Entry entry) 
	{
		return entryInterfaceDao.findAll(entry);
	}

	public List<Entry> findByUserid(int id) {
		
		
		return entryInterfaceDao.findByUserid(id);
	}
	@Transactional(readOnly = false)
	public Entry findById(int id)
	{
		// TODO Auto-generated method stub
		return entryInterfaceDao.findById(id);
	}

}
