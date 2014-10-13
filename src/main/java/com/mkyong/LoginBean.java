package com.mkyong;

import java.io.Serializable;

import com.mkyong.customer.bo.UserProfileBoInt;
import com.mkyong.customer.model.UserProfile;

public class LoginBean implements Serializable {

	private UserProfileBoInt userProfileBoInt;

	private String username;
	private String password;

	private String id;

	private UserProfile userLogin = null;

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserProfile getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(UserProfile user) {
		this.userLogin = user;
	}

	public UserProfileBoInt getUserProfileBoInt() {
		return userProfileBoInt;
	}

	public void setUserProfileBoInt(UserProfileBoInt userProfileBoInt) {
		this.userProfileBoInt = userProfileBoInt;
	}

	public boolean doLogin() {
		UserProfile up = getUserProfileBoInt().getCredentials(username,
				password);
		if (up != null) {
			setUserLogin(up);
			setId(up.getIdUserProfile().toString());
			System.out.println("login :)");
			return true;
		} else {
			System.out.println("login :(");
			return false;
		}

	}

	public void doLogout() {
		setUserLogin(null);
		setId(null);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void saveProfile() {

		getUserProfileBoInt().merge(getUserLogin());

	}
}
