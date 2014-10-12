package com.mkyong.customer.bo;

import java.util.List;

import com.mkyong.customer.model.HighlevelInformation;

public interface HighlevelInformationBoInt {

	void persist(HighlevelInformation transientInstance);

	void attachDirty(HighlevelInformation instance);

	void attachClean(HighlevelInformation instance);

	void delete(HighlevelInformation persistentInstance);

	HighlevelInformation merge(HighlevelInformation detachedInstance);

	HighlevelInformation findById(java.lang.Integer id);

	List<HighlevelInformation> findByExample(HighlevelInformation instance);

}