package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

import com.experian.bis.api.lib.businessservices.bean.response.CodeAndDefinitionResult;

public class TradePaymentExperiencesResult {
	
	private PaymentIndicator paymentIndicator;
	private String businessCategory;
	private String dateReported;
	private String dateLastActivity;
	private String terms;
	private RecentHighCredit recentHighCredit;
	private AccountBalance accountBalance;
	private long currentPercentage;
	private long dbt30;
	private long dbt60;
	private long dbt90;
	private long dbt91Plus;
	private String comments;
	private TradelineFlag tradelineFlag;
	private CodeAndDefinitionResult newlyReportedIndicator;
	private String customerDisputeIndicator;
	private long itipConsolidatedNumber;
	public PaymentIndicator getPaymentIndicator() {
		return paymentIndicator;
	}
	public void setPaymentIndicator(PaymentIndicator paymentIndicator) {
		this.paymentIndicator = paymentIndicator;
	}
	public String getBusinessCategory() {
		return businessCategory;
	}
	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}
	public String getDateReported() {
		return dateReported;
	}
	public void setDateReported(String dateReported) {
		this.dateReported = dateReported;
	}
	public String getDateLastActivity() {
		return dateLastActivity;
	}
	public void setDateLastActivity(String dateLastActivity) {
		this.dateLastActivity = dateLastActivity;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	public RecentHighCredit getRecentHighCredit() {
		return recentHighCredit;
	}
	public void setRecentHighCredit(RecentHighCredit recentHighCredit) {
		this.recentHighCredit = recentHighCredit;
	}
	public AccountBalance getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(AccountBalance accountBalance) {
		this.accountBalance = accountBalance;
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
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public TradelineFlag getTradelineFlag() {
		return tradelineFlag;
	}
	public void setTradelineFlag(TradelineFlag tradelineFlag) {
		this.tradelineFlag = tradelineFlag;
	}
	public CodeAndDefinitionResult getNewlyReportedIndicator() {
		return newlyReportedIndicator;
	}
	public void setNewlyReportedIndicator(CodeAndDefinitionResult newlyReportedIndicator) {
		this.newlyReportedIndicator = newlyReportedIndicator;
	}
	public String getCustomerDisputeIndicator() {
		return customerDisputeIndicator;
	}
	public void setCustomerDisputeIndicator(String customerDisputeIndicator) {
		this.customerDisputeIndicator = customerDisputeIndicator;
	}
	public long getItipConsolidatedNumber() {
		return itipConsolidatedNumber;
	}
	public void setItipConsolidatedNumber(long itipConsolidatedNumber) {
		this.itipConsolidatedNumber = itipConsolidatedNumber;
	}
	
	
	

}
