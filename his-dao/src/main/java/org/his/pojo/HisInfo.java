package org.his.pojo;

import java.io.Serializable;

public class HisInfo implements Serializable {
	private Integer infoId;
	
	private String infoName;
	
	private String infoSex;
	
	private String infoBirth;
	
	private  String idcarde;
	
	private String phone;

	public Integer getInfoId() {
		return infoId;
	}

	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}

	public String getInfoName() {
		return infoName;
	}

	public void setInfoName(String infoName) {
		this.infoName = infoName;
	}

	public String getInfoSex() {
		return infoSex;
	}

	public void setInfoSex(String infoSex) {
		this.infoSex = infoSex;
	}

	public String getInfoBirth() {
		return infoBirth;
	}

	public void setInfoBirth(String infoBirth) {
		this.infoBirth = infoBirth;
	}

	public String getIdcarde() {
		return idcarde;
	}

	public void setIdcarde(String idcarde) {
		this.idcarde = idcarde;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
