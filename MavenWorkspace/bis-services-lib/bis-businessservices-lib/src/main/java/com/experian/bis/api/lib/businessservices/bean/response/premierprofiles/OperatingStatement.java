package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class OperatingStatement {
	
	private long yearEnd;
	private long netSales;
	private long costOfGoodsSold;
	private long grossIncomeOnSales;
	private long expenses;
	private long preTaxIncome;
	private long taxes;
	private long afterTaxes;
	private long extraordinaryIncome;
	private long netIncome;
	public long getYearEnd() {
		return yearEnd;
	}
	public void setYearEnd(long yearEnd) {
		this.yearEnd = yearEnd;
	}
	public long getNetSales() {
		return netSales;
	}
	public void setNetSales(long netSales) {
		this.netSales = netSales;
	}
	public long getExpenses() {
		return expenses;
	}
	public void setExpenses(long expenses) {
		this.expenses = expenses;
	}
	public long getPreTaxIncome() {
		return preTaxIncome;
	}
	public void setPreTaxIncome(long preTaxIncome) {
		this.preTaxIncome = preTaxIncome;
	}
	public long getTaxes() {
		return taxes;
	}
	public void setTaxes(long taxes) {
		this.taxes = taxes;
	}
	public long getAfterTaxes() {
		return afterTaxes;
	}
	public void setAfterTaxes(long afterTaxes) {
		this.afterTaxes = afterTaxes;
	}
	public long getExtraordinaryIncome() {
		return extraordinaryIncome;
	}
	public void setExtraordinaryIncome(long extraordinaryIncome) {
		this.extraordinaryIncome = extraordinaryIncome;
	}
	public long getNetIncome() {
		return netIncome;
	}
	public void setNetIncome(long netIncome) {
		this.netIncome = netIncome;
	}
	public long getCostOfGoodsSold() {
		return costOfGoodsSold;
	}
	public void setCostOfGoodsSold(long costOfGoodsSold) {
		this.costOfGoodsSold = costOfGoodsSold;
	}
	public long getGrossIncomeOnSales() {
		return grossIncomeOnSales;
	}
	public void setGrossIncomeOnSales(long grossIncomeOnSales) {
		this.grossIncomeOnSales = grossIncomeOnSales;
	}

}
