package com.icp.commons.util.jmx.bean;

public class WebModuleManager {
		
	private int maxActive;
	
	private int maxActiveSessions;
	
	private int sessionMaxAliveTime;
	
	private int activeSessions;
	
	private int sessionCounter;
	
	private String stateName;


	public int getMaxActive() {
		return maxActive;
	}

	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}

	public int getMaxActiveSessions() {
		return maxActiveSessions;
	}

	public void setMaxActiveSessions(int maxActiveSessions) {
		this.maxActiveSessions = maxActiveSessions;
	}

	public int getSessionMaxAliveTime() {
		return sessionMaxAliveTime;
	}

	public void setSessionMaxAliveTime(int sessionMaxAliveTime) {
		this.sessionMaxAliveTime = sessionMaxAliveTime;
	}

	public int getActiveSessions() {
		return activeSessions;
	}

	public void setActiveSessions(int activeSessions) {
		this.activeSessions = activeSessions;
	}

	public int getSessionCounter() {
		return sessionCounter;
	}

	public void setSessionCounter(int sessionCounter) {
		this.sessionCounter = sessionCounter;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
}
