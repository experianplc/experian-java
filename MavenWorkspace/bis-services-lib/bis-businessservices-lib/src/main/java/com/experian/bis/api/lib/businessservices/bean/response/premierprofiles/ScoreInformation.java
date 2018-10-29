package com.experian.bis.api.lib.businessservices.bean.response.premierprofiles;

public class ScoreInformation {
	
	private FsrScore fsrScore;
	private CommercialScore commercialScore;
	private ScoreFactors[] fsrScoreFactors;
	private ScoreFactors[] commercialScoreFactors;
	private ScoreTrends[] fsrScoreTrends;
	private ScoreTrends[] commercialScoreTrends;
	public FsrScore getFsrScore() {
		return fsrScore;
	}
	public void setFsrScore(FsrScore fsrScore) {
		this.fsrScore = fsrScore;
	}
	public CommercialScore getCommercialScore() {
		return commercialScore;
	}
	public void setCommercialScore(CommercialScore commercialScore) {
		this.commercialScore = commercialScore;
	}
	public ScoreFactors[] getFsrScoreFactors() {
		return fsrScoreFactors;
	}
	public void setFsrScoreFactors(ScoreFactors[] fsrScoreFactors) {
		this.fsrScoreFactors = fsrScoreFactors;
	}
	public ScoreFactors[] getCommercialScoreFactors() {
		return commercialScoreFactors;
	}
	public void setCommercialScoreFactors(ScoreFactors[] commercialScoreFactors) {
		this.commercialScoreFactors = commercialScoreFactors;
	}
	public ScoreTrends[] getFsrScoreTrends() {
		return fsrScoreTrends;
	}
	public void setFsrScoreTrends(ScoreTrends[] fsrScoreTrends) {
		this.fsrScoreTrends = fsrScoreTrends;
	}
	public ScoreTrends[] getCommercialScoreTrends() {
		return commercialScoreTrends;
	}
	public void setCommercialScoreTrends(ScoreTrends[] commercialScoreTrends) {
		this.commercialScoreTrends = commercialScoreTrends;
	}

}
