package com.demos.One2One;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;

@Entity

public class MobileDTO implements Serializable{

	@Id
	@GenericGenerator(name="incr",strategy = "increment")
	@GeneratedValue(generator="incr")
	private int mobile_id;
	private String mobile_model;
	private String mobile_color;
	@OneToOne(cascade= CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private BatteryDTO battery;
	public int getMobile_id() {
		return mobile_id;
	}
	public void setMobile_id(int mobile_id) {
		this.mobile_id = mobile_id;
	}
	public String getMobile_model() {
		return mobile_model;
	}
	public void setMobile_model(String mobile_model) {
		this.mobile_model = mobile_model;
	}
	public String getMobile_color() {
		return mobile_color;
	}
	public void setMobile_color(String mobile_color) {
		this.mobile_color = mobile_color;
	}
	public BatteryDTO getBattery() {
		return battery;
	}
	public void setBattery(BatteryDTO battery) {
		this.battery = battery;
	}
	
	


}
