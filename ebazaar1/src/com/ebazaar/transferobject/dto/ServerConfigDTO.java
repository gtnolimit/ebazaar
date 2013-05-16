package com.ebazaar.transferobject.dto;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ServerConfigDTO {
	private static ServerConfigDTO serverConfigDTO = new ServerConfigDTO();

	private ServerConfigDTO() {
		final Properties properties = new Properties();
		try {
			
			
//			properties.load(new FileInputStream("ServerConfig.properties"));
			properties.load(this.getClass().getResourceAsStream("/ServerConfig.properties"));
			setDomainName(properties.getProperty("domainName"));
			setServerURL(properties.getProperty("serverURL"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static ServerConfigDTO getServerConfiguration() {
		return serverConfigDTO;
	}
	private String domainName;
	private String serverURL;
	
	
	public String getServerURL() {
		return serverURL;
	}
	public void setServerURL(String serverURL) {
		this.serverURL = serverURL;
	}
	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
}
