package com.mkyong;

import java.io.Serializable;

import com.mkyong.customer.bo.SensorNodeBoInt;
import com.mkyong.customer.model.SensorNode;

public class SensorNodeBean implements Serializable {

	private SensorNodeBoInt sensorNodeBoInt;

	public SensorNodeBoInt getSensorNodeBoInt() {
		return sensorNodeBoInt;
	}

	public void setSensorNodeBoInt(SensorNodeBoInt sensorNodeBoInt) {
		this.sensorNodeBoInt = sensorNodeBoInt;
	}

	public SensorNode findSensorNodeById(Integer id) {
		return getSensorNodeBoInt().findById(id);
	}

}
