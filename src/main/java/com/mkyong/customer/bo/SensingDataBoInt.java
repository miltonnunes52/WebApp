package com.mkyong.customer.bo;

import java.util.List;

import com.mkyong.customer.model.SensingData;
import com.mkyong.customer.model.SensingDataId;

public interface SensingDataBoInt {

	void persist(SensingData transientInstance);

	void attachDirty(SensingData instance);

	void attachClean(SensingData instance);

	void delete(SensingData persistentInstance);

	SensingData merge(SensingData detachedInstance);

	SensingData findById(SensingDataId id);

	List<SensingData> findByExample(SensingData instance);

}