package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.DataContext;

public interface DataContextHomeInt {

	void persist(DataContext transientInstance);

	void attachDirty(DataContext instance);

	void attachClean(DataContext instance);

	void delete(DataContext persistentInstance);

	DataContext merge(DataContext detachedInstance);

	DataContext findById(java.lang.Integer id);

	List<DataContext> findByExample(DataContext instance);

}