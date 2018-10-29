package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class TradePaymentTrend {
	
	private String date;
	private long dbt;
	private AmountModifier totalAccountBalance;
	private long currentPercentage;
	private long dbt30;
	private long dbt60;
	private long dbt90;
	private long dbt91Plus;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getDbt() {
		return dbt;
	}
	public void setDbt(long dbt) {
		this.dbt = dbt;
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

}
