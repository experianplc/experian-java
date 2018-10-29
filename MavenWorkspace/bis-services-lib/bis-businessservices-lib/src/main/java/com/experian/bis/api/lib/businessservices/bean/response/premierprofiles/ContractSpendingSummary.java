package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class ContractSpendingSummary {

	private long totalDollarAmount;
	private long totalNumberOfTransactions;
	private SpendByFiscalYear[] spendByFiscalYear;
	public long getTotalDollarAmount() {
		return totalDollarAmount;
	}
	public void setTotalDollarAmount(long totalDollarAmount) {
		this.totalDollarAmount = totalDollarAmount;
	}
	public long getTotalNumberOfTransactions() {
		return totalNumberOfTransactions;
	}
	public void setTotalNumberOfTransactions(long totalNumberOfTransactions) {
		this.totalNumberOfTransactions = totalNumberOfTransactions;
	}
	public SpendByFiscalYear[] getSpendByFiscalYear() {
		return spendByFiscalYear;
	}
	public void setSpendByFiscalYear(SpendByFiscalYear[] spendByFiscalYear) {
		this.spendByFiscalYear = spendByFiscalYear;
	}
	
}
