package com.EBANKING.testcase;

import java.io.IOException;

import org.junit.Assert;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EBANKING.pageobjects.Loginpage;
import com.EBANKING.utilities.XLUtils;

public class TC_LoginDDT_002 extends Baseclass

{ 
	@Test(dataProvider = "Logindata") 
	
	public void loginDDT(String uname,String pwd) throws InterruptedException {
		
		Loginpage lp = new Loginpage(driver);
		
		lp.setusername(uname);
		
		logger.info("username provided");
		
		lp.setpassword(pwd);
		
		logger.info("password provided");
		
		lp.clickonbutton();
		
		Thread.sleep(3000);
		
	if(isAlertPresent()==true) {
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().defaultContent();
		
		Assert.assertTrue(false);
		
		logger.warn("login failed");
	}
	
	else
	{
		
		Assert.assertTrue(true);
		
		logger.info("login passed");
		
		lp.clickonlink();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().defaultContent();
		
	}
		
	}
	
	
		public boolean isAlertPresent() {
			
			try {
				
				driver.switchTo().alert();
				
				return true;
			}
			
			catch (NoAlertPresentException e) {
				
				return false;
				
			}
			
			}
		
		
		
	@DataProvider(name="Logindata")
	
	String[][] getdata() throws IOException{
		
		String path = System.getProperty("user.dir")+"/src/test/java/com/EBANKING/testdata/Logindata.xlsx";
		
		int rowcount = XLUtils.getRowCount(path,"sheet1");
		
		int colcount = XLUtils.getCellCount(path,"sheet1", 1);
		
		String logindata[][] = new String [rowcount] [colcount];
		
		for(int i=1;i<rowcount;i++) {
			
			for (int j=0;j<colcount;j++) {
				
				logindata[i-1][j] = XLUtils.getCellData(path,"sheet1", i, j);
				
			}
		}
		
		return logindata;
		
		
		
		
		
		
		
		
		
	}
}
