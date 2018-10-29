package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class ProprietorNameAndAddress {
	
	private String profileType;
	private String profileDate;
	private String proprietorName;
	private Address address;
	private String ssn;
	private String title;
	public String getProfileType() {
		return profileType;
	}
	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}
	public String getProfileDate() {
		return profileDate;
	}
	public void setProfileDate(String profileDate) {
		this.profileDate = profileDate;
	}
	public String getProprietorName() {
		return proprietorName;
	}
	public void setProprietorName(String proprietorName) {
		this.proprietorName = proprietorName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
