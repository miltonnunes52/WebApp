package com.mkyong.customer.dao;

import java.util.List;

import com.mkyong.customer.model.UserProfile;

public interface UserProfileHomeInt {

	void persist(UserProfile transientInstance);

	void attachDirty(UserProfile instance);

	void attachClean(UserProfile instance);

	void delete(UserProfile persistentInstance);

	UserProfile merge(UserProfile detachedInstance);

	UserProfile findById(java.lang.Integer id);

	List<UserProfile> findByExample(UserProfile instance);

	List<UserProfile> getAll();

}