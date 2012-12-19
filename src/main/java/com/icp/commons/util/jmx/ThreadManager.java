package com.icp.commons.util.jmx;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

import javax.management.MBeanServerConnection;

import com.icp.commons.util.jmx.bean.Threading;

public class ThreadManager {

	private MBeanServerConnection mbsc = null;
	private ThreadMXBean threadMXBean = null;
	
	public ThreadManager(MBeanServerConnection connection){
		
		this.mbsc = connection;
		try {
			threadMXBean = ManagementFactory.newPlatformMXBeanProxy(mbsc, ManagementFactory.THREAD_MXBEAN_NAME, ThreadMXBean.class);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public Threading getThreadInfo(){
		
		Threading thread = new Threading();
		thread.setCurrentThreadCpuTime(threadMXBean.getCurrentThreadCpuTime());
		thread.setCurrentThreadUserTime(threadMXBean.getCurrentThreadUserTime());
		thread.setDaemonThreadCount(threadMXBean.getDaemonThreadCount());
		thread.setPeakThreadCount(threadMXBean.getPeakThreadCount());
		thread.setThreadCount(threadMXBean.getThreadCount());
		thread.setTotalStartedThreadCount(threadMXBean.getTotalStartedThreadCount());
		return thread;
	}
	
}
