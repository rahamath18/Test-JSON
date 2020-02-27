package com.test.pojo.json.conversion.vo.parent_child_POJO;

import java.io.Serializable;

public class CountryVo implements Serializable {

	protected static final long serialVersionUID = 1L;

	protected String countryCode;
	protected String countryName;

	public CountryVo() {
	}

	public CountryVo(String countryCode, String countryName) {
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

}
