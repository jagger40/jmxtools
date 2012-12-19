package commons_jmxutils.jmxutils;

import java.io.IOException;
import java.util.List;

import javax.management.MBeanServerConnection;
import javax.management.MalformedObjectNameException;

import com.icp.commons.util.jmx.CatalinaManager;
import com.icp.commons.util.jmx.JMXFactory;
import com.icp.commons.util.jmx.MemoryManagement;
import com.icp.commons.util.jmx.OperatingSystemManagement;
import com.icp.commons.util.jmx.RuntimeManager;
import com.icp.commons.util.jmx.ThreadManager;
import com.icp.commons.util.jmx.bean.Memory;
import com.icp.commons.util.jmx.bean.Threading;
import com.icp.commons.util.jmx.bean.WebModule;
import com.icp.commons.util.jmx.bean.WebModuleManager;

public class Quick {

	public static void main(String[] args) throws InterruptedException {
		
		
			MBeanServerConnection connection = null;
			try{
				connection =  JMXFactory.getConnection("192.168.0.213","9004","huacloud","123456");
			}catch (Exception e) {
				e.printStackTrace();
			}
			
//			ThreadManager man = new ThreadManager(connection);
//			Threading thread = man.getThreadInfo();
//			System.out.println(thread.getDaemonThreadCount()+" "+thread.getThreadCount());
////			OperatingSystemManagement management= new OperatingSystemManagement(connection);
////			//MemoryManagement memoryMBean = new MemoryManagement(connection);
////				
////			management.getCpuUsaged();
//////			Memory memory = memoryMBean.getHeapMemoryUsage();
//////			System.out.println(memory.getCommitted()+"  "+memory.getInit()+"  "+memory.getUsed());
//			Thread.sleep(2000);
			
			
			CatalinaManager man = new CatalinaManager(connection);
			try {
				List<WebModule> list = man.getWebModules();
				for(WebModule module:list){
					
					WebModuleManager attrs = man.getWebModuleManager(module);
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}
