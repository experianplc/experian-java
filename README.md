# Experian BusinessInformation API - Java Library

The Experian Java library provides convenient access to the RESTful Experian BIS APIs from Applications written in Java.
This package is for use with Java Application (Core Java/ J2EE or any similar Java Enabled Platform like Android) that uses Experian client_id, client_secret, username, password and subcode (if applicable).

## Documentation

For Detailed documentation of Experian APIs, visit [Experian Developers Portal](http://developer.experian.com/)

## Java Library Workspace Setup & Development

### Prerequisites

 1. JDK 1.8
 2. Eclipse Mars or newer version
 3. Maven 2+ (or Eclipse Embedded
 4. Git Client (e.g Git Bash)

### Authentication before Calling the API
Authentication service must be invoked before making a call to Experian BIS APIs. The Authentication service provides access token, which is used internally by the API Service classes to access corresponding APIs.
```java	
BISAuthenticationService authService = new BISAuthenticationService(proxy);
BISServiceCredential serviceCredential = authService.getSandboxServiceCredential("username", "password", "clientId", "clientSecret");
```

### BIS Business Services

#### Search
```java
{
	SearchService service = new SearchService(serviceCredential, proxy);
	SearchServiceRequest request = new SearchServiceRequest();
	
	request.setName("EXPERIAN & CONSUMER DIRECT");
	request.setCity("Costa Mesa");
	request.setState("CA");
	request.setSubcode("0517614");
	request.setZip("92626");
	request.setGeo(true);
	SearchServiceResponse response = (SearchServiceResponse) service.execute(request);
}
```

##### Bankruptcies
```java
{		
		BankruptcyService service = new BankruptcyService(serviceCredential);
		BankruptcyServiceRequest request = new BankruptcyServiceRequest();
		request.setBankruptcyDetail(true);
		request.setBin("807205801");
		request.setSubcode("0517614");
		BankruptcyServiceResponse response = (BankruptcyServiceResponse) service.execute(request);
}	
```
##### Business Facts
```java
{
	BusinessFactsService service = new BusinessFactsService(serviceCredential);
	BusinessFactsServiceRequest request = new BusinessFactsServiceRequest();
		
	request.setBin("807205801");
	request.setSubcode("0517614");
	BusinessFactsServiceResponse response = (BusinessFactsServiceResponse) service.execute(request);
}
```

##### Collections
```java
{	
	CollectionsService service = new CollectionsService(serviceCredential);
	CollectionsServiceRequest request = new CollectionsServiceRequest();
		
	request.setCollectionsSummary(true);
	request.setCollectionsDetail(true);
	request.setBin("807205801");
	request.setSubcode("0517614");
	CollectionsServiceResponse response = (CollectionsServiceResponse) service.execute(request);
}
```

##### Corporate Linkage
```java
{
	CorporateLinkageService service = new CorporateLinkageService(serviceCredential);
	CorporateLinkageServiceRequest request = new CorporateLinkageServiceRequest();
	
	request.setCorporateLinkagePartial(true);
	request.setCorporateLinkageFull(true);
	request.setBin("807205801");
	request.setSubcode("0517614");
	CorporateLinkageServiceResponse response = (CorporateLinkageServiceResponse) service.execute(request);
}
```

##### Corporate Registrations
```java
{
	CorporateRegistrationsService service = new CorporateRegistrationsService(serviceCredential);
	CorporateRegistrationsServiceRequest request = new CorporateRegistrationsServiceRequest();
	
	request.setStatusDescriptionDetail(true);
	request.setBin("807205801");
	request.setSubcode("0517614");
	CorporateRegistrationsServiceResponse response = (CorporateRegistrationsServiceResponse) service.execute(request);
}	
```
##### Credit Status
```java
{
	CreditStatusService service = new CreditStatusService(serviceCredential);
	CreditStatusServiceRequest request = new CreditStatusServiceRequest();
	
	request.setBin("807205801");
	request.setSubcode("0517614");
	CreditStatusServiceResponse response = (CreditStatusServiceResponse) service.execute(request);
}
```
##### Fraud Shields
```java
{
	FraudShieldsService service = new FraudShieldsService(serviceCredential);
	FraudShieldsServiceRequest request = new FraudShieldsServiceRequest();
	
	request.setBin("807205801");
	request.setSubcode("0517614");
	FraudShieldsServiceResponse response = (FraudShieldsServiceResponse) service.execute(request);
}
```
#### Headers
```java
{
	HeadersService service = new HeadersService(serviceCredential);
	HeadersServiceRequest request = new HeadersServiceRequest();
	
	request.setBin("807205801");
	request.setSubcode("0517614");
	HeadersServiceResponse response = (HeadersServiceResponse) service.execute(request);
}
```
##### Judgements
```java
{
	JudgmentsService service = new JudgmentsService(serviceCredential);
	JudgmentsServiceRequest request = new JudgmentsServiceRequest();

	request.setJudgmentSummary(true);
	request.setJudgmentDetail(true);
	request.setBin("807205801");
	request.setSubcode("0517614");
	JudgmentsServiceResponse response = (JudgmentsServiceResponse) service.execute(request);
}
```

##### Legal Collection Summaries
```java
{
	LegalCollectionsSummariesService service = new LegalCollectionsSummariesService(serviceCredential);
	LegalCollectionsSummariesServiceRequest request = new LegalCollectionsSummariesServiceRequest();

	request.setLegalFilingsCollectionsSummary(true);
	request.setLegalFilingsSummary(true);
	request.setBin("807205801");
	request.setSubcode("0517614");
	LegalCollectionsSummariesServiceResponse response = (LegalCollectionsSummariesServiceResponse) service.execute(request);
}
```
##### Liens
```java
{
	LiensService service = new LiensService(serviceCredential);
	LiensServiceRequest request = new LiensServiceRequest();

	request.setLienSummary(true);
	request.setLienDetail(true);
	request.setBin("807205801");
	request.setSubcode("0517614");
	LiensServiceResponse response = (LiensServiceResponse) service.execute(request);
}
```
##### Risk Dashboards
```java
{
	RiskDashboardsService service = new RiskDashboardsService(serviceCredential);
	RiskDashboardsServiceRequest request = new RiskDashboardsServiceRequest();
	
	request.setBin("807205801");
	request.setSubcode("0517614");
	RiskDashboardsServiceResponse response = (RiskDashboardsServiceResponse) service.execute(request);
}
```
##### Scores
```java
{
	ScoresService service = new ScoresService(serviceCredential);
	ScoresServiceRequest request = new ScoresServiceRequest();
	
	request.setBin("807205801");
	request.setSubcode("0517614");
	request.setModelCode("000224");
	request.setCommercialScore(true);
	request.setFsrScore(true);
	ScoresServiceResponse response = (ScoresServiceResponse) service.execute(request);
}	
```
##### Trades
```java
{
	TradesService service = new TradesService(serviceCredential);
	TradesServiceRequest request = new TradesServiceRequest();

	request.setTradePaymentSummary(true);
	request.setTradePaymentTotals(false);
	request.setTradePaymentExperiences(false);
	request.setTradePaymentTrends(false);
	request.setBin("807205801");
	request.setSubcode("0517614");
	TradesServiceResponse response = (TradesServiceResponse) service.execute(request);
}
```
##### UCC Filings
```java
{
	UCCFilingsService service = new UCCFilingsService(serviceCredential);
	UCCFilingsServiceRequest request = new UCCFilingsServiceRequest();

	request.setUccFilingsSummary(true);
	request.setUccFilingsDetail(true);
	request.setBin("807205801");
	request.setSubcode("0517614");
	UCCFilingsServiceResponse response = (UCCFilingsServiceResponse) service.execute(request);
}
```
##### Reverse Addresses	
```java
{
	ReverseAddressesService service = new ReverseAddressesService(serviceCredential);
	ReverseAddressesServiceRequest request = new ReverseAddressesServiceRequest();
	
	request.setSubcode("0517614");
	request.setStreet("475 ANTON BLVD");
	request.setCity("Costa Mesa");
	request.setState("CA");
	request.setZip("92626");
	ReverseAddressesServiceResponse response = (ReverseAddressesServiceResponse) service.execute(request);
}
```
##### Reverse Phones
```java
{
	ReversePhonesService service = new ReversePhonesService(serviceCredential);
	ReversePhonesServiceRequest request = new ReversePhonesServiceRequest();
	
	request.setSubcode("0517614");
	request.setPhone("8008888888");
	ReversePhonesServiceResponse response = (ReversePhonesServiceResponse) service.execute(request);
}
```
##### Reverse TaxIDs
```java
{
	ReverseTaxIDsService service = new ReverseTaxIDsService(serviceCredential);
	ReverseTaxIDsServiceRequest request = new ReverseTaxIDsServiceRequest();
	
	request.setSubcode("0517614");
	request.setTaxId("222152871");
	ReverseTaxIDsServiceResponse response = (ReverseTaxIDsServiceResponse) service.execute(request);
}
```
##### Business Contacts	
```java
{
	BusinessContactsService service = new BusinessContactsService(serviceCredential);
	BusinessContactsServiceRequest request = new BusinessContactsServiceRequest();
	
	request.setBin("807205801");
	request.setSubcode("0517614");
	BusinessContactsServiceResponse response = (BusinessContactsServiceResponse) service.execute(request);
}
```
##### Scores/Search	
```java
{
	ScoresSearchService service = new ScoresSearchService(serviceCredential);
	ScoresSearchServiceRequest request = new ScoresSearchServiceRequest();
	
	request.setName("EXPERIAN");
	request.setCity("Costa Mesa");
	request.setState("CA");
	request.setSubcode("0517614");
	request.setZip("92626");
	request.setGeo(true);
	request.setMatchReliabilityCode(83);
	request.setCommercialScore(true);
	request.setFsrScore(true);
	ScoresSearchServiceResponse response = (ScoresSearchServiceResponse) service.execute(request);
}
```
##### Business Premier Profiles	
```java
{
	PremierProfilesService service = new PremierProfilesService(serviceCredential);
	PremierProfilesServiceRequest request = new PremierProfilesServiceRequest();

	request.setBin("700003839");
	request.setSubcode("0563776");
	PremierProfilesServiceResponse response = (PremierProfilesServiceResponse) service.execute(request);
}
```
##### Business Aggregates	
```java
{
	AggregatesService service = new AggregatesService(serviceCredential);
	BusinessAggregatesServiceRequest request = new BusinessAggregatesServiceRequest();

	request.setBin("700003839");
	request.setSubcode("0563776");
	AggregatesServiceResponse response = (AggregatesServiceResponse) service.execute(request);
}
```
### BIS Social Media Insights Services

#### SMI Attributes
```java
public SocialMediaAttributesResponse getSMIAttributesSampleResponse(){
	SocialMediaAttributesService service = new SocialMediaAttributesService(serviceCredential);
	SocialMediaAttributesRequest request = new SocialMediaAttributesRequest();
	request.setName("Apple");
	request.setStreet("1 Infinite");
	request.setCity("Cupertino");
	request.setState("CA");
	request.setSubcode("0563736");
	SocialMediaAttributesResponse response = null;
	try {
		@SuppressWarnings("unused")
		response = (SocialMediaAttributesResponse) service.execute(request);
	}
	catch(BISValidationException vex) {
		//Custom validation for invalid data
		System.out.println((new ObjectMapper()).writeValueAsString(vex.getServiceError()));
	}
	catch(BISServiceException ex) {
		//Custom validation for service error
		System.out.println((new ObjectMapper()).writeValueAsString(ex.getServiceError()));
	}
	return response;
}
```


### HTTP Proxy Support
Experian BIS Java Library has built in support for HTTP Proxy. If the Java Library is being used in a API Client which is expected to run on a system, where Proxy is required to access the Experian API URLs, you can easily configure it while using the Java Library. Use the following lines of code to set a proxy.
```java
System.setProperty("javax.net.useSystemProxies", "false");
int port = 8080; //provide your proxy port here
String proxyHost = "hostname"; //provide your proxy host address here
Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, port));
BISAuthenticationService authService = new BISAuthenticationService(proxy);
BISServiceCredential serviceCredential = authService.getSandboxServiceCredential("username", "password", "clientId", "clientSecret");
```
and then create the Service Class as following:
```java
BusinessFactsService service = new BusinessFactsService(serviceCredential, proxy);
```

However this proxy configuration is absolutely optional. You should only pass the second parameter (proxy) to the API Service Classes when your code is running behind a proxy server.

### Exceptions

There are two Custom Exceptions thrown by various Service Classes of the Java Library. These Custom Exceptions are:

##### BISValidationException
Thrown by various service methods when a validation error occurs. Some common reasons for validation errors are datatype mismatch, incorrect format, presence of disallowed characters, value boundary overflow/underflow of various Request Parameters supplied to the service methods. This Custom Exception class is a subclass of `BISServiceException` class.

##### BISServiceException
Thrown by service methods when anything but a validation error occurs. These scenarios may include but not limited to Experian API outage, wrong credentials supplied, an unsual Runtime exception etc. All runtime exceptions are wrapped by this Custom Exception. This Custom Exception class is the superclass of `BISValidationException` class.


### An example `response` object
```
{
    "requestId": "XXXX-XXXX-XXXX-XXXX",
    "success": true,
    "results": [...]
}
```
#### An example `error` object
```
{
    "success": false,
    "requestId": "XXXX-XXXX-XXXX-XXXX",
    "errors": [
        {
            "errorCode": XXXX,
            "errorType": "Error Type",
            "message": "Error Message"
        }
    ]
}
```
---

#### CHANGE LOG : 17th OCT, 2019

1. Excluded Support for Local, Dev, Test and Stage environments
2. Added Support for UAT environment
3. Updated Prod Environment URLs
4. Updated Credentials for Sandbox Environment used in Unit Test Cases and Test Clients
