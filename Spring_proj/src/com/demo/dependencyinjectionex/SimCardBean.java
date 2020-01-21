package com.demo.dependencyinjectionex;

import java.io.Serializable;

public class SimCardBean implements Serializable {
	
	
	private int simno;
	private String operator;
	private String simtype;

	
	public int getSimno() {
		return simno;
	}
	public void setSimno(int simno) {
		this.simno = simno;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getSimtype() {
		return simtype;
	}
	public void setSimtype(String simtype) {
		this.simtype = simtype;
	}
	
}
