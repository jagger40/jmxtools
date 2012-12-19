package com.icp.commons.util.jmx.bean;

public class Memory {
    
	//大小
	private Long committed;
	private Long init;
	//最大
	private Long max;
	//使用大小
	private Long used;
	
	public Long getCommitted() {
		return committed;
	}
	public void setCommitted(Long committed) {
		this.committed = committed;
	}
	public Long getInit() {
		return init;
	}
	public void setInit(Long init) {
		this.init = init;
	}
	public Long getMax() {
		return max;
	}
	public void setMax(Long max) {
		this.max = max;
	}
	public Long getUsed() {
		return used;
	}
	public void setUsed(Long used) {
		this.used = used;
	}
	
	
	
}
