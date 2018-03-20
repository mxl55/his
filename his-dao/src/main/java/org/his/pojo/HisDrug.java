package org.his.pojo;

import java.io.Serializable;

public class HisDrug implements Serializable {
	private Integer drugId;
	
	private String drugName;
	
	private double drugPrice;
	
	private String drugNorms;
	
	private Integer drugtypeId;
	
	private Integer drugCount;

	public Integer getDrugId() {
		return drugId;
	}

	public void setDrugId(Integer drugId) {
		this.drugId = drugId;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public double getDrugPrice() {
		return drugPrice;
	}

	public void setDrugPrice(double drugPrice) {
		this.drugPrice = drugPrice;
	}

	public String getDrugNorms() {
		return drugNorms;
	}

	public void setDrugNorms(String drugNorms) {
		this.drugNorms = drugNorms;
	}

	public Integer getDrugtypeId() {
		return drugtypeId;
	}

	public void setDrugtypeId(Integer drugtypeId) {
		this.drugtypeId = drugtypeId;
	}

	public Integer getDrugCount() {
		return drugCount;
	}

	public void setDrugCount(Integer drugCount) {
		this.drugCount = drugCount;
	}
	
	
	
	

}
