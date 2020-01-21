package com.demos.One2One;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;

@Entity

public class BatteryDTO implements Serializable {
	
	@Id
	@GenericGenerator(name="incr",strategy="increment")
	@GeneratedValue(generator="incr")
	private int batteryId;
	private String batteryName;
	private String batteryModel;
	private String batteryType;
	@OneToOne
	@JoinColumn(name="mobile_id")
	private MobileDTO mobile;
	public int getBatteryId() {
		return batteryId;
	}
	public void setBatteryId(int batteryId) {
		this.batteryId = batteryId;
	}
	public String getBatteryName() {
		return batteryName;
	}
	public void setBatteryName(String batteryName) {
		this.batteryName = batteryName;
	}
	public String getBatteryModel() {
		return batteryModel;
	}
	public void setBatteryModel(String batteryModel) {
		this.batteryModel = batteryModel;
	}
	public String getBatteryType() {
		return batteryType;
	}
	public void setBatteryType(String batteryType) {
		this.batteryType = batteryType;
	}
	public MobileDTO getMobile() {
		return mobile;
	}
	public void setMobile(MobileDTO mobile) {
		this.mobile = mobile;
	}
	
}
