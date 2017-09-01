package com.test.json.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

public class Country implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String countryCode;
	private String countryName;
	
	public Country() {}
	
	public Country(String countryCode, String countryName) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	@Override
	public String toString() {
		return "Country:(" + "Code=" + this.countryCode + "|" + "Name=" + this.countryName + ")"; 
	}

}
