package com.mkyong.customer.bo.impl;

import java.util.List;

import com.mkyong.customer.bo.UserProfileBoInt;
import com.mkyong.customer.dao.UserProfileHomeInt;
import com.mkyong.customer.model.UserProfile;

public class UserProfileBo implements UserProfileBoInt {

	UserProfileHomeInt userProfileHomeInt;

	public void setUserProfileHomeInt(UserProfileHomeInt userProfileHomeInt) {
		this.userProfileHomeInt = userProfileHomeInt;
	}

	@Override
	public void persist(UserProfile transientInstance) {
		userProfileHomeInt.persist(transientInstance);

	}

	@Override
	public void attachDirty(UserProfile instance) {
		userProfileHomeInt.attachDirty(instance);
	}

	@Override
	public void attachClean(UserProfile instance) {
		userProfileHomeInt.attachClean(instance);
	}

	@Override
	public void delete(UserProfile persistentInstance) {
		userProfileHomeInt.delete(persistentInstance);
	}

	@Override
	public UserProfile merge(UserProfile detachedInstance) {
		return userProfileHomeInt.merge(detachedInstance);

	}

	@Override
	public UserProfile findById(Integer id) {
		return userProfileHomeInt.findById(id);
	}

	@Override
	public List<UserProfile> findByExample(UserProfile instance) {
		return userProfileHomeInt.findByExample(instance);
	}

}