package com.mkyong.customer.bo;

import java.util.List;

import com.mkyong.customer.model.Metrics;

public interface MetricsBoInt {

	void persist(Metrics transientInstance);

	void attachDirty(Metrics instance);

	void attachClean(Metrics instance);

	void delete(Metrics persistentInstance);

	Metrics merge(Metrics detachedInstance);

	Metrics findById(java.lang.Integer id);

	List<Metrics> findByExample(Metrics instance);

	List<Metrics> getAll();

	int count();

	List<Metrics> metricsByType(String type);

	List<String> getTypes();

}