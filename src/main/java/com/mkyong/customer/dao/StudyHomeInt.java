package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.Study;

public interface StudyHomeInt {

	void persist(Study transientInstance);

	void attachDirty(Study instance);

	void attachClean(Study instance);

	void delete(Study persistentInstance);

	Study merge(Study detachedInstance);

	Study findById(java.lang.Integer id);

	List<Study> findByExample(Study instance);

}