package com.mkyong;

import java.io.Serializable;
import java.util.List;

import com.mkyong.customer.bo.SensingDataBoInt;
import com.mkyong.customer.model.SensingData;

public class SensingDataBean implements Serializable {

	private SensingDataBoInt sensingDataBoInt;

	public SensingDataBoInt getSensingDataBoInt() {
		return sensingDataBoInt;
	}

	public void setSensingDataBoInt(SensingDataBoInt sensingDataBoInt) {
		this.sensingDataBoInt = sensingDataBoInt;
	}

	// public List<Metrics> getAll() {
	// return getSensingDataBoInt().getAll();
	//
	// }

	public int count() {
		return getSensingDataBoInt().count();
	}

	public List<SensingData> sensoresAtivos() {

		return getSensingDataBoInt().findActiveSensing();

	}

	public int countByUser(Integer user) {
		return getSensingDataBoInt().countByUser(user);
	}

	public int countBySensor(Integer sensor) {
		return getSensingDataBoInt().countBySensor(sensor);
	}
}
