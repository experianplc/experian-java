package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

import com.experian.bis.api.lib.businessservices.bean.response.CodeAndDefinitionResult;

public class UCCFilingsDetail {
	
	private String dateFiled;
	private String legalType;
	private String legalAction;
	private String documentNumber;
	private String filingLocation;
	private CodeAndDefinitionResult[] collateralCodes;
	private String securedParty;
	private String assignee;
	private String owner;
	private boolean customerDisputeIndicator;
	private OriginalUCCFilingsInfo originalUCCFilingsInfo;
	
	public String getDateFiled() {
		return dateFiled;
	}
	public void setDateFiled(String dateFiled) {
		this.dateFiled = dateFiled;
	}
	public String getLegalType() {
		return legalType;
	}
	public void setLegalType(String legalType) {
		this.legalType = legalType;
	}
	public String getLegalAction() {
		return legalAction;
	}
	public void setLegalAction(String legalAction) {
		this.legalAction = legalAction;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getFilingLocation() {
		return filingLocation;
	}
	public void setFilingLocation(String filingLocation) {
		this.filingLocation = filingLocation;
	}
	public CodeAndDefinitionResult[] getCollateralCodes() {
		return collateralCodes;
	}
	public void setCollateralCodes(CodeAndDefinitionResult[] collateralCodes) {
		this.collateralCodes = collateralCodes;
	}
	public String getSecuredParty() {
		return securedParty;
	}
	public void setSecuredParty(String securedParty) {
		this.securedParty = securedParty;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public boolean isCustomerDisputeIndicator() {
		return customerDisputeIndicator;
	}
	public void setCustomerDisputeIndicator(boolean customerDisputeIndicator) {
		this.customerDisputeIndicator = customerDisputeIndicator;
	}
	public OriginalUCCFilingsInfo getOriginalUCCFilingsInfo() {
		return originalUCCFilingsInfo;
	}
	public void setOriginalUCCFilingsInfo(OriginalUCCFilingsInfo originalUCCFilingsInfo) {
		this.originalUCCFilingsInfo = originalUCCFilingsInfo;
	}

}
