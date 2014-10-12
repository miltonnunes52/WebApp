package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.Metrics;

public interface MetricsHomeInt {

	void persist(Metrics transientInstance);

	void attachDirty(Metrics instance);

	void attachClean(Metrics instance);

	void delete(Metrics persistentInstance);

	Metrics merge(Metrics detachedInstance);

	Metrics findById(java.lang.Integer id);

	List<Metrics> findByExample(Metrics instance);

	List<Metrics> getAll();

}