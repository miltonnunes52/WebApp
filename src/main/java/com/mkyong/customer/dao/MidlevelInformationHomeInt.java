package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.MidlevelInformation;

public interface MidlevelInformationHomeInt {

	void persist(MidlevelInformation transientInstance);

	void attachDirty(MidlevelInformation instance);

	void attachClean(MidlevelInformation instance);

	void delete(MidlevelInformation persistentInstance);

	MidlevelInformation merge(MidlevelInformation detachedInstance);

	MidlevelInformation findById(java.lang.Integer id);

	List<MidlevelInformation> findByExample(MidlevelInformation instance);

}