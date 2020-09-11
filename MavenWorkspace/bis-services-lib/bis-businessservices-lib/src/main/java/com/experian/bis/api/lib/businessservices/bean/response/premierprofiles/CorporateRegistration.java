package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

import com.experian.bis.api.lib.businessservices.bean.response.CodeAndDefinitionResult;

public class CorporateRegistration {

	private String stateOfOrigin;
	private String originalFilingDate;
	private String recentFilingDate;
	private String incorporatedDate;
	private String businessType;
	private CodeAndDefinitionResult statusFlag;
	private String statusDescription;
	private String profitFlag;
	private String charterNumber;
	private long existenceTermYears;
	private String existenceTermDate;
	private String federalTaxID;
	private String stateTaxId;
	private String domesticForeignIndicator;
	private String agentName;
	private AgentAddressResult agentAddress;
	public String getStateOfOrigin() {
		return stateOfOrigin;
	}
	public void setStateOfOrigin(String stateOfOrigin) {
		this.stateOfOrigin = stateOfOrigin;
	}
	public String getOriginalFilingDate() {
		return originalFilingDate;
	}
	public void setOriginalFilingDate(String originalFilingDate) {
		this.originalFilingDate = originalFilingDate;
	}
	public String getRecentFilingDate() {
		return recentFilingDate;
	}
	public void setRecentFilingDate(String recentFilingDate) {
		this.recentFilingDate = recentFilingDate;
	}
	public String getIncorporatedDate() {
		return incorporatedDate;
	}
	public void setIncorporatedDate(String incorporatedDate) {
		this.incorporatedDate = incorporatedDate;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	public String getCharterNumber() {
		return charterNumber;
	}
	public void setCharterNumber(String charterNumber) {
		this.charterNumber = charterNumber;
	}
	public long getExistenceTermYears() {
		return existenceTermYears;
	}
	public void setExistenceTermYears(long existenceTermYears) {
		this.existenceTermYears = existenceTermYears;
	}
	public String getExistenceTermDate() {
		return existenceTermDate;
	}
	public void setExistenceTermDate(String existenceTermDate) {
		this.existenceTermDate = existenceTermDate;
	}
	public String getFederalTaxID() {
		return federalTaxID;
	}
	public void setFederalTaxID(String federalTaxID) {
		this.federalTaxID = federalTaxID;
	}
	public String getStateTaxId() {
		return stateTaxId;
	}
	public void setStateTaxId(String stateTaxId) {
		this.stateTaxId = stateTaxId;
	}
	public String getDomesticForeignIndicator() {
		return domesticForeignIndicator;
	}
	public void setDomesticForeignIndicator(String domesticForeignIndicator) {
		this.domesticForeignIndicator = domesticForeignIndicator;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public AgentAddressResult getAgentAddress() {
		return agentAddress;
	}
	public void setAgentAddress(AgentAddressResult agentAddress) {
		this.agentAddress = agentAddress;
	}
	public String getProfitFlag() {
		return profitFlag;
	}
	public void setProfitFlag(String profitFlag) {
		this.profitFlag = profitFlag;
	}
	public CodeAndDefinitionResult getStatusFlag() {
		return statusFlag;
	}
	public void setStatusFlag(CodeAndDefinitionResult statusFlag) {
		this.statusFlag = statusFlag;
	}
	
}