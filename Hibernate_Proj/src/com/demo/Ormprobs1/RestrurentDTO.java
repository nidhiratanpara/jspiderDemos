package com.demo.Ormprobs1;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity

public class RestrurentDTO implements Serializable {
	
	@Id
	@GenericGenerator(name="incr",strategy = "increment")
	@GeneratedValue(generator="incr")
	private int restrauntId;
	private String restrauntName;
	private String restrauntRating;
	private String restrauntAddress;
	@OneToOne(cascade= CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private ManagerDTO manager;
	
	public int getRestrauntId() {
		return restrauntId;
	}
	public void setRestrauntId(int restrauntId) {
		this.restrauntId = restrauntId;
	}
	public String getRestrauntName() {
		return restrauntName;
	}
	public void setRestrauntName(String restrauntName) {
		this.restrauntName = restrauntName;
	}
	public String getRestrauntRating() {
		return restrauntRating;
	}
	public void setRestrauntRating(String restrauntRating) {
		this.restrauntRating = restrauntRating;
	}
	public String getRestrauntAddress() {
		return restrauntAddress;
	}
	public void setRestrauntAddress(String restrauntAddress) {
		this.restrauntAddress = restrauntAddress;
	}
	public ManagerDTO getManager() {
		return manager;
	}
	public void setManager(ManagerDTO manager) {
		this.manager = manager;
	}
	
	
	
	


}
