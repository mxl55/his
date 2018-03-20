package org.his.pojo;

import java.io.Serializable;

public class HisDuty implements Serializable{
	private Integer dutyId;
	
	private HisSection sectionId;
	
	private HIsStaff foreman;
	
	private HIsStaff postId;
	
	private String dutyDate;

	public Integer getDutyId() {
		return dutyId;
	}

	public void setDutyId(Integer dutyId) {
		this.dutyId = dutyId;
	}

	public HisSection getSectionId() {
		return sectionId;
	}

	public void setSectionId(HisSection sectionId) {
		this.sectionId = sectionId;
	}

	public HIsStaff getForeman() {
		return foreman;
	}

	public void setForeman(HIsStaff foreman) {
		this.foreman = foreman;
	}

	public HIsStaff getPostId() {
		return postId;
	}

	public void setPostId(HIsStaff postId) {
		this.postId = postId;
	}

	public String getDutyDate() {
		return dutyDate;
	}

	public void setDutyDate(String dutyDate) {
		this.dutyDate = dutyDate;
	}
	
	

}
