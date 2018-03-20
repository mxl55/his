package org.his.pojo;

import java.io.Serializable;

public class His_drugType implements Serializable {
	private Integer drugTypeId;
	
	private String drugName;
	
	private Integer parent;

	public Integer getDrugTypeId() {
		return drugTypeId;
	}

	public void setDrugTypeId(Integer drugTypeId) {
		this.drugTypeId = drugTypeId;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public Integer getParent() {
		return parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}
	
	

}
