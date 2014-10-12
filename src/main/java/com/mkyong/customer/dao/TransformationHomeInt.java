package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.Transformation;

public interface TransformationHomeInt {

	void persist(Transformation transientInstance);

	void attachDirty(Transformation instance);

	void attachClean(Transformation instance);

	void delete(Transformation persistentInstance);

	Transformation merge(Transformation detachedInstance);

	Transformation findById(java.lang.Integer id);

	List<Transformation> findByExample(Transformation instance);

}