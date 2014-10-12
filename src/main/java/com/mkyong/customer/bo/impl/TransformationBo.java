package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.TransformationBoInt;
import com.mkyong.customer.dao.TransformationHomeInt;
import com.mkyong.customer.model.Transformation;

public class TransformationBo implements TransformationBoInt {

	TransformationHomeInt transformationHomeInt;

	public void setTransformationHomeInt(
			TransformationHomeInt transformationHomeInt) {
		this.transformationHomeInt = transformationHomeInt;
	}

	@Override
	public void persist(Transformation transientInstance) {
		transformationHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(Transformation instance) {
		transformationHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(Transformation instance) {
		transformationHomeInt.attachClean(instance);
	}

	@Override
	public void delete(Transformation persistentInstance) {
		transformationHomeInt.delete(persistentInstance);
	}

	@Override
	public Transformation merge(Transformation detachedInstance) {
		return transformationHomeInt.merge(detachedInstance);

	}

	@Override
	public Transformation findById(Integer id) {
		return transformationHomeInt.findById(id);
	}

	@Override
	public List<Transformation> findByExample(Transformation instance) {
		return transformationHomeInt.findByExample(instance);
	}

}