package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.SensorBoInt;
import com.mkyong.customer.dao.SensorHomeInt;
import com.mkyong.customer.model.Sensor;

public class SensorBo implements SensorBoInt {

	SensorHomeInt sensorHomeInt;

	public void setSensorHomeInt(SensorHomeInt sensorHomeInt) {
		this.sensorHomeInt = sensorHomeInt;
	}

	@Override
	public void persist(Sensor transientInstance) {
		sensorHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(Sensor instance) {
		sensorHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(Sensor instance) {
		sensorHomeInt.attachClean(instance);
	}

	@Override
	public void delete(Sensor persistentInstance) {
		sensorHomeInt.delete(persistentInstance);
	}

	@Override
	public Sensor merge(Sensor detachedInstance) {
		return sensorHomeInt.merge(detachedInstance);

	}

	@Override
	public Sensor findById(Integer id) {
		return sensorHomeInt.findById(id);
	}

	@Override
	public List<Sensor> findByExample(Sensor instance) {
		return sensorHomeInt.findByExample(instance);
	}

	@Override
	public List<Sensor> getAll() {
		return sensorHomeInt.getAll();
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return sensorHomeInt.count();
	}

	@Override
	public List<Sensor> getSensorbyUser(Integer user) {
		// TODO Auto-generated method stub
		return sensorHomeInt.getSensorbyUser(user);
	}

	@Override
	public int countByUser(Integer user, Integer sensor) {
		// TODO Auto-generated method stub
		return sensorHomeInt.countByUser(user, sensor);
	}

	@Override
	public int countSensorsByUser(Integer user) {
		// TODO Auto-generated method stub
		return sensorHomeInt.countSensorsByUser(user);
	}

	@Override
	public int countTypesByUser(Integer user) {
		// TODO Auto-generated method stub
		return sensorHomeInt.countTypesByUser(user);
	}

}