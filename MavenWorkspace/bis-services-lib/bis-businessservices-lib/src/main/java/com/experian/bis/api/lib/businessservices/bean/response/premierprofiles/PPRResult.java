package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PPRResult {
	
	private BusinessHeaderResult businessHeader;
	private BusCollectionsDetailResult[] collectionsDetail;
	private TradePaymentExperiencesResult[] tradePaymentExperiences;
	private TradePaymentExperiencesResult[] additionalPaymentExperiences;
	private PaymentTotalsResult paymentTotals;
	private TradePaymentTrend[] monthlyPaymentTrends;
	private IndustryPaymentTrend industryPaymentTrends;
	private TradePaymentTrend[] quarterlyPaymentTrends;
	private BankruptcyDetail[] bankruptcyDetail;
	private LienDetail[] taxLienDetail;
	private JudgmentDetail[] judgmentDetail;
	private UCCFilingsSummary uccFilingsSummary;
	private UCCFilingsDetail[] uccFilingsDetail;
	private CorporateRegistration corporateRegistration;
	private ExecutiveInformation[] executiveInformation;
	private BusinessFacts businessFacts;
	private CorporateLinkage[] corporateLinkage;
	private CommercialFraudShieldSummary commercialFraudShieldSummary;
	private ExpandedCreditSummary expandedCreditSummary;//Wrong name in the Swagger DOC
	private Inquiries[] inquiries;//Wrong name in the DOC
	private Competitors[] competitors;//Wrong name in the DOC
	private ProprietorNameAndAddress[] proprietorNameAndAddress;//Wrong name in the DOC
	private UCCCoDebtors[] uccCoDebtors;//Wrong name in the DOC
	private SICCode[] sicCodes;
	private NAICSCode[] naicsCodes;
	private ScoreInformation scoreInformation; //No information provided in the swagger doc
	private String stockExchange;
	private Fortune1000[] fortune1000;
	private String enhancedBusinessDescription;
	private CorporateFinancialInformation corporateFinancialInformation;//Wrong name in the DOC
	private ConsumerStatement[] consumerStatement;//Wrong name in the DOC
	private CommercialGovernmentEntityCode commercialGovernmentEntityCode;//Wrong name in the DOC
	private EconomicDiversity economicDiversity;//Wrong name in the DOC
	private GovernmentActivity governmentActivity;//Wrong name in the DOC
	private ContractSpendingSummary contractSpendingSummary;//Wrong name in the DOC
	private ContractSpendingDetail[] contractSpendingDetail;//Wrong name in the DOC
	private ExecutiveSummary executiveSummary;
	private CommercialBankInformation[] commercialBankInformation;
	private LeasingInformation[] leasingInformation;
	private LicenseDetails[] licenseDetails;
	private BondDetails[] bondDetails;
	private InsuranceDetails[] insuranceDetails;
	private Stocks stocks;
	
	public BusinessHeaderResult getBusinessHeader() {
		return businessHeader;
	}
	public void setBusinessHeader(BusinessHeaderResult businessHeader) {
		this.businessHeader = businessHeader;
	}
	public BusCollectionsDetailResult[] getCollectionsDetail() {
		return collectionsDetail;
	}
	public void setCollectionsDetail(BusCollectionsDetailResult[] collectionsDetail) {
		this.collectionsDetail = collectionsDetail;
	}
	public TradePaymentExperiencesResult[] getTradePaymentExperiences() {
		return tradePaymentExperiences;
	}
	public void setTradePaymentExperiences(TradePaymentExperiencesResult[] tradePaymentExperiences) {
		this.tradePaymentExperiences = tradePaymentExperiences;
	}
	public TradePaymentExperiencesResult[] getAdditionalPaymentExperiences() {
		return additionalPaymentExperiences;
	}
	public void setAdditionalPaymentExperiences(TradePaymentExperiencesResult[] additionalPaymentExperiences) {
		this.additionalPaymentExperiences = additionalPaymentExperiences;
	}
	public PaymentTotalsResult getPaymentTotals() {
		return paymentTotals;
	}
	public void setPaymentTotals(PaymentTotalsResult paymentTotals) {
		this.paymentTotals = paymentTotals;
	}
	public TradePaymentTrend[] getMonthlyPaymentTrends() {
		return monthlyPaymentTrends;
	}
	public void setMonthlyPaymentTrends(TradePaymentTrend[] monthlyPaymentTrends) {
		this.monthlyPaymentTrends = monthlyPaymentTrends;
	}
	public IndustryPaymentTrend getIndustryPaymentTrends() {
		return industryPaymentTrends;
	}
	public void setIndustryPaymentTrends(IndustryPaymentTrend industryPaymentTrends) {
		this.industryPaymentTrends = industryPaymentTrends;
	}
	public TradePaymentTrend[] getQuarterlyPaymentTrends() {
		return quarterlyPaymentTrends;
	}
	public void setQuarterlyPaymentTrends(TradePaymentTrend[] quarterlyPaymentTrends) {
		this.quarterlyPaymentTrends = quarterlyPaymentTrends;
	}
	public BankruptcyDetail[] getBankruptcyDetail() {
		return bankruptcyDetail;
	}
	public void setBankruptcyDetail(BankruptcyDetail[] bankruptcyDetail) {
		this.bankruptcyDetail = bankruptcyDetail;
	}
	public LienDetail[] getTaxLienDetail() {
		return taxLienDetail;
	}
	public void setTaxLienDetail(LienDetail[] taxLienDetail) {
		this.taxLienDetail = taxLienDetail;
	}
	public JudgmentDetail[] getJudgmentDetail() {
		return judgmentDetail;
	}
	public void setJudgmentDetail(JudgmentDetail[] judgmentDetail) {
		this.judgmentDetail = judgmentDetail;
	}
	public UCCFilingsSummary getUccFilingsSummary() {
		return uccFilingsSummary;
	}
	public void setUccFilingsSummary(UCCFilingsSummary uccFilingsSummary) {
		this.uccFilingsSummary = uccFilingsSummary;
	}
	public UCCFilingsDetail[] getUccFilingsDetail() {
		return uccFilingsDetail;
	}
	public void setUccFilingsDetail(UCCFilingsDetail[] uccFilingsDetail) {
		this.uccFilingsDetail = uccFilingsDetail;
	}
	public CorporateRegistration getCorporateRegistration() {
		return corporateRegistration;
	}
	public void setCorporateRegistration(CorporateRegistration corporateRegistration) {
		this.corporateRegistration = corporateRegistration;
	}
	public ExecutiveInformation[] getExecutiveInformation() {
		return executiveInformation;
	}
	public void setExecutiveInformation(ExecutiveInformation[] executiveInformation) {
		this.executiveInformation = executiveInformation;
	}
	public BusinessFacts getBusinessFacts() {
		return businessFacts;
	}
	public void setBusinessFacts(BusinessFacts businessFacts) {
		this.businessFacts = businessFacts;
	}
	public CorporateLinkage[] getCorporateLinkage() {
		return corporateLinkage;
	}
	public void setCorporateLinkage(CorporateLinkage[] corporateLinkage) {
		this.corporateLinkage = corporateLinkage;
	}
	public CommercialFraudShieldSummary getCommercialFraudShieldSummary() {
		return commercialFraudShieldSummary;
	}
	public void setCommercialFraudShieldSummary(CommercialFraudShieldSummary commercialFraudShieldSummary) {
		this.commercialFraudShieldSummary = commercialFraudShieldSummary;
	}
	public ExpandedCreditSummary getExpandedCreditSummary() {
		return expandedCreditSummary;
	}
	public void setExpandedCreditSummary(ExpandedCreditSummary expandedCreditSummary) {
		this.expandedCreditSummary = expandedCreditSummary;
	}
	public Inquiries[] getInquiries() {
		return inquiries;
	}
	public void setInquiries(Inquiries[] inquiries) {
		this.inquiries = inquiries;
	}
	public Competitors[] getCompetitors() {
		return competitors;
	}
	public void setCompetitors(Competitors[] competitors) {
		this.competitors = competitors;
	}
	public ProprietorNameAndAddress[] getProprietorNameAndAddress() {
		return proprietorNameAndAddress;
	}
	public void setProprietorNameAndAddress(ProprietorNameAndAddress[] proprietorNameAndAddress) {
		this.proprietorNameAndAddress = proprietorNameAndAddress;
	}
	public UCCCoDebtors[] getUccCoDebtors() {
		return uccCoDebtors;
	}
	public void setUccCoDebtors(UCCCoDebtors[] uccCoDebtors) {
		this.uccCoDebtors = uccCoDebtors;
	}
	public SICCode[] getSicCodes() {
		return sicCodes;
	}
	public void setSicCodes(SICCode[] sicCodes) {
		this.sicCodes = sicCodes;
	}
	public NAICSCode[] getNaicsCodes() {
		return naicsCodes;
	}
	public void setNaicsCodes(NAICSCode[] naicsCodes) {
		this.naicsCodes = naicsCodes;
	}
	public ScoreInformation getScoreInformation() {
		return scoreInformation;
	}
	public void setScoreInformation(ScoreInformation scoreInformation) {
		this.scoreInformation = scoreInformation;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public Fortune1000[] getFortune1000() {
		return fortune1000;
	}
	public void setFortune1000(Fortune1000[] fortune1000) {
		this.fortune1000 = fortune1000;
	}
	public String getEnhancedBusinessDescription() {
		return enhancedBusinessDescription;
	}
	public void setEnhancedBusinessDescription(String enhancedBusinessDescription) {
		this.enhancedBusinessDescription = enhancedBusinessDescription;
	}
	public CorporateFinancialInformation getCorporateFinancialInformation() {
		return corporateFinancialInformation;
	}
	public void setCorporateFinancialInformation(CorporateFinancialInformation corporateFinancialInformation) {
		this.corporateFinancialInformation = corporateFinancialInformation;
	}
	public ConsumerStatement[] getConsumerStatement() {
		return consumerStatement;
	}
	public void setConsumerStatement(ConsumerStatement[] consumerStatement) {
		this.consumerStatement = consumerStatement;
	}
	public CommercialGovernmentEntityCode getCommercialGovernmentEntityCode() {
		return commercialGovernmentEntityCode;
	}
	public void setCommercialGovernmentEntityCode(CommercialGovernmentEntityCode commercialGovernmentEntityCode) {
		this.commercialGovernmentEntityCode = commercialGovernmentEntityCode;
	}
	public EconomicDiversity getEconomicDiversity() {
		return economicDiversity;
	}
	public void setEconomicDiversity(EconomicDiversity economicDiversity) {
		this.economicDiversity = economicDiversity;
	}
	public GovernmentActivity getGovernmentActivity() {
		return governmentActivity;
	}
	public void setGovernmentActivity(GovernmentActivity governmentActivity) {
		this.governmentActivity = governmentActivity;
	}
	public ContractSpendingSummary getContractSpendingSummary() {
		return contractSpendingSummary;
	}
	public void setContractSpendingSummary(ContractSpendingSummary contractSpendingSummary) {
		this.contractSpendingSummary = contractSpendingSummary;
	}
	public ContractSpendingDetail[] getContractSpendingDetail() {
		return contractSpendingDetail;
	}
	public void setContractSpendingDetail(ContractSpendingDetail[] contractSpendingDetail) {
		this.contractSpendingDetail = contractSpendingDetail;
	}
	public ExecutiveSummary getExecutiveSummary() {
		return executiveSummary;
	}
	public void setExecutiveSummary(ExecutiveSummary executiveSummary) {
		this.executiveSummary = executiveSummary;
	}
	public CommercialBankInformation[] getCommercialBankInformation() {
		return commercialBankInformation;
	}
	public void setCommercialBankInformation(CommercialBankInformation[] commercialBankInformation) {
		this.commercialBankInformation = commercialBankInformation;
	}
	public LeasingInformation[] getLeasingInformation() {
		return leasingInformation;
	}
	public void setLeasingInformation(LeasingInformation[] leasingInformation) {
		this.leasingInformation = leasingInformation;
	}
	public LicenseDetails[] getLicenseDetails() {
		return licenseDetails;
	}
	public void setLicenseDetails(LicenseDetails[] licenseDetails) {
		this.licenseDetails = licenseDetails;
	}
	public BondDetails[] getBondDetails() {
		return bondDetails;
	}
	public void setBondDetails(BondDetails[] bondDetails) {
		this.bondDetails = bondDetails;
	}
	public InsuranceDetails[] getInsuranceDetails() {
		return insuranceDetails;
	}
	public void setInsuranceDetails(InsuranceDetails[] insuranceDetails) {
		this.insuranceDetails = insuranceDetails;
	}
	public Stocks getStocks() {
		return stocks;
	}
	public void setStocks(Stocks stocks) {
		this.stocks = stocks;
	}
	
}