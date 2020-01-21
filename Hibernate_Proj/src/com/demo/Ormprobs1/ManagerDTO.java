package com.demo.Ormprobs1;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity

public class ManagerDTO implements Serializable {

	private String managername;
	private String manageremail;
	@Id
	private String managerphoneno;
	private String manageraddress;
	@OneToOne
	@JoinColumn(name="restrauntId")
	private RestrurentDTO restrurent;
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
	}
	public String getManageremail() {
		return manageremail;
	}
	public void setManageremail(String manageremail) {
		this.manageremail = manageremail;
	}
	public String getManagerphoneno() {
		return managerphoneno;
	}
	public void setManagerphoneno(String managerphoneno) {
		this.managerphoneno = managerphoneno;
	}
	public String getManageraddress() {
		return manageraddress;
	}
	public void setManageraddress(String manageraddress) {
		this.manageraddress = manageraddress;
	}
	public RestrurentDTO getRestrurent() {
		return restrurent;
	}
	public void setRestrurent(RestrurentDTO restrurent) {
		this.restrurent = restrurent;
	}
	
	
}
