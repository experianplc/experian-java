package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class BankruptcyDetail {

	private String dateFiled;
	private String legalType;
	private String legalAction;
	private String documentNumber;
	private String filingLocation;
	private String owner;
	private String assetAmount;
    private boolean customerDisputeIndicator;
    private String exemptAmount;
    private String liabilityAmount;

	
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
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAssetAmount() {
		return assetAmount;
	}
	public void setAssetAmount(String assetAmount) {
		this.assetAmount = assetAmount;
	}
	public boolean isCustomerDisputeIndicator() {
		return customerDisputeIndicator;
	}
	public void setCustomerDisputeIndicator(boolean customerDisputeIndicator) {
		this.customerDisputeIndicator = customerDisputeIndicator;
	}
	public String getExemptAmount() {
		return exemptAmount;
	}
	public void setExemptAmount(String exemptAmount) {
		this.exemptAmount = exemptAmount;
	}
	public String getLiabilityAmount() {
		return liabilityAmount;
	}
	public void setLiabilityAmount(String liabilityAmount) {
		this.liabilityAmount = liabilityAmount;
	}
	
}
