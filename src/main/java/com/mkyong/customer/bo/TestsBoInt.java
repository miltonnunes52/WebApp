package com.mkyong.customer.bo;

import java.util.List;

import com.mkyong.customer.model.Tests;

public interface TestsBoInt {

	void persist(Tests transientInstance);

	void attachDirty(Tests instance);

	void attachClean(Tests instance);

	void delete(Tests persistentInstance);

	Tests merge(Tests detachedInstance);

	Tests findById(java.lang.Integer id);

	List<Tests> findByExample(Tests instance);

}