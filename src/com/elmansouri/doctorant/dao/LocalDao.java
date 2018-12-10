package com.elmansouri.doctorant.dao;

import java.util.List;

import javax.ejb.Local;

@Local
public interface LocalDao<T> {

	public void add(T t);
	public void edit(T t);
	public void delete(T t);
	public T find(long id);
	public List<T> getAll();
	
}