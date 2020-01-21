package com.demo.autowireproperty;

import java.io.Serializable;

public class BikeBean implements Serializable{
	
	private String bikeno;
	private String bikename;
	private String modelno;
	private String color;
	private FualBean fual;
	
	public BikeBean(FualBean fual) {
		//super();
		System.out.println("bike in fual obj creates");
		this.fual = fual;
	}
	//business method
	public void makecall()
	{
		System.out.println("bikename is "+this.bikename+",it's run on"+this.fual.getType());
	}
	public String getBikeno()
	{	
		return bikeno;
	}

	public void setBikeno(String bikeno) {
		this.bikeno = bikeno;
	}

	public String getBikename() {
		return bikename;
	}

	public void setBikename(String bikename) {
		this.bikename = bikename;
	}

	public String getModelno() {
		return modelno;
	}

	public void setModelno(String modelno) {
		this.modelno = modelno;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public FualBean getFual() {
		return fual;
	}

	public void setFual(FualBean fual) {
		this.fual = fual;
	}

	
}
