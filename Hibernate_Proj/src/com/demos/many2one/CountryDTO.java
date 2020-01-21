package com.demos.many2one;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class CountryDTO implements Serializable {
	@Id
	private int countryID;
	private String countryname;
	private String countrycapital;
	private String language;
	@OneToMany
	@JoinColumn(name="countryID")
	private List<PeopleDTO> people;
	public int getCountryID() {
		return countryID;
	}
	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrycapital() {
		return countrycapital;
	}
	public void setCountrycapital(String countrycapital) {
		this.countrycapital = countrycapital;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public List<PeopleDTO> getPeople() {
		return people;
	}
	public void setPeople(List<PeopleDTO> people) {
		this.people = people;
	}

}
