package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class ContractSpendingDetail {

	private String contractAction;
	private String contractId;
	private String programSource;
	private String departmentAgency;
	private String productService;
	private String signedDate;
	private long obligationAmount;
	private String reasonForModification;
	private String additionalDescription;
	private long sequenceNumber;
	public String getContractAction() {
		return contractAction;
	}
	public void setContractAction(String contractAction) {
		this.contractAction = contractAction;
	}
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public String getProgramSource() {
		return programSource;
	}
	public void setProgramSource(String programSource) {
		this.programSource = programSource;
	}
	public String getDepartmentAgency() {
		return departmentAgency;
	}
	public void setDepartmentAgency(String departmentAgency) {
		this.departmentAgency = departmentAgency;
	}
	public String getProductService() {
		return productService;
	}
	public void setProductService(String productService) {
		this.productService = productService;
	}
	public String getSignedDate() {
		return signedDate;
	}
	public void setSignedDate(String signedDate) {
		this.signedDate = signedDate;
	}
	public long getObligationAmount() {
		return obligationAmount;
	}
	public void setObligationAmount(long obligationAmount) {
		this.obligationAmount = obligationAmount;
	}
	public String getReasonForModification() {
		return reasonForModification;
	}
	public void setReasonForModification(String reasonForModification) {
		this.reasonForModification = reasonForModification;
	}
	public String getAdditionalDescription() {
		return additionalDescription;
	}
	public void setAdditionalDescription(String additionalDescription) {
		this.additionalDescription = additionalDescription;
	}
	public long getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	
}
