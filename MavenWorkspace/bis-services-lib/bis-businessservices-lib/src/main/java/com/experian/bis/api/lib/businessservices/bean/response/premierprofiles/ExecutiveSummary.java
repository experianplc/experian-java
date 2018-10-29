package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

import com.experian.bis.api.lib.businessservices.bean.response.CodeAndDefinitionResult;

public class ExecutiveSummary {
	private AmountModifier lowestTotalAccountBalance;
	private AmountModifier highestTotalAccountBalance;
	private AmountModifier currentTotalAccountBalance;
	private long highCreditAmountExtended;
	private long medianCreditAmountExtended;
	private String industryDescription;
	private CodeAndDefinitionResult businessDbt;
	private long predictedDbt;
	private String predictedDbtDate;
	private long industryDbt;
	private long allIndustryDbt;
	private CodeAndDefinitionResult industryPaymentComparison;
	private CodeAndDefinitionResult paymentTrendIndicator;
	private CommonTerms commonTerms;
	public AmountModifier getLowestTotalAccountBalance() {
		return lowestTotalAccountBalance;
	}
	public void setLowestTotalAccountBalance(AmountModifier lowestTotalAccountBalance) {
		this.lowestTotalAccountBalance = lowestTotalAccountBalance;
	}
	public AmountModifier getHighestTotalAccountBalance() {
		return highestTotalAccountBalance;
	}
	public void setHighestTotalAccountBalance(AmountModifier highestTotalAccountBalance) {
		this.highestTotalAccountBalance = highestTotalAccountBalance;
	}
	public AmountModifier getCurrentTotalAccountBalance() {
		return currentTotalAccountBalance;
	}
	public void setCurrentTotalAccountBalance(AmountModifier currentTotalAccountBalance) {
		this.currentTotalAccountBalance = currentTotalAccountBalance;
	}
	public long getHighCreditAmountExtended() {
		return highCreditAmountExtended;
	}
	public void setHighCreditAmountExtended(long highCreditAmountExtended) {
		this.highCreditAmountExtended = highCreditAmountExtended;
	}
	public long getMedianCreditAmountExtended() {
		return medianCreditAmountExtended;
	}
	public void setMedianCreditAmountExtended(long medianCreditAmountExtended) {
		this.medianCreditAmountExtended = medianCreditAmountExtended;
	}
	public String getIndustryDescription() {
		return industryDescription;
	}
	public void setIndustryDescription(String industryDescription) {
		this.industryDescription = industryDescription;
	}
	public CodeAndDefinitionResult getBusinessDbt() {
		return businessDbt;
	}
	public void setBusinessDbt(CodeAndDefinitionResult businessDbt) {
		this.businessDbt = businessDbt;
	}
	public long getPredictedDbt() {
		return predictedDbt;
	}
	public void setPredictedDbt(long predictedDbt) {
		this.predictedDbt = predictedDbt;
	}
	public String getPredictedDbtDate() {
		return predictedDbtDate;
	}
	public void setPredictedDbtDate(String predictedDbtDate) {
		this.predictedDbtDate = predictedDbtDate;
	}
	public long getIndustryDbt() {
		return industryDbt;
	}
	public void setIndustryDbt(long industryDbt) {
		this.industryDbt = industryDbt;
	}
	public long getAllIndustryDbt() {
		return allIndustryDbt;
	}
	public void setAllIndustryDbt(long allIndustryDbt) {
		this.allIndustryDbt = allIndustryDbt;
	}
	public CodeAndDefinitionResult getIndustryPaymentComparison() {
		return industryPaymentComparison;
	}
	public void setIndustryPaymentComparison(CodeAndDefinitionResult industryPaymentComparison) {
		this.industryPaymentComparison = industryPaymentComparison;
	}
	public CodeAndDefinitionResult getPaymentTrendIndicator() {
		return paymentTrendIndicator;
	}
	public void setPaymentTrendIndicator(CodeAndDefinitionResult paymentTrendIndicator) {
		this.paymentTrendIndicator = paymentTrendIndicator;
	}
	public CommonTerms getCommonTerms() {
		return commonTerms;
	}
	public void setCommonTerms(CommonTerms commonTerms) {
		this.commonTerms = commonTerms;
	}
	
}
