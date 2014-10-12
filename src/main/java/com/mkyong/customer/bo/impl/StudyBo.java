package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.StudyBoInt;
import com.mkyong.customer.dao.StudyHomeInt;
import com.mkyong.customer.model.Study;

public class StudyBo implements StudyBoInt {

	StudyHomeInt studyHomeInt;

	public void setStudyHomeInt(StudyHomeInt studyHomeInt) {
		this.studyHomeInt = studyHomeInt;
	}

	@Override
	public void persist(Study transientInstance) {
		studyHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(Study instance) {
		studyHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(Study instance) {
		studyHomeInt.attachClean(instance);
	}

	@Override
	public void delete(Study persistentInstance) {
		studyHomeInt.delete(persistentInstance);
	}

	@Override
	public Study merge(Study detachedInstance) {
		return studyHomeInt.merge(detachedInstance);

	}

	@Override
	public Study findById(Integer id) {
		return studyHomeInt.findById(id);
	}

	@Override
	public List<Study> findByExample(Study instance) {
		return studyHomeInt.findByExample(instance);
	}

}