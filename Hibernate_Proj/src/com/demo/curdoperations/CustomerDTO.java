package com.demo.curdoperations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="customer_details")
public class CustomerDTO {
	
	
	@Id
	@GenericGenerator(name="incr",strategy="increment")
	@GeneratedValue(generator="incr")
	@Column(name="cust_id")
	private int cid;
	@Column(name="cust_name")
	private String cname;
	@Column(name="cust_city")
	private String city;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "CustomerDTO [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
	}

}
