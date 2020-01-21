package com.demo.dependencyinjectionex;

import java.io.Serializable;

public class PhoneBean implements Serializable {
	
	private int imei;
	private String company;
	private String model;
	private SimCardBean sim;
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public SimCardBean getSim() {
		return sim;
	}
	public void setSim(SimCardBean sim) {
		this.sim = sim;
	}
	public void makecall()
	{
		System.out.println("phone is "+this.imei+"simcrad is"+this.sim.getOperator());
	}
	
	
	

}
