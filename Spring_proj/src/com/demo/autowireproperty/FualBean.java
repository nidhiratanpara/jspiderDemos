package com.demo.autowireproperty;

import java.io.Serializable;

public class FualBean implements Serializable{
	private String type;
	private double prise;
	
	public FualBean()
	{
		System.out.println("fualbean constructor");
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrise() {
		return prise;
	}
	public void setPrise(double prise) {
		this.prise = prise;
	}

	
	

}
