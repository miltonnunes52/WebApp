package com.mkyong;

import java.io.Serializable;
import java.util.List;

import com.mkyong.customer.bo.UserProfileBoInt;
import com.mkyong.customer.model.UserProfile;

public class UserProfileBean implements Serializable {

	private UserProfileBoInt userProfileBoInt;

	private UserProfile user;

	private String userid;

	public UserProfileBoInt getUserProfileBoInt() {
		return userProfileBoInt;
	}

	public void setUserProfileBoInt(UserProfileBoInt userProfileBoInt) {
		this.userProfileBoInt = userProfileBoInt;
	}

	public List<UserProfile> getAll() {
		return getUserProfileBoInt().getAll();

	}

	public void findProfile(int id) {
		setUser(getUserProfileBoInt().findById(id));

	}

	public void saveProfile() {

		getUserProfileBoInt().merge(getUser());

	}

	public UserProfile getUser() {
		return user;
	}

	public void setUser(UserProfile user) {
		this.user = user;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int count() {
		return getUserProfileBoInt().count();
	}

	public UserProfile getProfile(int id) {
		return getUserProfileBoInt().findById(id);

	}

}
