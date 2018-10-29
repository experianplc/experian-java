package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

import com.experian.bis.api.lib.businessservices.bean.response.BusinessServiceResponse;

public class PremierProfilesServiceResponse extends BusinessServiceResponse {
	
	private PPRResult results;
	public PPRResult getResults() {
		return results;
	}
	public void setResults(PPRResult results) {
		this.results = results;
	}

}
