package org.his.pojo;

import java.io.Serializable;

public class Hisregister implements Serializable {
	private Integer registerId;
	
	private HisInfo infoId;
	
	private HisDuty dutyId;;
	
	private String  registerDate;
	
	private String  registerState;

	public Integer getRegisterId() {
		return registerId;
	}

	public void setRegisterId(Integer registerId) {
		this.registerId = registerId;
	}

	public HisInfo getInfoId() {
		return infoId;
	}

	public void setInfoId(HisInfo infoId) {
		this.infoId = infoId;
	}

	public HisDuty getDutyId() {
		return dutyId;
	}

	public void setDutyId(HisDuty dutyId) {
		this.dutyId = dutyId;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getRegisterState() {
		return registerState;
	}

	public void setRegisterState(String registerState) {
		this.registerState = registerState;
	}
	
	

}
