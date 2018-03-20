package org.his.pojo;

import java.io.Serializable;

public class HIsStaff implements Serializable {
	private Integer staffId;
	
	private String staffName;
	
	private String staffSex;
	
	private String staffBith;
	
	private String idcard;
	
	private String phone;
	
	private String poto;
	
	private String info;
	
	private HisPost post;

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffSex() {
		return staffSex;
	}

	public void setStaffSex(String staffSex) {
		this.staffSex = staffSex;
	}

	public String getStaffBith() {
		return staffBith;
	}

	public void setStaffBith(String staffBith) {
		this.staffBith = staffBith;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPoto() {
		return poto;
	}

	public void setPoto(String poto) {
		this.poto = poto;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public HisPost getPost() {
		return post;
	}

	public void setPost(HisPost post) {
		this.post = post;
	}
	
	

}
