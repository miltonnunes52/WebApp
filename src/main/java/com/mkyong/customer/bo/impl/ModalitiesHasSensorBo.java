package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.ModalitiesHasSensorBoInt;
import com.mkyong.customer.dao.ModalitiesHasSensorHomeInt;
import com.mkyong.customer.model.ModalitiesHasSensor;
import com.mkyong.customer.model.ModalitiesHasSensorId;

public class ModalitiesHasSensorBo implements ModalitiesHasSensorBoInt {

	ModalitiesHasSensorHomeInt modalitiesHasSensorHomeInt;

	public void setModalitiesHasSensorHomeInt(
			ModalitiesHasSensorHomeInt modalitiesHasSensorHomeInt) {
		this.modalitiesHasSensorHomeInt = modalitiesHasSensorHomeInt;
	}

	@Override
	public void persist(ModalitiesHasSensor transientInstance) {
		modalitiesHasSensorHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(ModalitiesHasSensor instance) {
		modalitiesHasSensorHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(ModalitiesHasSensor instance) {
		modalitiesHasSensorHomeInt.attachClean(instance);
	}

	@Override
	public void delete(ModalitiesHasSensor persistentInstance) {
		modalitiesHasSensorHomeInt.delete(persistentInstance);
	}

	@Override
	public ModalitiesHasSensor merge(ModalitiesHasSensor detachedInstance) {
		return modalitiesHasSensorHomeInt.merge(detachedInstance);

	}

	@Override
	public ModalitiesHasSensor findById(ModalitiesHasSensorId id) {
		return modalitiesHasSensorHomeInt.findById(id);
	}

	@Override
	public List<ModalitiesHasSensor> findByExample(ModalitiesHasSensor instance) {
		return modalitiesHasSensorHomeInt.findByExample(instance);
	}

}