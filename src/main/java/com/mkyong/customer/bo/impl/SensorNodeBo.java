package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.SensorNodeBoInt;
import com.mkyong.customer.dao.SensorNodeHomeInt;
import com.mkyong.customer.model.SensorNode;

public class SensorNodeBo implements SensorNodeBoInt {

	SensorNodeHomeInt sensorNodeHomeInt;

	public void setSensorNodeHomeInt(SensorNodeHomeInt sensorNodeHomeInt) {
		this.sensorNodeHomeInt = sensorNodeHomeInt;
	}

	@Override
	public void persist(SensorNode transientInstance) {
		sensorNodeHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(SensorNode instance) {
		sensorNodeHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(SensorNode instance) {
		sensorNodeHomeInt.attachClean(instance);
	}

	@Override
	public void delete(SensorNode persistentInstance) {
		sensorNodeHomeInt.delete(persistentInstance);
	}

	@Override
	public SensorNode merge(SensorNode detachedInstance) {
		return sensorNodeHomeInt.merge(detachedInstance);

	}

	@Override
	public SensorNode findById(Integer id) {
		return sensorNodeHomeInt.findById(id);
	}

	@Override
	public List<SensorNode> findByExample(SensorNode instance) {
		return sensorNodeHomeInt.findByExample(instance);
	}

}