package com.EBANKING.testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import com.EBANKING.pageobjects.Loginpage;

public class TC_Logintest_001 extends Baseclass {
	
	@Test
	public void LoginTest() throws IOException {
		
	
		
		
		
		driver.get(baseURL);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		
		
		logger.info("URL is opened");
		
		Loginpage lp = new Loginpage(driver);
		
		lp.setusername(username);
		
		logger.info("enter the username");
		
		lp.setpassword(password);
		
		logger.info("Enter the password");
		
		lp.clickonbutton();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
			
			logger.info("Test case passed");
		}
		
		else
		{
			
			capturescreen( driver,"LoginTest"); 
			
			Assert.assertTrue(false);
			
			logger.info("Test case failed");
		}
		
	}
	

}
