package com.test.pojo.json.conversion.vo.parent_child_POJO;

import java.io.Serializable;

public class CityVo implements Serializable {

	private static final long serialVersionUID = 1L;

	protected String cityCode;
	protected String cityName;
	protected CountryVo country;

	public CityVo() {
	}

	public CityVo(String cityCode, String cityName, CountryVo country) {
		super();
		this.cityCode = cityCode;
		this.cityName = cityName;
		this.country = country;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public CountryVo getCountry() {
		return country;
	}

	public void setCountry(CountryVo country) {
		this.country = country;
	}

}
