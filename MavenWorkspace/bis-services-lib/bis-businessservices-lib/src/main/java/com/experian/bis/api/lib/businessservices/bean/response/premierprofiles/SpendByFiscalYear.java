package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class SpendByFiscalYear {
	
	private long year;
	private long totalAmount;
	private long singleHighestAmount;
	public long getYear() {
		return year;
	}
	public void setYear(long year) {
		this.year = year;
	}
	public long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public long getSingleHighestAmount() {
		return singleHighestAmount;
	}
	public void setSingleHighestAmount(long singleHighestAmount) {
		this.singleHighestAmount = singleHighestAmount;
	}

}
