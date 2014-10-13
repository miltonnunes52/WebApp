package com.mkyong;

import java.io.Serializable;
import java.util.List;

import com.mkyong.customer.bo.SensorBoInt;
import com.mkyong.customer.model.Sensor;

public class SensorBean implements Serializable {

	private SensorBoInt sensorBoInt;

	public SensorBoInt getSensorBoInt() {
		return sensorBoInt;
	}

	public void setSensorBoInt(SensorBoInt sensorBoInt) {
		this.sensorBoInt = sensorBoInt;
	}

	public List<Sensor> getAll() {
		return getSensorBoInt().getAll();

	}

	public int count() {
		return getSensorBoInt().count();
	}

	public Sensor getSensor(int id) {
		return getSensorBoInt().findById(id);

	}

	public List<Sensor> getSensorbyUser(Integer user) {
		return getSensorBoInt().getSensorbyUser(user);
	}

	public int countByUser(Integer user, Integer sensor) {
		return getSensorBoInt().countByUser(user, sensor);

	}

	public int countSensorsByUser(Integer user) {
		return getSensorBoInt().countSensorsByUser(user);
	}

	public int countTypesByUser(Integer user) {
		return getSensorBoInt().countTypesByUser(user);
	}

}
