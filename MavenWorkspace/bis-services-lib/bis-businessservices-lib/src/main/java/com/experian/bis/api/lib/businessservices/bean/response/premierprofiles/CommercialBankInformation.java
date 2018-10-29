package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class CommercialBankInformation {
	private String institutionName;
	private String institutionType;
	private String relationship;
	private String address;
	private String phone;
	private String profileDate;
	private String openDate;
	private String closeDate;
	private String accountRating;
	private String balanceRange;
	private String figuresInBalance;
	private long balanceAmount;
	private boolean customerDisputeIndicator;
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public String getInstitutionType() {
		return institutionType;
	}
	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProfileDate() {
		return profileDate;
	}
	public void setProfileDate(String profileDate) {
		this.profileDate = profileDate;
	}
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	public String getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
	public String getAccountRating() {
		return accountRating;
	}
	public void setAccountRating(String accountRating) {
		this.accountRating = accountRating;
	}
	public String getBalanceRange() {
		return balanceRange;
	}
	public void setBalanceRange(String balanceRange) {
		this.balanceRange = balanceRange;
	}
	public String getFiguresInBalance() {
		return figuresInBalance;
	}
	public void setFiguresInBalance(String figuresInBalance) {
		this.figuresInBalance = figuresInBalance;
	}
	public long getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(long balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public boolean isCustomerDisputeIndicator() {
		return customerDisputeIndicator;
	}
	public void setCustomerDisputeIndicator(boolean customerDisputeIndicator) {
		this.customerDisputeIndicator = customerDisputeIndicator;
	}
	
}
