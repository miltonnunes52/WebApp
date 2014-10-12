package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.Tests;

public interface TestsHomeInt {

	void persist(Tests transientInstance);

	void attachDirty(Tests instance);

	void attachClean(Tests instance);

	void delete(Tests persistentInstance);

	Tests merge(Tests detachedInstance);

	Tests findById(java.lang.Integer id);

	List<Tests> findByExample(Tests instance);

}