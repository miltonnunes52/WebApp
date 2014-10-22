package com.mkyong.customer.bo;

import java.util.List;

import com.mkyong.customer.model.MidlevelInformation;

public interface MidlevelInformationBoInt {

	void persist(MidlevelInformation transientInstance);

	void attachDirty(MidlevelInformation instance);

	void attachClean(MidlevelInformation instance);

	void delete(MidlevelInformation persistentInstance);

	MidlevelInformation merge(MidlevelInformation detachedInstance);

	MidlevelInformation findById(java.lang.Integer id);

	List<MidlevelInformation> findByExample(MidlevelInformation instance);

	List<MidlevelInformation> getMidLevelByIDSensing(int idsensing,
			int idsensornode, int metrica);

}