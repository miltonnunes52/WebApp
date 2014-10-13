package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.MetricsBoInt;
import com.mkyong.customer.dao.MetricsHomeInt;
import com.mkyong.customer.model.Metrics;

public class MetricsBo implements MetricsBoInt {

	MetricsHomeInt metricsHomeInt;

	public void setMetricsHomeInt(MetricsHomeInt metricsHomeInt) {
		this.metricsHomeInt = metricsHomeInt;
	}

	@Override
	public void persist(Metrics transientInstance) {
		metricsHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(Metrics instance) {
		metricsHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(Metrics instance) {
		metricsHomeInt.attachClean(instance);
	}

	@Override
	public void delete(Metrics persistentInstance) {
		metricsHomeInt.delete(persistentInstance);
	}

	@Override
	public Metrics merge(Metrics detachedInstance) {
		return metricsHomeInt.merge(detachedInstance);

	}

	@Override
	public Metrics findById(Integer id) {
		return metricsHomeInt.findById(id);
	}

	@Override
	public List<Metrics> findByExample(Metrics instance) {
		return metricsHomeInt.findByExample(instance);
	}

	@Override
	public List<Metrics> getAll() {
		return metricsHomeInt.getAll();
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return metricsHomeInt.count();
	}
}