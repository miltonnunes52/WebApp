package com.mkyong;

import java.io.Serializable;
import java.util.List;

import com.mkyong.customer.bo.MetricsBoInt;
import com.mkyong.customer.model.Metrics;

public class MetricsBean implements Serializable {

	private MetricsBoInt metricsBoInt;

	public MetricsBoInt getMetricsBoInt() {
		return metricsBoInt;
	}

	public void setMetricsBoInt(MetricsBoInt metricsBoInt) {
		this.metricsBoInt = metricsBoInt;
	}

	public List<Metrics> getAll() {
		System.out.println("aqui!!!!!");
		return getMetricsBoInt().getAll();

	}

}
