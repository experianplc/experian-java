package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class BondDetails {
	private String bondNumber;
	private long bondAmount;
	private String bondCompany;
	private String bondEffectiveDate;
	public String getBondNumber() {
		return bondNumber;
	}
	public void setBondNumber(String bondNumber) {
		this.bondNumber = bondNumber;
	}
	public long getBondAmount() {
		return bondAmount;
	}
	public void setBondAmount(long bondAmount) {
		this.bondAmount = bondAmount;
	}
	public String getBondCompany() {
		return bondCompany;
	}
	public void setBondCompany(String bondCompany) {
		this.bondCompany = bondCompany;
	}
	public String getBondEffectiveDate() {
		return bondEffectiveDate;
	}
	public void setBondEffectiveDate(String bondEffectiveDate) {
		this.bondEffectiveDate = bondEffectiveDate;
	}
	
}
