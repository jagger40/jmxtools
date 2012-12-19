package com.icp.commons.util.jmx;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

import javax.management.MBeanServerConnection;

import com.icp.commons.util.jmx.bean.Memory;

public class MemoryManagement {
	
	private MBeanServerConnection mbsc = null;
	private MemoryMXBean memoryMXBean = null;
	private MemoryUsage memoryHeapUsage = null;
	private MemoryUsage memoryNoHeapUsage = null; 
	
	public MemoryManagement(MBeanServerConnection connection){
		
		try {
			
			this.mbsc = connection;
			memoryMXBean=ManagementFactory.newPlatformMXBeanProxy(mbsc,ManagementFactory.MEMORY_MXBEAN_NAME, MemoryMXBean.class);
			memoryHeapUsage = memoryMXBean.getHeapMemoryUsage();
			memoryNoHeapUsage = memoryMXBean.getNonHeapMemoryUsage();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}  
		
	}
	
	//返回堆内内存使用情况
	public Memory getHeapMemoryUsage(){
		Memory memory = new Memory();
		memory.setCommitted(memoryHeapUsage.getCommitted());//单位字节
		memory.setInit(memoryHeapUsage.getInit());
		memory.setMax(memoryHeapUsage.getMax());
		memory.setUsed(memoryHeapUsage.getUsed());//bytes
		return memory;
		
	}
	
	//返回非堆内内存使用情况
	public Memory getNoHeapMemoryUsage(){
		
		Memory memory = new Memory();
		memory.setCommitted(memoryNoHeapUsage.getCommitted());//单位字节
		memory.setInit(memoryNoHeapUsage.getInit());
		memory.setMax(memoryNoHeapUsage.getMax());
		memory.setUsed(memoryNoHeapUsage.getUsed());//bytes
		return memory;
		
	}

}
