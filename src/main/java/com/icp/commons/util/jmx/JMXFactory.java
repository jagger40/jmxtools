package com.icp.commons.util.jmx;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.management.MBeanServerConnection;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

public class JMXFactory {

	public static JMXConnector getJMXConnector(String host,String port,String username,String password) throws IOException{
		
		Map<String,String[]> map = new HashMap<String,String[]>();
		map.put("jmx.remote.credentials", new String[]{username,password});
		StringBuilder sb =new StringBuilder();
		sb.append("service:jmx:rmi:///jndi/rmi://").append(host).append(":").append(port).append("/jmxrmi");
		String jmxURL =sb.toString();
		JMXServiceURL serviceURL = new JMXServiceURL(jmxURL);
		JMXConnector connector = JMXConnectorFactory.connect(serviceURL,map);
		return connector;
		
	}
	
	public static MBeanServerConnection getConnection(String host,String port,String username,String password) throws IOException{
		
		Map<String,String[]> map = new HashMap<String,String[]>();
		map.put("jmx.remote.credentials", new String[]{username,password});
		StringBuilder sb =new StringBuilder();
		sb.append("service:jmx:rmi:///jndi/rmi://").append(host).append(":").append(port).append("/jmxrmi");
		String jmxURL =sb.toString();
		JMXServiceURL serviceURL = new JMXServiceURL(jmxURL);
		JMXConnector connector = JMXConnectorFactory.connect(serviceURL,map);
		MBeanServerConnection mbsc = connector.getMBeanServerConnection();
		return mbsc;
		
	}
	
}
