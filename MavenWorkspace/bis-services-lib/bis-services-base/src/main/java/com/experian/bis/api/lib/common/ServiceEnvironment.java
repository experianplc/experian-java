package com.experian.bis.api.lib.common;

public enum ServiceEnvironment {
	TEST("test"), 
	STAGE("stage"), 
	DEVELOPMENT("dev"), 
	LOCAL("local"),
	PRODUCTION("prod"), 
	SANDBOX("sandbox");

	private String id;

	ServiceEnvironment(String id) {
		this.id = id;
	}

	public String id() {
		return id;
	}
}
