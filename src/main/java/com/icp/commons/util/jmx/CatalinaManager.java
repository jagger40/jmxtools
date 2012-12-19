package com.icp.commons.util.jmx;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.management.AttributeNotFoundException;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanException;
import javax.management.MBeanServerConnection;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.ReflectionException;

import com.icp.commons.util.jmx.bean.WebModule;
import com.icp.commons.util.jmx.bean.WebModuleManager;

public class CatalinaManager {

	private MBeanServerConnection mbsc = null;
	
	public CatalinaManager(MBeanServerConnection connection){	
		this.mbsc = connection;
	}
	
	/**
	 * 获取服务器中所有应用信息
	 * */
	public List<WebModule> getWebModules() throws MalformedObjectNameException, NullPointerException, IOException, AttributeNotFoundException, InstanceNotFoundException, MBeanException, ReflectionException{
		
		ObjectName managerObjName = new ObjectName("Catalina:j2eeType=WebModule,*");
		Set<ObjectName> s = mbsc.queryNames(managerObjName, null);
		
		 List<WebModule> result = new ArrayList<WebModule>();
		
		for(ObjectName obj:s){
			
			WebModule webModel = new WebModule();
			ObjectName objname = new ObjectName(obj.getCanonicalName());
			
			webModel.setBaseName(mbsc.getAttribute(objname, "baseName").toString());
			webModel.setDeploymentDescriptor(mbsc.getAttribute(objname, "deploymentDescriptor").toString());
			webModel.setDisplayName(mbsc.getAttribute(objname, "displayName").toString());
			webModel.setDocBase(mbsc.getAttribute(objname, "docBase").toString());
			webModel.setName(mbsc.getAttribute(objname, "name").toString());
			webModel.setPath(mbsc.getAttribute(objname, "path").toString());
			webModel.setProcessingTime(Long.valueOf(mbsc.getAttribute(objname, "processingTime").toString()));
			webModel.setSessionTimeout(Integer.valueOf(mbsc.getAttribute(objname, "sessionTimeout").toString()));
			webModel.setStartTime(Long.valueOf(mbsc.getAttribute(objname, "startTime").toString()));
			webModel.setStateName(mbsc.getAttribute(objname, "stateName").toString());
			webModel.setWebappVersion(mbsc.getAttribute(objname, "webappVersion").toString());
			
			/**获取该应用所属的host*/
			String host = mbsc.getAttribute(objname, "objectName").toString();
			host = host.substring(host.indexOf("name"),host.indexOf("J2EEApplication")-1);
			host = host.substring(host.indexOf("//")+2,host.lastIndexOf("/"));
		
			webModel.setHost(host);
			result.add(webModel);
			
		}
		return result;
	}
	
	public WebModuleManager getWebModileManager(String host,String name) throws MalformedObjectNameException, NullPointerException, IOException, AttributeNotFoundException, InstanceNotFoundException, MBeanException, ReflectionException{
		
		WebModuleManager webModuleManager = new WebModuleManager();
		if(name.equals("ROOT")){name="";}
		
		
		ObjectName objectName = new ObjectName("Catalina:type=Manager,context=/"+name+",host="+host+"");
		String stateName = (String) mbsc.getAttribute(objectName, "stateName");
		
		webModuleManager.setActiveSessions(Integer.parseInt(mbsc.getAttribute(objectName, "activeSessions").toString()));
		webModuleManager.setMaxActive(Integer.parseInt(mbsc.getAttribute(objectName, "maxActive").toString()));
		webModuleManager.setMaxActiveSessions(Integer.parseInt(mbsc.getAttribute(objectName, "stateName").toString()));
		webModuleManager.setSessionCounter(Integer.parseInt(mbsc.getAttribute(objectName, "stateName").toString()));
		webModuleManager.setSessionMaxAliveTime(Integer.parseInt(mbsc.getAttribute(objectName, "stateName").toString()));
		webModuleManager.setStateName(mbsc.getAttribute(objectName, "stateName").toString());
		
		return null;
		
		
		
	}
	
	public WebModuleManager getWebModuleManager(WebModule webModule) throws MalformedObjectNameException, NullPointerException, IOException, AttributeNotFoundException, InstanceNotFoundException, MBeanException, ReflectionException{
		
		return this.getWebModileManager(webModule.getHost(), webModule.getBaseName());
	
	}
	
}
