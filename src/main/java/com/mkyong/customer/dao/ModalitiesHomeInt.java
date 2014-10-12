package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.Modalities;

public interface ModalitiesHomeInt {

	void persist(Modalities transientInstance);

	void attachDirty(Modalities instance);

	void attachClean(Modalities instance);

	void delete(Modalities persistentInstance);

	Modalities merge(Modalities detachedInstance);

	Modalities findById(java.lang.Integer id);

	List<Modalities> findByExample(Modalities instance);

}