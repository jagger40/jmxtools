package com.icp.commons.util.jmx;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.math.BigInteger;
import com.sun.management.OperatingSystemMXBean;
import javax.management.MBeanServerConnection;

@SuppressWarnings("restriction")
public class OperatingSystemManagement {

	private MBeanServerConnection mbsc = null;
	private OperatingSystemMXBean operatingSystemMxBean = null;
	
	public OperatingSystemManagement(MBeanServerConnection connection){
		
		try {
			
			this.mbsc = connection;
			this.operatingSystemMxBean=ManagementFactory.newPlatformMXBeanProxy(mbsc,ManagementFactory.OPERATING_SYSTEM_MXBEAN_NAME, OperatingSystemMXBean.class);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}  
		
	}
	
	public void getCpuUsaged(){
		
		long nanoBefore = System.nanoTime();
		long cpuBefore = operatingSystemMxBean.getProcessCpuTime();

		// for the sake of the example do some
		// CPU consuming task here - e.g.
		// use BigInteger and Math.sqrt()
		//
		BigInteger acc = new BigInteger("0");
		final int max = 1000000;
		
		for (long i=0; i<max; i++) {     
			final double d = Double.parseDouble("1"+i);     
			final double sq = Math.sqrt(d);     
			final BigInteger b = new BigInteger(""+(long)sq);     
			acc = acc.add(b);
		}
		
		long cpuAfter = operatingSystemMxBean.getProcessCpuTime();
		long nanoAfter = System.nanoTime();
		long percent;
		if (nanoAfter > nanoBefore){
			percent = ((cpuAfter-cpuBefore)*100L)/(nanoAfter-nanoBefore);
		}
		else {
			percent = 0;
		}

		System.out.println("Cpu usage: "+percent+"%");
	}
	
}
