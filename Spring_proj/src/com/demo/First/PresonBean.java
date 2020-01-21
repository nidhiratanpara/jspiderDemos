package com.demo.First;

import java.io.Serializable;

public class PresonBean implements Serializable {

	private String name;
	private String dob;
	private String gender;
	private String address;

	public PresonBean() {
		System.out.println("Constructor obj create for personbean");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void presonDetails() {
		System.out.println("name is"+this.name);
		System.out.println("dob is"+this.dob);
		System.out.println("gender is"+this.gender);
		System.out.println("addresss is"+this.address);
	}

}
