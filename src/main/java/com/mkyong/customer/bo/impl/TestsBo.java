package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.TestsBoInt;
import com.mkyong.customer.dao.TestsHomeInt;
import com.mkyong.customer.model.Tests;

public class TestsBo implements TestsBoInt {

	TestsHomeInt testsHomeInt;

	public void setTestsHomeInt(TestsHomeInt testsHomeInt) {
		this.testsHomeInt = testsHomeInt;
	}

	@Override
	public void persist(Tests transientInstance) {
		testsHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(Tests instance) {
		testsHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(Tests instance) {
		testsHomeInt.attachClean(instance);
	}

	@Override
	public void delete(Tests persistentInstance) {
		testsHomeInt.delete(persistentInstance);
	}

	@Override
	public Tests merge(Tests detachedInstance) {
		return testsHomeInt.merge(detachedInstance);

	}

	@Override
	public Tests findById(Integer id) {
		return testsHomeInt.findById(id);
	}

	@Override
	public List<Tests> findByExample(Tests instance) {
		return testsHomeInt.findByExample(instance);
	}

}