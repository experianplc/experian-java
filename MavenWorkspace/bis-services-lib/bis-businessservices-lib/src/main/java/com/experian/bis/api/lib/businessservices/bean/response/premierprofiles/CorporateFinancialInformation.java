package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class CorporateFinancialInformation {
	
	private String currentDate;
	private String fiscalYearEndDate;
	private BalanceSheet[] balanceSheets;
	private OperatingStatement[] operatingStatements;
	private CriticalDataAndFinancialRatios[] criticalDataAndFinancialRatios;
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	public String getFiscalYearEndDate() {
		return fiscalYearEndDate;
	}
	public void setFiscalYearEndDate(String fiscalYearEndDate) {
		this.fiscalYearEndDate = fiscalYearEndDate;
	}
	public BalanceSheet[] getBalanceSheets() {
		return balanceSheets;
	}
	public void setBalanceSheets(BalanceSheet[] balanceSheets) {
		this.balanceSheets = balanceSheets;
	}
	public OperatingStatement[] getOperatingStatements() {
		return operatingStatements;
	}
	public void setOperatingStatements(OperatingStatement[] operatingStatements) {
		this.operatingStatements = operatingStatements;
	}
	public CriticalDataAndFinancialRatios[] getCriticalDataAndFinancialRatios() {
		return criticalDataAndFinancialRatios;
	}
	public void setCriticalDataAndFinancialRatios(CriticalDataAndFinancialRatios[] criticalDataAndFinancialRatios) {
		this.criticalDataAndFinancialRatios = criticalDataAndFinancialRatios;
	}

}
