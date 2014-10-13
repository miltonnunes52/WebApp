package com.mkyong.customer.bo;

import java.util.List;

import com.mkyong.customer.model.Sensor;

public interface SensorBoInt {

	void persist(Sensor transientInstance);

	void attachDirty(Sensor instance);

	void attachClean(Sensor instance);

	void delete(Sensor persistentInstance);

	Sensor merge(Sensor detachedInstance);

	Sensor findById(java.lang.Integer id);

	List<Sensor> findByExample(Sensor instance);

	List<Sensor> getAll();

	int count();

	List<Sensor> getSensorbyUser(Integer user);

	int countByUser(Integer user, Integer sensor);

	int countSensorsByUser(Integer user);

	int countTypesByUser(Integer user);

}