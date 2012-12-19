package com.icp.commons.util.jmx.bean;

/**
 * java 运行时环境信息
 * */
public class Runtime {

	private String name;
	private String classPath;
	private String bootClassPath;//类路径
	private String libararyPath;//库路径
	private String vmName;//虚拟机名称
	private String vmVendor;//虚拟机供应商
	private String vmVersion;//虚拟机版本
	private String specName;
	private String specVendor;
	private String specVersion;
	
	private Long startTime;
	private Long upTime;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassPath() {
		return classPath;
	}
	public void setClassPath(String classPath) {
		this.classPath = classPath;
	}
	public String getBootClassPath() {
		return bootClassPath;
	}
	public void setBootClassPath(String bootClassPath) {
		this.bootClassPath = bootClassPath;
	}
	public String getLibararyPath() {
		return libararyPath;
	}
	public void setLibararyPath(String libararyPath) {
		this.libararyPath = libararyPath;
	}
	public String getVmName() {
		return vmName;
	}
	public void setVmName(String vmName) {
		this.vmName = vmName;
	}
	public String getVmVendor() {
		return vmVendor;
	}
	public void setVmVendor(String vmVendor) {
		this.vmVendor = vmVendor;
	}
	public String getVmVersion() {
		return vmVersion;
	}
	public void setVmVersion(String vmVersion) {
		this.vmVersion = vmVersion;
	}
	public String getSpecName() {
		return specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}
	public String getSpecVendor() {
		return specVendor;
	}
	public void setSpecVendor(String specVendor) {
		this.specVendor = specVendor;
	}
	public String getSpecVersion() {
		return specVersion;
	}
	public void setSpecVersion(String specVersion) {
		this.specVersion = specVersion;
	}
	public Long getStartTime() {
		return startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}
	public Long getUpTime() {
		return upTime;
	}
	public void setUpTime(Long upTime) {
		this.upTime = upTime;
	}
	
}
