package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.ClassificationTagsBoInt;
import com.mkyong.customer.dao.ClassificationTagsHomeInt;
import com.mkyong.customer.model.ClassificationTags;

public class ClassificationTagsBo implements ClassificationTagsBoInt {

	ClassificationTagsHomeInt classificationTagsHomeInt;

	public void setClassificationTagsHomeInt(
			ClassificationTagsHomeInt classificationTagsHomeInt) {
		this.classificationTagsHomeInt = classificationTagsHomeInt;
	}

	@Override
	public void persist(ClassificationTags transientInstance) {
		classificationTagsHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(ClassificationTags instance) {
		classificationTagsHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(ClassificationTags instance) {
		classificationTagsHomeInt.attachClean(instance);
	}

	@Override
	public void delete(ClassificationTags persistentInstance) {
		classificationTagsHomeInt.delete(persistentInstance);
	}

	@Override
	public ClassificationTags merge(ClassificationTags detachedInstance) {
		return classificationTagsHomeInt.merge(detachedInstance);

	}

	@Override
	public ClassificationTags findById(Integer id) {
		return classificationTagsHomeInt.findById(id);
	}

	@Override
	public List<ClassificationTags> findByExample(ClassificationTags instance) {
		return classificationTagsHomeInt.findByExample(instance);
	}

}