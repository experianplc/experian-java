package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class TradeLine {
	
	private long numberOfLines;
	private long currentDbt;
	private AmountModifier totalHighCreditAmount;
	private AmountModifier totalAccountBalance;
	private long currentPercentage;
	private long dbt;
	private long dbt30;
	private long dbt60;
	private long dbt90;
	private long dbt91Plus;
	
	
	public long getCurrentDbt() {
		return currentDbt;
	}
	public void setCurrentDbt(long currentDbt) {
		this.currentDbt = currentDbt;
	}
	public AmountModifier getTotalHighCreditAmount() {
		return totalHighCreditAmount;
	}
	public void setTotalHighCreditAmount(AmountModifier totalHighCreditAmount) {
		this.totalHighCreditAmount = totalHighCreditAmount;
	}
	public AmountModifier getTotalAccountBalance() {
		return totalAccountBalance;
	}
	public void setTotalAccountBalance(AmountModifier totalAccountBalance) {
		this.totalAccountBalance = totalAccountBalance;
	}
	public long getCurrentPercentage() {
		return currentPercentage;
	}
	public void setCurrentPercentage(long currentPercentage) {
		this.currentPercentage = currentPercentage;
	}
	public long getDbt30() {
		return dbt30;
	}
	public void setDbt30(long dbt30) {
		this.dbt30 = dbt30;
	}
	public long getDbt60() {
		return dbt60;
	}
	public void setDbt60(long dbt60) {
		this.dbt60 = dbt60;
	}
	public long getDbt90() {
		return dbt90;
	}
	public void setDbt90(long dbt90) {
		this.dbt90 = dbt90;
	}
	public long getDbt91Plus() {
		return dbt91Plus;
	}
	public void setDbt91Plus(long dbt91Plus) {
		this.dbt91Plus = dbt91Plus;
	}
	public long getNumberOfLines() {
		return numberOfLines;
	}
	public void setNumberOfLines(long numberOfLines) {
		this.numberOfLines = numberOfLines;
	}
	public long getDbt() {
		return dbt;
	}
	public void setDbt(long dbt) {
		this.dbt = dbt;
	}

}
