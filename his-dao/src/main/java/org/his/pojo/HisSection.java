package org.his.pojo;

import java.io.Serializable;

public class HisSection implements Serializable {
	
	private Integer sectionId;
	
	private String sectionName;
	
	private HisPost postId;

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public HisPost getPostId() {
		return postId;
	}

	public void setPostId(HisPost postId) {
		this.postId = postId;
	}
	
	

}
