package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class ConsumerStatement {
	
	private String type;
	private String dateReported;
	private String text;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDateReported() {
		return dateReported;
	}
	public void setDateReported(String dateReported) {
		this.dateReported = dateReported;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
