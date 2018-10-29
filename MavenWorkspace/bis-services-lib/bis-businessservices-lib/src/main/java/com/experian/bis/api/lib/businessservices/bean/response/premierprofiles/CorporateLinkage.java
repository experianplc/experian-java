package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class CorporateLinkage {
	
	private String businessName;
	private String bin;
	private String corporateLinkageType;
	private boolean matchingBusinessIndicator;
	private LinkageBusinessAddress address;
	private boolean returnLimitExceeded;
	private String type;
	
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public String getCorporateLinkageType() {
		return corporateLinkageType;
	}
	public void setCorporateLinkageType(String corporateLinkageType) {
		this.corporateLinkageType = corporateLinkageType;
	}
	public boolean isMatchingBusinessIndicator() {
		return matchingBusinessIndicator;
	}
	public void setMatchingBusinessIndicator(boolean matchingBusinessIndicator) {
		this.matchingBusinessIndicator = matchingBusinessIndicator;
	}
	public LinkageBusinessAddress getAddress() {
		return address;
	}
	public void setAddress(LinkageBusinessAddress address) {
		this.address = address;
	}
	public boolean isReturnLimitExceeded() {
		return returnLimitExceeded;
	}
	public void setReturnLimitExceeded(boolean returnLimitExceeded) {
		this.returnLimitExceeded = returnLimitExceeded;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
