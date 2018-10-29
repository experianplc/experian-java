package com.experian.bis.api.lib.businessservices.bean.response;

public class AggregatesServiceResponse extends BusinessServiceResponse{

	private AggregatesResult results;

	public AggregatesResult getResults() {
		return results;
	}

	public void setResults(AggregatesResult results) {
		this.results = results;
	}
	
}
