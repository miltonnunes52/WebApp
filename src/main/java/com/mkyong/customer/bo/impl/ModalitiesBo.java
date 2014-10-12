package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.ModalitiesBoInt;
import com.mkyong.customer.dao.ModalitiesHomeInt;
import com.mkyong.customer.model.Modalities;

public class ModalitiesBo implements ModalitiesBoInt {

	ModalitiesHomeInt modalitiesHomeInt;

	public void setModalitiesHomeInt(ModalitiesHomeInt modalitiesHomeInt) {
		this.modalitiesHomeInt = modalitiesHomeInt;
	}

	@Override
	public void persist(Modalities transientInstance) {
		modalitiesHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(Modalities instance) {
		modalitiesHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(Modalities instance) {
		modalitiesHomeInt.attachClean(instance);
	}

	@Override
	public void delete(Modalities persistentInstance) {
		modalitiesHomeInt.delete(persistentInstance);
	}

	@Override
	public Modalities merge(Modalities detachedInstance) {
		return modalitiesHomeInt.merge(detachedInstance);

	}

	@Override
	public Modalities findById(Integer id) {
		return modalitiesHomeInt.findById(id);
	}

	@Override
	public List<Modalities> findByExample(Modalities instance) {
		return modalitiesHomeInt.findByExample(instance);
	}

}