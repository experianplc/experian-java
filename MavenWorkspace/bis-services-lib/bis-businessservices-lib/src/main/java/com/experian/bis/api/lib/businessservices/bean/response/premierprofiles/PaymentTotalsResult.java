package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class PaymentTotalsResult {
	private TradeLine newlyReportedTradelines;
	private TradeLine continuouslyReportedTradelines;
	private TradeLine combinedTradelines;
	private TradeLine additionalTradelines;
	private TradeLine tradelines;
	public TradeLine getNewlyReportedTradelines() {
		return newlyReportedTradelines;
	}
	public void setNewlyReportedTradelines(TradeLine newlyReportedTradelines) {
		this.newlyReportedTradelines = newlyReportedTradelines;
	}
	public TradeLine getContinuouslyReportedTradelines() {
		return continuouslyReportedTradelines;
	}
	public void setContinuouslyReportedTradelines(TradeLine continuouslyReportedTradelines) {
		this.continuouslyReportedTradelines = continuouslyReportedTradelines;
	}
	public TradeLine getCombinedTradelines() {
		return combinedTradelines;
	}
	public void setCombinedTradelines(TradeLine combinedTradelines) {
		this.combinedTradelines = combinedTradelines;
	}
	public TradeLine getAdditionalTradelines() {
		return additionalTradelines;
	}
	public void setAdditionalTradelines(TradeLine additionalTradelines) {
		this.additionalTradelines = additionalTradelines;
	}
	public TradeLine getTradelines() {
		return tradelines;
	}
	public void setTradelines(TradeLine tradelines) {
		this.tradelines = tradelines;
	}

}
