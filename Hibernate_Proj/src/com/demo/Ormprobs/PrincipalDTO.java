package com.demo.Ormprobs;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="principal_details")

public class PrincipalDTO implements Serializable{
	
	@Column(name="p_name")
	private String principalname;
	@Id
	@Column(name="mail_id")
	private String emailid;
	@Column(name="phne_no")
	private String phoneno;
	@Column(name="address")
	private String address;
	
	@OneToOne
	@JoinColumn(name="c_id")
	private CollegeDTO college;

	public String getPrincipalname() {
		return principalname;
	}

	public void setPrincipalname(String principalname) {
		this.principalname = principalname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CollegeDTO getCollege() {
		return college;
	}

	public void setCollege(CollegeDTO college) {
		this.college = college;
	}
	
	

}
