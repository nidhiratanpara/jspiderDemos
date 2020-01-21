package com.demos.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="book_detail")
public class BookDTO implements Serializable {

	
	@Id
	@GenericGenerator(name="incr",strategy="increment")
	@GeneratedValue(generator="incr")
	@Column(name="book_id")
	private int id;
	
	@Column(name="book_name")
	private String bname;
	@Column(name="book_authname")
	private String bauthname;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthname() {
		return bauthname;
	}
	public void setBauthname(String bauthname) {
		this.bauthname = bauthname;
	}
	
	
	
}
