package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.ValueUnitsBoInt;
import com.mkyong.customer.dao.ValueUnitsHomeInt;
import com.mkyong.customer.model.ValueUnits;

public class ValueUnitsBo implements ValueUnitsBoInt {

	ValueUnitsHomeInt valueUnitsHomeInt;

	public void setValueUnitsHomeInt(ValueUnitsHomeInt valueUnitsHomeInt) {
		this.valueUnitsHomeInt = valueUnitsHomeInt;
	}

	@Override
	public void persist(ValueUnits transientInstance) {
		valueUnitsHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(ValueUnits instance) {
		valueUnitsHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(ValueUnits instance) {
		valueUnitsHomeInt.attachClean(instance);
	}

	@Override
	public void delete(ValueUnits persistentInstance) {
		valueUnitsHomeInt.delete(persistentInstance);
	}

	@Override
	public ValueUnits merge(ValueUnits detachedInstance) {
		return valueUnitsHomeInt.merge(detachedInstance);

	}

	@Override
	public ValueUnits findById(Integer id) {
		return valueUnitsHomeInt.findById(id);
	}

	@Override
	public List<ValueUnits> findByExample(ValueUnits instance) {
		return valueUnitsHomeInt.findByExample(instance);
	}

}