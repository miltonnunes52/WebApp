package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.SensorNode;

public interface SensorNodeHomeInt {

	void persist(SensorNode transientInstance);

	void attachDirty(SensorNode instance);

	void attachClean(SensorNode instance);

	void delete(SensorNode persistentInstance);

	SensorNode merge(SensorNode detachedInstance);

	SensorNode findById(java.lang.Integer id);

	List<SensorNode> findByExample(SensorNode instance);

}