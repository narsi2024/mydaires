package com.org.jsp.mydairy.business;

import java.util.List;

import com.org.jsp.mydairy.entities.Entry;

public interface EntryInterfaceBusiness
{

	public void save(Entry entry);
	public void update(Entry entry);
	public void delete(Entry entry);
	public List<Entry> findAll( Entry user);
	public List<Entry> findByUserid(int id);
	public Entry findById(int id);
}
