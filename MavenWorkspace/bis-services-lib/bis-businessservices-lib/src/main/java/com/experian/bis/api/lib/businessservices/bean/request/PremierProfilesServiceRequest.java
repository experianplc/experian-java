package com.experian.bis.api.lib.businessservices.bean.request;

public class PremierProfilesServiceRequest extends BusinessServiceRequest {
	private String modelCode;
	private String comments;
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
