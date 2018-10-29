package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class LicenseDetails {
	private String licenseState;
	private String licenseNumber;
	private String licenseDateIssued;
	private String licenseStatus;
	public String getLicenseState() {
		return licenseState;
	}
	public void setLicenseState(String licenseState) {
		this.licenseState = licenseState;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getLicenseDateIssued() {
		return licenseDateIssued;
	}
	public void setLicenseDateIssued(String licenseDateIssued) {
		this.licenseDateIssued = licenseDateIssued;
	}
	public String getLicenseStatus() {
		return licenseStatus;
	}
	public void setLicenseStatus(String licenseStatus) {
		this.licenseStatus = licenseStatus;
	}
}
