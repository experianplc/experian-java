package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class InsuranceDetails {
	private String insuranceType;
	private String policyNumber;
	private String insurer;
	private String insuranceEffectiveDate;
	private String insuranceExpirationDate;
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getInsurer() {
		return insurer;
	}
	public void setInsurer(String insurer) {
		this.insurer = insurer;
	}
	public String getInsuranceEffectiveDate() {
		return insuranceEffectiveDate;
	}
	public void setInsuranceEffectiveDate(String insuranceEffectiveDate) {
		this.insuranceEffectiveDate = insuranceEffectiveDate;
	}
	public String getInsuranceExpirationDate() {
		return insuranceExpirationDate;
	}
	public void setInsuranceExpirationDate(String insuranceExpirationDate) {
		this.insuranceExpirationDate = insuranceExpirationDate;
	}
	
}
