package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class FsrScore {
	
	private boolean publiclyHeldCompany;
	private boolean limitedProfile;
	private long score;
	private String profileNumber;
	private String modelCode;
	private String modelTitle;
	private long percentileRanking;
	private long probability;
	private RiskClass riskClass;
	private boolean customerDisputeIndicator;
	public boolean isPubliclyHeldCompany() {
		return publiclyHeldCompany;
	}
	public void setPubliclyHeldCompany(boolean publiclyHeldCompany) {
		this.publiclyHeldCompany = publiclyHeldCompany;
	}
	public boolean isLimitedProfile() {
		return limitedProfile;
	}
	public void setLimitedProfile(boolean limitedProfile) {
		this.limitedProfile = limitedProfile;
	}
	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}
	public String getProfileNumber() {
		return profileNumber;
	}
	public void setProfileNumber(String profileNumber) {
		this.profileNumber = profileNumber;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public String getModelTitle() {
		return modelTitle;
	}
	public void setModelTitle(String modelTitle) {
		this.modelTitle = modelTitle;
	}
	public long getPercentileRanking() {
		return percentileRanking;
	}
	public void setPercentileRanking(long percentileRanking) {
		this.percentileRanking = percentileRanking;
	}
	public long getProbability() {
		return probability;
	}
	public void setProbability(long probability) {
		this.probability = probability;
	}
	public RiskClass getRiskClass() {
		return riskClass;
	}
	public void setRiskClass(RiskClass riskClass) {
		this.riskClass = riskClass;
	}
	public boolean isCustomerDisputeIndicator() {
		return customerDisputeIndicator;
	}
	public void setCustomerDisputeIndicator(boolean customerDisputeIndicator) {
		this.customerDisputeIndicator = customerDisputeIndicator;
	}

}
