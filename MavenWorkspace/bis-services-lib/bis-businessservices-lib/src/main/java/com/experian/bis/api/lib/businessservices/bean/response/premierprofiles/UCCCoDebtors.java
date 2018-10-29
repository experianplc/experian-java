package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class UCCCoDebtors {
	
	private String name;
	private AddressResult address;
	private String taxId;
	private long sequenceNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressResult getAddress() {
		return address;
	}
	public void setAddress(AddressResult address) {
		this.address = address;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public long getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

}
