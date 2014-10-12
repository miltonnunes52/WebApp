package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.SensingDataValueBoInt;
import com.mkyong.customer.dao.SensingDataValueHomeInt;
import com.mkyong.customer.model.SensingDataValue;

public class SensingDataValueBo implements SensingDataValueBoInt {

	SensingDataValueHomeInt sensingDataValueHomeInt;

	public void setSensingDataValueHomeInt(
			SensingDataValueHomeInt sensingDataValueHomeInt) {
		this.sensingDataValueHomeInt = sensingDataValueHomeInt;
	}

	@Override
	public void persist(SensingDataValue transientInstance) {
		sensingDataValueHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(SensingDataValue instance) {
		sensingDataValueHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(SensingDataValue instance) {
		sensingDataValueHomeInt.attachClean(instance);
	}

	@Override
	public void delete(SensingDataValue persistentInstance) {
		sensingDataValueHomeInt.delete(persistentInstance);
	}

	@Override
	public SensingDataValue merge(SensingDataValue detachedInstance) {
		return sensingDataValueHomeInt.merge(detachedInstance);

	}

	@Override
	public SensingDataValue findById(Integer id) {
		return sensingDataValueHomeInt.findById(id);
	}

	@Override
	public List<SensingDataValue> findByExample(SensingDataValue instance) {
		return sensingDataValueHomeInt.findByExample(instance);
	}

}