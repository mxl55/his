package org.his.pojo;

import java.io.Serializable;

public class HisRegProject implements Serializable {
	
	private Integer id;
	
	private Hisregister registerId;
	
	private HisProject projectId;
	
	private double price;
	
	private Integer count;

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

	public HisProject getProjectId() {
		return projectId;
	}

	public void setProjectId(HisProject projectId) {
		this.projectId = projectId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	

}
