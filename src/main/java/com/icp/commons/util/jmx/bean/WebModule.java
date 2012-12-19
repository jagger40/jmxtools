package com.icp.commons.util.jmx.bean;

public class WebModule {


	//Time (in milliseconds since January 1, 1970, 00:00:00) when this context was started
	private Long startTime;
	//Cumulative execution times of all servlets in this context
	private Long processingTime;
	private String deploymentDescriptor;
	private String webappVersion;
	private String baseName;
	//The document root for this web application
	private String docBase;
	//The name of this Context
	private String name;
	//The context path for this Context
	private String path;
	//The session timeout (in minutes) for this web application
	private int sessionTimeout;
	//The name of the LifecycleState that this component is currently in
	private String stateName;
	//The display name of this web application
	private String displayName;
	
	//host name
	private String host;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public Long getStartTime() {
		return startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}
	public Long getProcessingTime() {
		return processingTime;
	}
	public void setProcessingTime(Long processingTime) {
		this.processingTime = processingTime;
	}
	public String getDeploymentDescriptor() {
		return deploymentDescriptor;
	}
	public void setDeploymentDescriptor(String deploymentDescriptor) {
		this.deploymentDescriptor = deploymentDescriptor;
	}
	public String getWebappVersion() {
		return webappVersion;
	}
	public void setWebappVersion(String webappVersion) {
		this.webappVersion = webappVersion;
	}
	public String getBaseName() {
		return baseName;
	}
	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}
	public String getDocBase() {
		return docBase;
	}
	public void setDocBase(String docBase) {
		this.docBase = docBase;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getSessionTimeout() {
		return sessionTimeout;
	}
	public void setSessionTimeout(int sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
}
