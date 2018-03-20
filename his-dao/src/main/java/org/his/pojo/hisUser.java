package org.his.pojo;

import java.io.Serializable;

public class hisUser implements Serializable {
	private Integer userInd;
	
	private String userName;
	
	private String salt;
	
	private String password;
	
	private Integer staffId;

	public Integer getUserInd() {
		return userInd;
	}

	public void setUserInd(Integer userInd) {
		this.userInd = userInd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}
	

}
