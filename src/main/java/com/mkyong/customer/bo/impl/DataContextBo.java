package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.DataContextBoInt;
import com.mkyong.customer.dao.DataContextHomeInt;
import com.mkyong.customer.model.DataContext;

public class DataContextBo implements DataContextBoInt {

	DataContextHomeInt dataContextHomeInt;

	public void setDataContextHomeInt(DataContextHomeInt dataContextHomeInt) {
		this.dataContextHomeInt = dataContextHomeInt;
	}

	@Override
	public void persist(DataContext transientInstance) {
		dataContextHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(DataContext instance) {
		dataContextHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(DataContext instance) {
		dataContextHomeInt.attachClean(instance);
	}

	@Override
	public void delete(DataContext persistentInstance) {
		dataContextHomeInt.delete(persistentInstance);
	}

	@Override
	public DataContext merge(DataContext detachedInstance) {
		return dataContextHomeInt.merge(detachedInstance);

	}

	@Override
	public DataContext findById(Integer id) {
		return dataContextHomeInt.findById(id);
	}

	@Override
	public List<DataContext> findByExample(DataContext instance) {
		return dataContextHomeInt.findByExample(instance);
	}

}