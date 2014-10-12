package com.mkyong.customer.bo;

import java.util.List;

import com.mkyong.customer.model.SensingDataValue;

public interface SensingDataValueBoInt {

	void persist(SensingDataValue transientInstance);

	void attachDirty(SensingDataValue instance);

	void attachClean(SensingDataValue instance);

	void delete(SensingDataValue persistentInstance);

	SensingDataValue merge(SensingDataValue detachedInstance);

	SensingDataValue findById(java.lang.Integer id);

	List<SensingDataValue> findByExample(SensingDataValue instance);

}