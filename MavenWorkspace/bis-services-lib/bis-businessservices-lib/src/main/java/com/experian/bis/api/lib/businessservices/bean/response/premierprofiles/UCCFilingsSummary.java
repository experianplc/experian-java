package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

import com.experian.bis.api.lib.businessservices.bean.response.UCCFilingsTrendsResult;

public class UCCFilingsSummary {
	
	private String date;
	private long uccFilingsCount;
	private long derogatoryCount;
	private long releasesAndTerminationsCount;
	private long continuationsCount;
	private long amendedAndAssignedCount;
	private UCCFilingsTrendsResult[] uccFilingsTrends;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getUccFilingsCount() {
		return uccFilingsCount;
	}
	public void setUccFilingsCount(long uccFilingsCount) {
		this.uccFilingsCount = uccFilingsCount;
	}
	public long getDerogatoryCount() {
		return derogatoryCount;
	}
	public void setDerogatoryCount(long derogatoryCount) {
		this.derogatoryCount = derogatoryCount;
	}
	public long getReleasesAndTerminationsCount() {
		return releasesAndTerminationsCount;
	}
	public void setReleasesAndTerminationsCount(long releasesAndTerminationsCount) {
		this.releasesAndTerminationsCount = releasesAndTerminationsCount;
	}
	public long getContinuationsCount() {
		return continuationsCount;
	}
	public void setContinuationsCount(long continuationsCount) {
		this.continuationsCount = continuationsCount;
	}
	public long getAmendedAndAssignedCount() {
		return amendedAndAssignedCount;
	}
	public void setAmendedAndAssignedCount(long amendedAndAssignedCount) {
		this.amendedAndAssignedCount = amendedAndAssignedCount;
	}
	public UCCFilingsTrendsResult[] getUccFilingsTrends() {
		return uccFilingsTrends;
	}
	public void setUccFilingsTrends(UCCFilingsTrendsResult[] uccFilingsTrends) {
		this.uccFilingsTrends = uccFilingsTrends;
	}

}
