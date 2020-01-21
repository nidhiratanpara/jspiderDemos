package com.demo.Orm1to2;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="employee_table")
public class EmployeeDTO implements Serializable {
	@Id
	@GenericGenerator(name="incr", strategy = "increment")
	@GeneratedValue(generator="incr")
	private int empId;
	private String empName;
	private String empEmail;
	private String empPhono;
	@OneToOne
	@JoinColumn(name="compnay_Id")
	private CompanyDTO company;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpPhono() {
		return empPhono;
	}
	public void setEmpPhono(String empPhono) {
		this.empPhono = empPhono;
	}
	public CompanyDTO getCompany() {
		return company;
	}
	public void setCompany(CompanyDTO company) {
		this.company = company;
	}
	
}
