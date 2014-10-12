package com.mkyong.customer.bo;

import java.util.List;

import com.mkyong.customer.model.Real;

public interface RealBoInt {

	void persist(Real transientInstance);

	void attachDirty(Real instance);

	void attachClean(Real instance);

	void delete(Real persistentInstance);

	Real merge(Real detachedInstance);

	Real findById(java.lang.Integer id);

	List<Real> findByExample(Real instance);

}