package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.SensingDataValue;

public interface SensingDataValueHomeInt {

	void persist(SensingDataValue transientInstance);

	void attachDirty(SensingDataValue instance);

	void attachClean(SensingDataValue instance);

	void delete(SensingDataValue persistentInstance);

	SensingDataValue merge(SensingDataValue detachedInstance);

	SensingDataValue findById(java.lang.Integer id);

	List<SensingDataValue> findByExample(SensingDataValue instance);

	List<SensingDataValue> getValues(Integer sensing, Integer sensorNode);

}