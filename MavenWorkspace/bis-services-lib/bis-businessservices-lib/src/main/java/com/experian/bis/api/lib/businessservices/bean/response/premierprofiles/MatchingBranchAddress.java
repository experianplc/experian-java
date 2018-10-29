package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class MatchingBranchAddress {
	private String bin;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String zipExtension;
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getZipExtension() {
		return zipExtension;
	}
	public void setZipExtension(String zipExtension) {
		this.zipExtension = zipExtension;
	}
	
}
