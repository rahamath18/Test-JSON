package com.test.json.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

public class City implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer cityCode;
	private String cityName;
	private Country country;
	
	public City() {}
	
	public City(Integer cityCode, String cityName, Country country) {
		super();
		this.cityCode = cityCode;
		this.cityName = cityName;
		this.country = country;
	}
	
	public Integer getCityCode() {
		return cityCode;
	}
	public void setCityCode(Integer cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "City:(" + "Code=" + this.cityCode + "|" + "Name=" + this.cityName  + "|" + this.country + ")";
	}
	
}
