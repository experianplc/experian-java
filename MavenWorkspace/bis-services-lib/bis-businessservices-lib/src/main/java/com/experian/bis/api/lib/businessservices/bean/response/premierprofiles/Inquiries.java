package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class Inquiries {

	private String inquiryBusinessCategory;
	private InquiryCount[] inquiryCount;
	public String getInquiryBusinessCategory() {
		return inquiryBusinessCategory;
	}
	public void setInquiryBusinessCategory(String inquiryBusinessCategory) {
		this.inquiryBusinessCategory = inquiryBusinessCategory;
	}
	public InquiryCount[] getInquiryCount() {
		return inquiryCount;
	}
	public void setInquiryCount(InquiryCount[] inquiryCount) {
		this.inquiryCount = inquiryCount;
	}
	
}
