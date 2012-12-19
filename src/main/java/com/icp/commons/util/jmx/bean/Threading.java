package com.icp.commons.util.jmx.bean;

/**
 * @author zheng
 * */
public class Threading {

	private int daemonThreadCount;
	private int peakThreadCount;
	private long currentThreadCpuTime;
	private long currentThreadUserTime;
	private int threadCount;
	private long totalStartedThreadCount;
	
	public int getDaemonThreadCount() {
		return daemonThreadCount;
	}
	public void setDaemonThreadCount(int daemonThreadCount) {
		this.daemonThreadCount = daemonThreadCount;
	}
	public int getPeakThreadCount() {
		return peakThreadCount;
	}
	public void setPeakThreadCount(int peakThreadCount) {
		this.peakThreadCount = peakThreadCount;
	}
	public long getCurrentThreadCpuTime() {
		return currentThreadCpuTime;
	}
	public void setCurrentThreadCpuTime(long currentThreadCpuTime) {
		this.currentThreadCpuTime = currentThreadCpuTime;
	}
	public long getCurrentThreadUserTime() {
		return currentThreadUserTime;
	}
	public void setCurrentThreadUserTime(long currentThreadUserTime) {
		this.currentThreadUserTime = currentThreadUserTime;
	}
	public int getThreadCount() {
		return threadCount;
	}
	public void setThreadCount(int threadCount) {
		this.threadCount = threadCount;
	}
	public long getTotalStartedThreadCount() {
		return totalStartedThreadCount;
	}
	public void setTotalStartedThreadCount(long totalStartedThreadCount) {
		this.totalStartedThreadCount = totalStartedThreadCount;
	}
	
	
	
	
}
