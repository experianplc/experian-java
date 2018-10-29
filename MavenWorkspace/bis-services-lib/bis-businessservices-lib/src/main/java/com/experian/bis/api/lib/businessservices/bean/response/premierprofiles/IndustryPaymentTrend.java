package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class IndustryPaymentTrend {

	private String sic;
	private TradePaymentTrend[] trends;
	public String getSic() {
		return sic;
	}
	public void setSic(String sic) {
		this.sic = sic;
	}
	public TradePaymentTrend[] getTrends() {
		return trends;
	}
	public void setTrends(TradePaymentTrend[] trends) {
		this.trends = trends;
	}
	
}
