package com.mkyong;

import java.io.Serializable;
import java.util.List;

import com.mkyong.customer.bo.UserProfileBoInt;
import com.mkyong.customer.model.UserProfile;

public class UserProfileBean implements Serializable {

	private UserProfileBoInt userProfileBoInt;

	private UserProfile user = new UserProfile("asas", "123");

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

}
