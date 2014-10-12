package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.Sensor;

public interface SensorHomeInt {

	void persist(Sensor transientInstance);

	void attachDirty(Sensor instance);

	void attachClean(Sensor instance);

	void delete(Sensor persistentInstance);

	Sensor merge(Sensor detachedInstance);

	Sensor findById(java.lang.Integer id);

	List<Sensor> findByExample(Sensor instance);

}