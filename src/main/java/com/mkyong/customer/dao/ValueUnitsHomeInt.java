package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.ValueUnits;

public interface ValueUnitsHomeInt {

	void persist(ValueUnits transientInstance);

	void attachDirty(ValueUnits instance);

	void attachClean(ValueUnits instance);

	void delete(ValueUnits persistentInstance);

	ValueUnits merge(ValueUnits detachedInstance);

	ValueUnits findById(java.lang.Integer id);

	List<ValueUnits> findByExample(ValueUnits instance);

}