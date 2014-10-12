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

}
