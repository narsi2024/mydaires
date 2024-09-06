package com.org.jsp.mydairy.dao;

import java.util.List;

import com.org.jsp.mydairy.entities.Entry;

public interface EntryInterfaceDao
{

	public void save(Entry entry);
	public void update(Entry entry);
	public void delete(Entry entry);
	public List<Entry> findAll( Entry entry);
	public List<Entry> findByUserid(int id);
	public Entry findById(int id);
	
}
