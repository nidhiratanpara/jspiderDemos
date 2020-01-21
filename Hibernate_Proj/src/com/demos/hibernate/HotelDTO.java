package com.demos.hibernate;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="hotel_details")
//@IdClass(RoomIdDTO.class)
public class HotelDTO implements Serializable {

	@Id
	//@GenericGenerator(name="incr",strategy="com.demos.hibernate.CustomId")
	@GenericGenerator(name="incr",strategy="increment")
	@GeneratedValue(generator="incr")
	
	@Column(name="hotel_id")
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="hotel_name")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="hotel_grade")
	private String grade;

	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
