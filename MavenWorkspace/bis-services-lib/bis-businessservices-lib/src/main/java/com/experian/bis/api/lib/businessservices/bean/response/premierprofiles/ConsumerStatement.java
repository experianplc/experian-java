package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class ConsumerStatement {
	
	private Type type;
	private String dateReported;
	private String text;
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
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
