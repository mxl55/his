package org.his.pojo;

import java.io.Serializable;

public class HisMedical implements Serializable{
	
	private Integer medicalId;
	
	private Hisregister registerId;
	
	private String action;
	
	private String medicalInfo;
	
	private String handle;
	
	private String comment;

	public Integer getMedicalId() {
		return medicalId;
	}

	public void setMedicalId(Integer medicalId) {
		this.medicalId = medicalId;
	}

	public Hisregister getRegisterId() {
		return registerId;
	}

	public void setRegisterId(Hisregister registerId) {
		this.registerId = registerId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getMedicalInfo() {
		return medicalInfo;
	}

	public void setMedicalInfo(String medicalInfo) {
		this.medicalInfo = medicalInfo;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	

}
