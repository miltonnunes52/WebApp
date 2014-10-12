package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.TransformationLevel;

public interface TransformationLevelHomeInt {

	void persist(TransformationLevel transientInstance);

	void attachDirty(TransformationLevel instance);

	void attachClean(TransformationLevel instance);

	void delete(TransformationLevel persistentInstance);

	TransformationLevel merge(TransformationLevel detachedInstance);

	TransformationLevel findById(java.lang.Integer id);

	List<TransformationLevel> findByExample(TransformationLevel instance);

}