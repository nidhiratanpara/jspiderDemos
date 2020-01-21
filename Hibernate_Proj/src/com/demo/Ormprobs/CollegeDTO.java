package com.demo.Ormprobs;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="college_details")


public class CollegeDTO implements Serializable {

	
	@Id
	@GenericGenerator(name="incr" ,strategy="increment")
	@GeneratedValue(generator="incr")
	@Column(name="c_id")
	private int  collegeid;
	
	@Column(name="c_name")
	private String collegename;
	@Column(name="c_address")
	private String collegeaddress;
	@Column(name="c_contactno")
	private String contactno;
	
	@OneToOne(cascade= CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private PrincipalDTO principal;

	public int getCollegeid() {
		return collegeid;
	}

	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getCollegeaddress() {
		return collegeaddress;
	}

	public void setCollegeaddress(String collegeaddress) {
		this.collegeaddress = collegeaddress;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public PrincipalDTO getPrincipal() {
		return principal;
	}

	public void setPrincipal(PrincipalDTO principal) {
		this.principal = principal;
	}
	
	
	
}
