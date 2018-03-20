package org.his.pojo;

import java.io.Serializable;

public class HisPost implements Serializable {
	
	private Integer postId;
	
	private String postName;
	
	private Integer postParentId;
	
	private String type;

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public Integer getPostParentId() {
		return postParentId;
	}

	public void setPostParentId(Integer postParentId) {
		this.postParentId = postParentId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
