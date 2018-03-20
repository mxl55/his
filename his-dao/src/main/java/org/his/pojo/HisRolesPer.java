package org.his.pojo;

import java.io.Serializable;

public class HisRolesPer implements Serializable{
	private Integer id;
	
	private Integer perId;
	
	private Integer  roleId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPerId() {
		return perId;
	}

	public void setPerId(Integer perId) {
		this.perId = perId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	
	
	

}
