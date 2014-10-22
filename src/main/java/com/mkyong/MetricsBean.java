package com.mkyong;

import java.io.Serializable;
import java.util.List;

import javax.faces.event.ValueChangeEvent;

import com.mkyong.customer.bo.MetricsBoInt;
import com.mkyong.customer.model.Metrics;

public class MetricsBean implements Serializable {

	private MetricsBoInt metricsBoInt;

	private String tipo = null;
	private String metrica = null;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMetrica() {
		return metrica;
	}

	public void setMetrica(String metrica) {
		this.metrica = metrica;
	}

	public MetricsBoInt getMetricsBoInt() {
		return metricsBoInt;
	}

	public void setMetricsBoInt(MetricsBoInt metricsBoInt) {
		this.metricsBoInt = metricsBoInt;
	}

	public List<Metrics> getAll() {
		return getMetricsBoInt().getAll();

	}

	public int count() {
		return getMetricsBoInt().count();
	}

	public List<String> getDataType() {
		List<String> list = metricsBoInt.getTypes();
		if (this.tipo == null && list.size() > 0)
			this.setTipo(list.get(0));
		return list;
	}

	public List<Metrics> getMetrics() {
		List<Metrics> list = null;
		if (getTipo() != null) {
			list = metricsBoInt.metricsByType(this.getTipo());
			if (this.metrica == null && list.size() > 0)
				this.setMetrica(list.get(0).getIdMetrics().toString());
		}
		return list;
	}

	public Metrics getMetricById() {
		return metricsBoInt.findById(Integer.parseInt(metrica));
	}

	public void valueChanged(ValueChangeEvent event) {
		setMetrica(null);
		System.out.println("tipo " + this.tipo.toString());
		// do your stuff
	}

	public void valueChanged1(ValueChangeEvent event1) {
		System.out.println("metrica " + this.metrica.toString());

		// do your stuff
	}

}
