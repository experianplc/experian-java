package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class CommercialFraudShieldSummary {

	private String matchingBusinessIndicator;
	private boolean activeBusinessIndicator;
	private OFACMatchWarning ofacMatchWarning;
	private boolean businessVictimStatementIndicator;
	private boolean businessRiskTriggersIndicator;
	private boolean nameAddressVerificationIndicator;
	private String[] businessRiskTriggersStatement;
	
	public boolean isActiveBusinessIndicator() {
		return activeBusinessIndicator;
	}
	public void setActiveBusinessIndicator(boolean activeBusinessIndicator) {
		this.activeBusinessIndicator = activeBusinessIndicator;
	}
	public OFACMatchWarning getOfacMatchWarning() {
		return ofacMatchWarning;
	}
	public void setOfacMatchWarning(OFACMatchWarning ofacMatchWarning) {
		this.ofacMatchWarning = ofacMatchWarning;
	}
	public boolean isBusinessVictimStatementIndicator() {
		return businessVictimStatementIndicator;
	}
	public void setBusinessVictimStatementIndicator(boolean businessVictimStatementIndicator) {
		this.businessVictimStatementIndicator = businessVictimStatementIndicator;
	}
	public boolean isBusinessRiskTriggersIndicator() {
		return businessRiskTriggersIndicator;
	}
	public void setBusinessRiskTriggersIndicator(boolean businessRiskTriggersIndicator) {
		this.businessRiskTriggersIndicator = businessRiskTriggersIndicator;
	}
	public String getMatchingBusinessIndicator() {
		return matchingBusinessIndicator;
	}
	public void setMatchingBusinessIndicator(String matchingBusinessIndicator) {
		this.matchingBusinessIndicator = matchingBusinessIndicator;
	}
	public boolean isNameAddressVerificationIndicator() {
		return nameAddressVerificationIndicator;
	}
	public void setNameAddressVerificationIndicator(boolean nameAddressVerificationIndicator) {
		this.nameAddressVerificationIndicator = nameAddressVerificationIndicator;
	}
	public String[] getBusinessRiskTriggersStatement() {
		return businessRiskTriggersStatement;
	}
	public void setBusinessRiskTriggersStatement(String[] businessRiskTriggersStatement) {
		this.businessRiskTriggersStatement = businessRiskTriggersStatement;
	}
	
}
