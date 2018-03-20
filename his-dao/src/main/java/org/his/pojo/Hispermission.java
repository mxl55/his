package org.his.pojo;

import java.io.Serializable;

public class Hispermission implements Serializable {
	private Integer perId;
	
	private String perName;
	
	private String type;
	
	private Integer  parentId;
	
	private String url;
	
	private String  perCode;
	
	private String  avaliable;

	public Integer getPerId() {
		return perId;
	}

	public void setPerId(Integer perId) {
		this.perId = perId;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPerCode() {
		return perCode;
	}

	public void setPerCode(String perCode) {
		this.perCode = perCode;
	}

	public String getAvaliable() {
		return avaliable;
	}

	public void setAvaliable(String avaliable) {
		this.avaliable = avaliable;
	}
	
	

}
