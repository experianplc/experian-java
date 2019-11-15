package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class ExpandedCreditSummary {
	
	private long bankruptcyCount;
	private String oldestBankruptcyDate;
	private String mostRecentBankruptcyDate;
	private long taxLienCount;
	private String oldestTaxLienDate;
	private String mostRecentTaxLienDate;
	private long judgmentCount;
	private String oldestJudgmentDate;
	private String mostRecentJudgmentDate;
	private long collectionCount;
	private long collectionBalance;
	private long collectionCountPast24Months;
	private long legalBalance;
	private long uccFilings;
	private long uccDerogatoryCount;
	private long currentAccountBalance;
	private long currentTradelineCount;
	private long monthlyAverageDbt;
	private long highestDbt6Months;
	private long highestDbt5Quarters;
	private long activeTradelineCount;
	private long allTradelineBalance;
	private long allTradelineCount;
	private long averageBalance5Quarters;
	private long singleHighCredit;
	private long lowBalance6Months;
	private long highBalance6Months;
	private String oldestCollectionDate;
	private String mostRecentCollectionDate;
	private long currentDbt;
	private String oldestUccDate;
	private String mostRecentUccDate;
	private boolean bankruptcyIndicator;
	private boolean judgmentIndicator;
	private boolean taxLienIndicator;
	private long tradeCollectionCount;
	private long tradeCollectionBalance;
	private long openCollectionCount;
	private long openCollectionBalance;
	private OFACMatchWarningPPRExpandedCreditSummary ofacMatchWarning;
	private boolean victimStatementIndicator;
	private long commercialFraudRiskIndicatorCount;
	private long unsummarizedTradelineCount;
	public long getBankruptcyCount() {
		return bankruptcyCount;
	}
	public void setBankruptcyCount(long bankruptcyCount) {
		this.bankruptcyCount = bankruptcyCount;
	}
	public String getOldestBankruptcyDate() {
		return oldestBankruptcyDate;
	}
	public void setOldestBankruptcyDate(String oldestBankruptcyDate) {
		this.oldestBankruptcyDate = oldestBankruptcyDate;
	}
	public String getMostRecentBankruptcyDate() {
		return mostRecentBankruptcyDate;
	}
	public void setMostRecentBankruptcyDate(String mostRecentBankruptcyDate) {
		this.mostRecentBankruptcyDate = mostRecentBankruptcyDate;
	}
	public long getTaxLienCount() {
		return taxLienCount;
	}
	public void setTaxLienCount(long taxLienCount) {
		this.taxLienCount = taxLienCount;
	}
	public String getOldestTaxLienDate() {
		return oldestTaxLienDate;
	}
	public void setOldestTaxLienDate(String oldestTaxLienDate) {
		this.oldestTaxLienDate = oldestTaxLienDate;
	}
	public String getMostRecentTaxLienDate() {
		return mostRecentTaxLienDate;
	}
	public void setMostRecentTaxLienDate(String mostRecentTaxLienDate) {
		this.mostRecentTaxLienDate = mostRecentTaxLienDate;
	}
	public long getJudgmentCount() {
		return judgmentCount;
	}
	public void setJudgmentCount(long judgmentCount) {
		this.judgmentCount = judgmentCount;
	}
	public String getOldestJudgmentDate() {
		return oldestJudgmentDate;
	}
	public void setOldestJudgmentDate(String oldestJudgmentDate) {
		this.oldestJudgmentDate = oldestJudgmentDate;
	}
	public String getMostRecentJudgmentDate() {
		return mostRecentJudgmentDate;
	}
	public void setMostRecentJudgmentDate(String mostRecentJudgmentDate) {
		this.mostRecentJudgmentDate = mostRecentJudgmentDate;
	}
	public long getCollectionCount() {
		return collectionCount;
	}
	public void setCollectionCount(long collectionCount) {
		this.collectionCount = collectionCount;
	}
	public long getCollectionBalance() {
		return collectionBalance;
	}
	public void setCollectionBalance(long collectionBalance) {
		this.collectionBalance = collectionBalance;
	}
	public long getCollectionCountPast24Months() {
		return collectionCountPast24Months;
	}
	public void setCollectionCountPast24Months(long collectionCountPast24Months) {
		this.collectionCountPast24Months = collectionCountPast24Months;
	}
	public long getLegalBalance() {
		return legalBalance;
	}
	public void setLegalBalance(long legalBalance) {
		this.legalBalance = legalBalance;
	}
	public long getUccFilings() {
		return uccFilings;
	}
	public void setUccFilings(long uccFilings) {
		this.uccFilings = uccFilings;
	}
	public long getUccDerogatoryCount() {
		return uccDerogatoryCount;
	}
	public void setUccDerogatoryCount(long uccDerogatoryCount) {
		this.uccDerogatoryCount = uccDerogatoryCount;
	}
	public long getCurrentAccountBalance() {
		return currentAccountBalance;
	}
	public void setCurrentAccountBalance(long currentAccountBalance) {
		this.currentAccountBalance = currentAccountBalance;
	}
	public long getCurrentTradelineCount() {
		return currentTradelineCount;
	}
	public void setCurrentTradelineCount(long currentTradelineCount) {
		this.currentTradelineCount = currentTradelineCount;
	}
	public long getMonthlyAverageDbt() {
		return monthlyAverageDbt;
	}
	public void setMonthlyAverageDbt(long monthlyAverageDbt) {
		this.monthlyAverageDbt = monthlyAverageDbt;
	}
	public long getHighestDbt6Months() {
		return highestDbt6Months;
	}
	public void setHighestDbt6Months(long highestDbt6Months) {
		this.highestDbt6Months = highestDbt6Months;
	}
	public long getHighestDbt5Quarters() {
		return highestDbt5Quarters;
	}
	public void setHighestDbt5Quarters(long highestDbt5Quarters) {
		this.highestDbt5Quarters = highestDbt5Quarters;
	}
	public long getActiveTradelineCount() {
		return activeTradelineCount;
	}
	public void setActiveTradelineCount(long activeTradelineCount) {
		this.activeTradelineCount = activeTradelineCount;
	}
	public long getAllTradelineBalance() {
		return allTradelineBalance;
	}
	public void setAllTradelineBalance(long allTradelineBalance) {
		this.allTradelineBalance = allTradelineBalance;
	}
	public long getAllTradelineCount() {
		return allTradelineCount;
	}
	public void setAllTradelineCount(long allTradelineCount) {
		this.allTradelineCount = allTradelineCount;
	}
	public long getAverageBalance5Quarters() {
		return averageBalance5Quarters;
	}
	public void setAverageBalance5Quarters(long averageBalance5Quarters) {
		this.averageBalance5Quarters = averageBalance5Quarters;
	}
	public long getSingleHighCredit() {
		return singleHighCredit;
	}
	public void setSingleHighCredit(long singleHighCredit) {
		this.singleHighCredit = singleHighCredit;
	}
	public long getLowBalance6Months() {
		return lowBalance6Months;
	}
	public void setLowBalance6Months(long lowBalance6Months) {
		this.lowBalance6Months = lowBalance6Months;
	}
	public long getHighBalance6Months() {
		return highBalance6Months;
	}
	public void setHighBalance6Months(long highBalance6Months) {
		this.highBalance6Months = highBalance6Months;
	}
	public String getOldestCollectionDate() {
		return oldestCollectionDate;
	}
	public void setOldestCollectionDate(String oldestCollectionDate) {
		this.oldestCollectionDate = oldestCollectionDate;
	}
	public String getMostRecentCollectionDate() {
		return mostRecentCollectionDate;
	}
	public void setMostRecentCollectionDate(String mostRecentCollectionDate) {
		this.mostRecentCollectionDate = mostRecentCollectionDate;
	}
	public long getCurrentDbt() {
		return currentDbt;
	}
	public void setCurrentDbt(long currentDbt) {
		this.currentDbt = currentDbt;
	}
	public String getOldestUccDate() {
		return oldestUccDate;
	}
	public void setOldestUccDate(String oldestUccDate) {
		this.oldestUccDate = oldestUccDate;
	}
	public String getMostRecentUccDate() {
		return mostRecentUccDate;
	}
	public void setMostRecentUccDate(String mostRecentUccDate) {
		this.mostRecentUccDate = mostRecentUccDate;
	}
	public boolean isBankruptcyIndicator() {
		return bankruptcyIndicator;
	}
	public void setBankruptcyIndicator(boolean bankruptcyIndicator) {
		this.bankruptcyIndicator = bankruptcyIndicator;
	}
	public boolean isJudgmentIndicator() {
		return judgmentIndicator;
	}
	public void setJudgmentIndicator(boolean judgmentIndicator) {
		this.judgmentIndicator = judgmentIndicator;
	}
	public boolean isTaxLienIndicator() {
		return taxLienIndicator;
	}
	public void setTaxLienIndicator(boolean taxLienIndicator) {
		this.taxLienIndicator = taxLienIndicator;
	}
	public long getTradeCollectionCount() {
		return tradeCollectionCount;
	}
	public void setTradeCollectionCount(long tradeCollectionCount) {
		this.tradeCollectionCount = tradeCollectionCount;
	}
	public long getTradeCollectionBalance() {
		return tradeCollectionBalance;
	}
	public void setTradeCollectionBalance(long tradeCollectionBalance) {
		this.tradeCollectionBalance = tradeCollectionBalance;
	}
	public long getOpenCollectionCount() {
		return openCollectionCount;
	}
	public void setOpenCollectionCount(long openCollectionCount) {
		this.openCollectionCount = openCollectionCount;
	}
	public long getOpenCollectionBalance() {
		return openCollectionBalance;
	}
	public void setOpenCollectionBalance(long openCollectionBalance) {
		this.openCollectionBalance = openCollectionBalance;
	}
	public OFACMatchWarningPPRExpandedCreditSummary getOfacMatchWarning() {
		return ofacMatchWarning;
	}
	public void setOfacMatchWarning(OFACMatchWarningPPRExpandedCreditSummary ofacMatchWarning) {
		this.ofacMatchWarning = ofacMatchWarning;
	}
	public boolean isVictimStatementIndicator() {
		return victimStatementIndicator;
	}
	public void setVictimStatementIndicator(boolean victimStatementIndicator) {
		this.victimStatementIndicator = victimStatementIndicator;
	}
	public long getCommercialFraudRiskIndicatorCount() {
		return commercialFraudRiskIndicatorCount;
	}
	public void setCommercialFraudRiskIndicatorCount(long commercialFraudRiskIndicatorCount) {
		this.commercialFraudRiskIndicatorCount = commercialFraudRiskIndicatorCount;
	}
	public long getUnsummarizedTradelineCount() {
		return unsummarizedTradelineCount;
	}
	public void setUnsummarizedTradelineCount(long unsummarizedTradelineCount) {
		this.unsummarizedTradelineCount = unsummarizedTradelineCount;
	}

}
