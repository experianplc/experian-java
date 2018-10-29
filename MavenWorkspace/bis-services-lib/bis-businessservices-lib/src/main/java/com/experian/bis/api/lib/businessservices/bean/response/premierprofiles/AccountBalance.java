package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class AccountBalance {
	
	private String modifier;
	private long amount;
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
}
