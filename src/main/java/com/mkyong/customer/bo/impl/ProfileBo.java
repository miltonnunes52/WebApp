package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.ProfileBoInt;
import com.mkyong.customer.dao.ProfileHomeInt;
import com.mkyong.customer.model.Profile;

public class ProfileBo implements ProfileBoInt {

	ProfileHomeInt profileHomeInt;

	public void setProfileHomeInt(ProfileHomeInt profileHomeInt) {
		this.profileHomeInt = profileHomeInt;
	}

	@Override
	public void persist(Profile transientInstance) {
		profileHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(Profile instance) {
		profileHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(Profile instance) {
		profileHomeInt.attachClean(instance);
	}

	@Override
	public void delete(Profile persistentInstance) {
		profileHomeInt.delete(persistentInstance);
	}

	@Override
	public Profile merge(Profile detachedInstance) {
		return profileHomeInt.merge(detachedInstance);

	}

	@Override
	public Profile findById(Integer id) {
		return profileHomeInt.findById(id);
	}

	@Override
	public List<Profile> findByExample(Profile instance) {
		return profileHomeInt.findByExample(instance);
	}

}