package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.RealBoInt;
import com.mkyong.customer.dao.RealHomeInt;
import com.mkyong.customer.model.Real;

public class RealBo implements RealBoInt {

	RealHomeInt realHomeInt;

	public void setRealHomeInt(RealHomeInt realHomeInt) {
		this.realHomeInt = realHomeInt;
	}

	@Override
	public void persist(Real transientInstance) {
		realHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(Real instance) {
		realHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(Real instance) {
		realHomeInt.attachClean(instance);
	}

	@Override
	public void delete(Real persistentInstance) {
		realHomeInt.delete(persistentInstance);
	}

	@Override
	public Real merge(Real detachedInstance) {
		return realHomeInt.merge(detachedInstance);

	}

	@Override
	public Real findById(Integer id) {
		return realHomeInt.findById(id);
	}

	@Override
	public List<Real> findByExample(Real instance) {
		return realHomeInt.findByExample(instance);
	}

}