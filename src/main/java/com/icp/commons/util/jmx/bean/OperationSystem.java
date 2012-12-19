package com.icp.commons.util.jmx.bean;

/**
 * jmx操作系统相关信息
 * @author zheng-pc
 * */
public class OperationSystem {
	
	private Long maxFileDescriptorCount;
	private Long openFileDescriptorCount;
	//分配的内存
	private Long committedVirtualMemorySize;
	//可用物理内存空间大小
	private Long freePhysicalMemorySize;
	//可用交换空间大小
	private Long freeSwapSpaceSize;
	//处理cpu时间
	private Long processCpuTime;
	//物理内存总量
	private Long totalPhysicalMemorySize;
	//交换空间总量
	private Long totalSwapSpaceSize;
	//名称
	private String name;
	//操作系统处理器数量
	private int availableProcessors;
	//操作系统体系结构
	private String arch;
	//系统平均负载
	private double systemLoadAverage;
	//系统版本
	private String version;
	public Long getMaxFileDescriptorCount() {
		return maxFileDescriptorCount;
	}
	public void setMaxFileDescriptorCount(Long maxFileDescriptorCount) {
		this.maxFileDescriptorCount = maxFileDescriptorCount;
	}
	public Long getOpenFileDescriptorCount() {
		return openFileDescriptorCount;
	}
	public void setOpenFileDescriptorCount(Long openFileDescriptorCount) {
		this.openFileDescriptorCount = openFileDescriptorCount;
	}
	public Long getCommittedVirtualMemorySize() {
		return committedVirtualMemorySize;
	}
	public void setCommittedVirtualMemorySize(Long committedVirtualMemorySize) {
		this.committedVirtualMemorySize = committedVirtualMemorySize;
	}
	public Long getFreePhysicalMemorySize() {
		return freePhysicalMemorySize;
	}
	public void setFreePhysicalMemorySize(Long freePhysicalMemorySize) {
		this.freePhysicalMemorySize = freePhysicalMemorySize;
	}
	public Long getFreeSwapSpaceSize() {
		return freeSwapSpaceSize;
	}
	public void setFreeSwapSpaceSize(Long freeSwapSpaceSize) {
		this.freeSwapSpaceSize = freeSwapSpaceSize;
	}
	public Long getProcessCpuTime() {
		return processCpuTime;
	}
	public void setProcessCpuTime(Long processCpuTime) {
		this.processCpuTime = processCpuTime;
	}
	public Long getTotalPhysicalMemorySize() {
		return totalPhysicalMemorySize;
	}
	public void setTotalPhysicalMemorySize(Long totalPhysicalMemorySize) {
		this.totalPhysicalMemorySize = totalPhysicalMemorySize;
	}
	public Long getTotalSwapSpaceSize() {
		return totalSwapSpaceSize;
	}
	public void setTotalSwapSpaceSize(Long totalSwapSpaceSize) {
		this.totalSwapSpaceSize = totalSwapSpaceSize;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAvailableProcessors() {
		return availableProcessors;
	}
	public void setAvailableProcessors(int availableProcessors) {
		this.availableProcessors = availableProcessors;
	}
	public String getArch() {
		return arch;
	}
	public void setArch(String arch) {
		this.arch = arch;
	}
	public double getSystemLoadAverage() {
		return systemLoadAverage;
	}
	public void setSystemLoadAverage(double systemLoadAverage) {
		this.systemLoadAverage = systemLoadAverage;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	


}
