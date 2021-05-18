package com.EBANKING.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;
	
	public Readconfig() {
		
		File  src = new File("./Configuration/config.properties");
		
		try {
			
		 FileInputStream fis = new FileInputStream(src);
		 
		 
		 
		 pro = new Properties();
		 
		 pro.load(fis);
		 
		 
		}
		
		catch (Exception e) {
			
			System.out.println("Exceptiion is " +e.getMessage());
		}
	}
	
	public String getapplicationUrl() {
		
		String url = pro.getProperty("baseURL");
		
		return url;
		
	}
	
public String getusername() {
		
		String username = pro.getProperty("username");
		
		return username;
		
	}
 

public String getpassword() {
	
	String password = pro.getProperty("password");
	
	return password;
	
}

public String getChrome() {
	
	String chromepath = pro.getProperty("chromepath");
	
	return chromepath;
	
}

public String getFirefox() {
	
	String firefoxpath = pro.getProperty("firefoxpath");
	
	return firefoxpath;
	
}

public String getedge() {
	
	String edgepath = pro.getProperty("edgepath");
	
	return edgepath;
	
}
	
	
}
