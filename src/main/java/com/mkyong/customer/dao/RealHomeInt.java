package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.Real;

public interface RealHomeInt {

	void persist(Real transientInstance);

	void attachDirty(Real instance);

	void attachClean(Real instance);

	void delete(Real persistentInstance);

	Real merge(Real detachedInstance);

	Real findById(java.lang.Integer id);

	List<Real> findByExample(Real instance);

}