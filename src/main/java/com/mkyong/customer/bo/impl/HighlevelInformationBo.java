package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.HighlevelInformationBoInt;
import com.mkyong.customer.dao.HighlevelInformationHomeInt;
import com.mkyong.customer.model.HighlevelInformation;

public class HighlevelInformationBo implements HighlevelInformationBoInt {

	HighlevelInformationHomeInt highlevelInformationHomeInt;

	public void setHighlevelInformationHomeInt(
			HighlevelInformationHomeInt highlevelInformationHomeInt) {
		this.highlevelInformationHomeInt = highlevelInformationHomeInt;
	}

	@Override
	public void persist(HighlevelInformation transientInstance) {
		highlevelInformationHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(HighlevelInformation instance) {
		highlevelInformationHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(HighlevelInformation instance) {
		highlevelInformationHomeInt.attachClean(instance);
	}

	@Override
	public void delete(HighlevelInformation persistentInstance) {
		highlevelInformationHomeInt.delete(persistentInstance);
	}

	@Override
	public HighlevelInformation merge(HighlevelInformation detachedInstance) {
		return highlevelInformationHomeInt.merge(detachedInstance);

	}

	@Override
	public HighlevelInformation findById(Integer id) {
		return highlevelInformationHomeInt.findById(id);
	}

	@Override
	public List<HighlevelInformation> findByExample(
			HighlevelInformation instance) {
		return highlevelInformationHomeInt.findByExample(instance);
	}

}