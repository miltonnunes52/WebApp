package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.TransformationLevelBoInt;
import com.mkyong.customer.dao.TransformationLevelHomeInt;
import com.mkyong.customer.model.TransformationLevel;

public class TransformationLevelBo implements TransformationLevelBoInt {

	TransformationLevelHomeInt transformationLevelHomeInt;

	public void setTransformationLevelHomeInt(
			TransformationLevelHomeInt transformationLevelHomeInt) {
		this.transformationLevelHomeInt = transformationLevelHomeInt;
	}

	@Override
	public void persist(TransformationLevel transientInstance) {
		transformationLevelHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(TransformationLevel instance) {
		transformationLevelHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(TransformationLevel instance) {
		transformationLevelHomeInt.attachClean(instance);
	}

	@Override
	public void delete(TransformationLevel persistentInstance) {
		transformationLevelHomeInt.delete(persistentInstance);
	}

	@Override
	public TransformationLevel merge(TransformationLevel detachedInstance) {
		return transformationLevelHomeInt.merge(detachedInstance);

	}

	@Override
	public TransformationLevel findById(Integer id) {
		return transformationLevelHomeInt.findById(id);
	}

	@Override
	public List<TransformationLevel> findByExample(TransformationLevel instance) {
		return transformationLevelHomeInt.findByExample(instance);
	}

}