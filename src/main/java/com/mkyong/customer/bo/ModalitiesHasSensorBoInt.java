package com.mkyong.customer.bo;

import java.util.List;

import com.mkyong.customer.model.ModalitiesHasSensor;
import com.mkyong.customer.model.ModalitiesHasSensorId;

public interface ModalitiesHasSensorBoInt {

	void persist(ModalitiesHasSensor transientInstance);

	void attachDirty(ModalitiesHasSensor instance);

	void attachClean(ModalitiesHasSensor instance);

	void delete(ModalitiesHasSensor persistentInstance);

	ModalitiesHasSensor merge(ModalitiesHasSensor detachedInstance);

	ModalitiesHasSensor findById(ModalitiesHasSensorId id);

	List<ModalitiesHasSensor> findByExample(ModalitiesHasSensor instance);

}