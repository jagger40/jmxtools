package com.icp.commons.util.jmx;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import javax.management.MBeanServerConnection;

public class RuntimeManager {
	
	private RuntimeMXBean runtimeMXBean = null;
	private MBeanServerConnection mbsc = null;
	
	public RuntimeManager(MBeanServerConnection connection){
		
		try {
			this.mbsc = connection;
			runtimeMXBean = ManagementFactory.newPlatformMXBeanProxy(mbsc, "java.lang:type=Runtime", RuntimeMXBean.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public RuntimeManager(String host,String port,String username,String password){
	
		try {
			
			mbsc = JMXFactory.getConnection(host, port, username, password);
			runtimeMXBean = ManagementFactory.newPlatformMXBeanProxy(mbsc, "java.lang:type=Runtime", RuntimeMXBean.class);
			
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
	}
	
	public com.icp.commons.util.jmx.bean.Runtime getRuntimeInfo(){
		
		com.icp.commons.util.jmx.bean.Runtime runtime = new com.icp.commons.util.jmx.bean.Runtime();
		runtime.setName(runtimeMXBean.getName());
		runtime.setClassPath(runtimeMXBean.getClassPath());
		runtime.setClassPath(runtimeMXBean.getBootClassPath());
		runtime.setLibararyPath(runtimeMXBean.getLibraryPath());
		runtime.setVmName(runtimeMXBean.getVmName());
		runtime.setVmVendor(runtimeMXBean.getVmVendor());
		runtime.setVmVersion(runtimeMXBean.getVmVersion());
		runtime.setSpecName(runtimeMXBean.getSpecName());
		runtime.setSpecVendor(runtimeMXBean.getSpecVendor());
		runtime.setSpecVersion(runtimeMXBean.getSpecVersion());
		runtime.setStartTime(runtimeMXBean.getStartTime());
		runtime.setUpTime(runtimeMXBean.getUptime());
		return runtime;
		
	}
	
	
}
