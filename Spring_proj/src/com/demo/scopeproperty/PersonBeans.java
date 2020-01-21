package com.demo.scopeproperty;

import java.io.Serializable;

public class PersonBeans implements Serializable {
	
	private String name;
	private String dob;
	private String gender;
	private String address;
	private int age;
	private double height;
	
	
	public PersonBeans(String name, String dob, String gender, String address, int age, double height) {
		//super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.age = age;
		this.height = height;
	}


	
	public void presonDetails() {
		System.out.println("name is"+this.name);
		System.out.println("dob is"+this.dob);
		System.out.println("gender is"+this.gender);
		System.out.println("addresss is"+this.address);
		System.out.println("age is"+this.age);
		System.out.println("height is"+this.height);
	}


}
