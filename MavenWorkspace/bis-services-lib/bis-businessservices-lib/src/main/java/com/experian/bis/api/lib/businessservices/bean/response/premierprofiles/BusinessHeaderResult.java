package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class BusinessHeaderResult {

	private long bin;
	private String businessName;
	private AddressResult address;
	private String phone;
	private String taxId;
	private String websiteUrl;
	private String legalBusinessName;
	private String[] dbaNames;
	private boolean customerDisputeIndicator;
	private boolean foreignCountry;
	private boolean corporateLinkageIndicator;
	private MatchingBranchAddress matchingBranchAddress;
	private BranchLocation branchLocation;
	private boolean isBranchIndicator;
	
	
	public boolean isCorporateLinkageIndicator() {
		return corporateLinkageIndicator;
	}
	public void setCorporateLinkageIndicator(boolean corporateLinkageIndicator) {
		this.corporateLinkageIndicator = corporateLinkageIndicator;
	}
	public boolean isForeignCountry() {
		return foreignCountry;
	}
	public void setForeignCountry(boolean foreignCountry) {
		this.foreignCountry = foreignCountry;
	}
	public long getBin() {
		return bin;
	}
	public void setBin(long bin) {
		this.bin = bin;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public AddressResult getAddress() {
		return address;
	}
	public void setAddress(AddressResult address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public String getWebsiteUrl() {
		return websiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	public String getLegalBusinessName() {
		return legalBusinessName;
	}
	public void setLegalBusinessName(String legalBusinessName) {
		this.legalBusinessName = legalBusinessName;
	}
	public String[] getDbaNames() {
		return dbaNames;
	}
	public void setDbaNames(String[] dbaNames) {
		this.dbaNames = dbaNames;
	}
	public boolean isCustomerDisputeIndicator() {
		return customerDisputeIndicator;
	}
	public void setCustomerDisputeIndicator(boolean customerDisputeIndicator) {
		this.customerDisputeIndicator = customerDisputeIndicator;
	}
	public MatchingBranchAddress getMatchingBranchAddress() {
		return matchingBranchAddress;
	}
	public void setMatchingBranchAddress(MatchingBranchAddress matchingBranchAddress) {
		this.matchingBranchAddress = matchingBranchAddress;
	}
	public BranchLocation getBranchLocation() {
		return branchLocation;
	}
	public void setBranchLocation(BranchLocation branchLocation) {
		this.branchLocation = branchLocation;
	}
	public boolean isBranchIndicator() {
		return isBranchIndicator;
	}
	public void setBranchIndicator(boolean isBranchIndicator) {
		this.isBranchIndicator = isBranchIndicator;
	}
	
}
