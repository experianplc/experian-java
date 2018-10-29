package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class CriticalDataAndFinancialRatios {

	private long yearEnd;
	private long tangibleNetWorth;
	private long netWorkingCapital;
	private long currentRatio;
	private long totalDebttoTangibleNetWorth;
	private long currentDebtToTangibleNetWorth;
	private long afterTaxIncomeToTangibleNetWorth;
	private long afterTaxIncomeToNetSales;
	private long netSalestoInventory;
	private long costOfGoodsSoldToInventory;
	private long averageDaysSalesOutstanding;
	public long getYearEnd() {
		return yearEnd;
	}
	public void setYearEnd(long yearEnd) {
		this.yearEnd = yearEnd;
	}
	public long getTangibleNetWorth() {
		return tangibleNetWorth;
	}
	public void setTangibleNetWorth(long tangibleNetWorth) {
		this.tangibleNetWorth = tangibleNetWorth;
	}
	public long getNetWorkingCapital() {
		return netWorkingCapital;
	}
	public void setNetWorkingCapital(long netWorkingCapital) {
		this.netWorkingCapital = netWorkingCapital;
	}
	public long getCurrentRatio() {
		return currentRatio;
	}
	public void setCurrentRatio(long currentRatio) {
		this.currentRatio = currentRatio;
	}
	public long getTotalDebttoTangibleNetWorth() {
		return totalDebttoTangibleNetWorth;
	}
	public void setTotalDebttoTangibleNetWorth(long totalDebttoTangibleNetWorth) {
		this.totalDebttoTangibleNetWorth = totalDebttoTangibleNetWorth;
	}
	public long getCurrentDebtToTangibleNetWorth() {
		return currentDebtToTangibleNetWorth;
	}
	public void setCurrentDebtToTangibleNetWorth(long currentDebtToTangibleNetWorth) {
		this.currentDebtToTangibleNetWorth = currentDebtToTangibleNetWorth;
	}
	public long getAfterTaxIncomeToTangibleNetWorth() {
		return afterTaxIncomeToTangibleNetWorth;
	}
	public void setAfterTaxIncomeToTangibleNetWorth(long afterTaxIncomeToTangibleNetWorth) {
		this.afterTaxIncomeToTangibleNetWorth = afterTaxIncomeToTangibleNetWorth;
	}
	public long getAfterTaxIncomeToNetSales() {
		return afterTaxIncomeToNetSales;
	}
	public void setAfterTaxIncomeToNetSales(long afterTaxIncomeToNetSales) {
		this.afterTaxIncomeToNetSales = afterTaxIncomeToNetSales;
	}
	public long getNetSalestoInventory() {
		return netSalestoInventory;
	}
	public void setNetSalestoInventory(long netSalestoInventory) {
		this.netSalestoInventory = netSalestoInventory;
	}
	public long getCostOfGoodsSoldToInventory() {
		return costOfGoodsSoldToInventory;
	}
	public void setCostOfGoodsSoldToInventory(long costOfGoodsSoldToInventory) {
		this.costOfGoodsSoldToInventory = costOfGoodsSoldToInventory;
	}
	public long getAverageDaysSalesOutstanding() {
		return averageDaysSalesOutstanding;
	}
	public void setAverageDaysSalesOutstanding(long averageDaysSalesOutstanding) {
		this.averageDaysSalesOutstanding = averageDaysSalesOutstanding;
	}
	
}
