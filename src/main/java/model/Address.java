package model;

public class Address {
	private int streerNumber;
	private String cityName;
	private String countryName;
	private long pinCode;
	public int getStreerNumber() {
		return streerNumber;
	}
	public void setStreerNumber(int streerNumber) {
		this.streerNumber = streerNumber;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [streerNumber=" + streerNumber + ", cityName=" + cityName + ", countryName=" + countryName
				+ ", pinCode=" + pinCode + "]";
	}
	
	

}
