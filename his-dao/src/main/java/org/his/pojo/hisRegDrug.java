package org.his.pojo;

import java.io.Serializable;

public class hisRegDrug implements Serializable{
	
	private Integer id;
	
	private Hisregister registerId;
	
	private Integer drugid;
	
	private String  drugName;
	
	private int count;
	
	private double price;
	
	private String comment;
	
	private His_drugType use;
	
	private His_drugType rate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Hisregister getRegisterId() {
		return registerId;
	}

	public void setRegisterId(Hisregister registerId) {
		this.registerId = registerId;
	}

	public Integer getDrugid() {
		return drugid;
	}

	public void setDrugid(Integer drugid) {
		this.drugid = drugid;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public His_drugType getUse() {
		return use;
	}

	public void setUse(His_drugType use) {
		this.use = use;
	}

	public His_drugType getRate() {
		return rate;
	}

	public void setRate(His_drugType rate) {
		this.rate = rate;
	}
	
	

}
