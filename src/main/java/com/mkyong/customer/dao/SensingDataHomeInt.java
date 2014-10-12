package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.SensingData;
import com.mkyong.customer.model.SensingDataId;

public interface SensingDataHomeInt {

	void persist(SensingData transientInstance);

	void attachDirty(SensingData instance);

	void attachClean(SensingData instance);

	void delete(SensingData persistentInstance);

	SensingData merge(SensingData detachedInstance);

	SensingData findById(SensingDataId id);

	List<SensingData> findByExample(SensingData instance);

}