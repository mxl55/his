package org.his.pojo;

import java.io.Serializable;

public class HisRole implements Serializable{
	private Integer rolesId;
	
	private String roleName;
	
	private String available;

	public Integer getRolesId() {
		return rolesId;
	}

	public void setRolesId(Integer rolesId) {
		this.rolesId = rolesId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}
	
	

}
