package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.Profile;

public interface ProfileHomeInt {

	void persist(Profile transientInstance);

	void attachDirty(Profile instance);

	void attachClean(Profile instance);

	void delete(Profile persistentInstance);

	Profile merge(Profile detachedInstance);

	Profile findById(java.lang.Integer id);

	List<Profile> findByExample(Profile instance);

}