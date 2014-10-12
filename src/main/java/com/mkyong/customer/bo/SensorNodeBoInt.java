package com.mkyong.customer.bo;

import java.util.List;

import com.mkyong.customer.model.SensorNode;

public interface SensorNodeBoInt {

	void persist(SensorNode transientInstance);

	void attachDirty(SensorNode instance);

	void attachClean(SensorNode instance);

	void delete(SensorNode persistentInstance);

	SensorNode merge(SensorNode detachedInstance);

	SensorNode findById(java.lang.Integer id);

	List<SensorNode> findByExample(SensorNode instance);

}