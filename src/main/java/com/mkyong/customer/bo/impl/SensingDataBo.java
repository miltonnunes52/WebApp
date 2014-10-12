package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.SensingDataBoInt;
import com.mkyong.customer.dao.SensingDataHomeInt;
import com.mkyong.customer.model.SensingData;
import com.mkyong.customer.model.SensingDataId;

public class SensingDataBo implements SensingDataBoInt {

	SensingDataHomeInt sensingDataHomeInt;

	public void setSensingDataHomeInt(SensingDataHomeInt sensingDataHomeInt) {
		this.sensingDataHomeInt = sensingDataHomeInt;
	}

	@Override
	public void persist(SensingData transientInstance) {
		sensingDataHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(SensingData instance) {
		sensingDataHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(SensingData instance) {
		sensingDataHomeInt.attachClean(instance);
	}

	@Override
	public void delete(SensingData persistentInstance) {
		sensingDataHomeInt.delete(persistentInstance);
	}

	@Override
	public SensingData merge(SensingData detachedInstance) {
		return sensingDataHomeInt.merge(detachedInstance);

	}

	@Override
	public SensingData findById(SensingDataId id) {
		return sensingDataHomeInt.findById(id);
	}

	@Override
	public List<SensingData> findByExample(SensingData instance) {
		return sensingDataHomeInt.findByExample(instance);
	}

}