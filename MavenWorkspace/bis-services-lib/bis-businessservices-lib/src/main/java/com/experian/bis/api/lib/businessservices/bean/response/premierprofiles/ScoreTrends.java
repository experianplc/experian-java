package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class ScoreTrends {
	
	private String quarter;
	private long score;
	private long industryScore;
	public String getQuarter() {
		return quarter;
	}
	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}
	public long getIndustryScore() {
		return industryScore;
	}
	public void setIndustryScore(long industryScore) {
		this.industryScore = industryScore;
	}

}
