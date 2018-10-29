package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class OFACMatchWarning {

	private long code;
	private String definition;
	private String detailStatement;
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	public String getDetailStatement() {
		return detailStatement;
	}
	public void setDetailStatement(String detailStatement) {
		this.detailStatement = detailStatement;
	}
	
}
