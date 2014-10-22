package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.MidlevelInformationBoInt;
import com.mkyong.customer.dao.MidlevelInformationHomeInt;
import com.mkyong.customer.model.MidlevelInformation;

public class MidlevelInformationBo implements MidlevelInformationBoInt {

	MidlevelInformationHomeInt midlevelInformationHomeInt;

	public void setMidlevelInformationHomeInt(
			MidlevelInformationHomeInt midlevelInformationHomeInt) {
		this.midlevelInformationHomeInt = midlevelInformationHomeInt;
	}

	@Override
	public void persist(MidlevelInformation transientInstance) {
		midlevelInformationHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(MidlevelInformation instance) {
		midlevelInformationHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(MidlevelInformation instance) {
		midlevelInformationHomeInt.attachClean(instance);
	}

	@Override
	public void delete(MidlevelInformation persistentInstance) {
		midlevelInformationHomeInt.delete(persistentInstance);
	}

	@Override
	public MidlevelInformation merge(MidlevelInformation detachedInstance) {
		return midlevelInformationHomeInt.merge(detachedInstance);

	}

	@Override
	public MidlevelInformation findById(Integer id) {
		return midlevelInformationHomeInt.findById(id);
	}

	@Override
	public List<MidlevelInformation> findByExample(MidlevelInformation instance) {
		return midlevelInformationHomeInt.findByExample(instance);
	}

	@Override
	public List<MidlevelInformation> getMidLevelByIDSensing(int idsensing,
			int idsensornode, int metrica) {
		// TODO Auto-generated method stub
		return midlevelInformationHomeInt.getMidLevelByIDSensing(idsensing,
				idsensornode, metrica);
	}

}