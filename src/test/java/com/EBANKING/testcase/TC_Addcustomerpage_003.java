package com.EBANKING.testcase;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.EBANKING.pageobjects.AddCustomerPage;
import com.EBANKING.pageobjects.Loginpage;

public class TC_Addcustomerpage_003 extends Baseclass{
	
	@Test
	
	public void Addnewcustomer() throws InterruptedException, IOException {
		
		Loginpage lp = new Loginpage(driver);
		
		lp.setusername(username);
		
		logger.info("username provided");
		
		lp.setpassword(password);
		
		
		logger.info("password provided");
		
		lp.clickonbutton();
		
		Thread.sleep(3000);
		
	AddCustomerPage addcust = new AddCustomerPage(driver);
	
	addcust.Addnewcustomer();
	
	logger.info("Providing the customer details");
	
	addcust.custname("Manikandan");
	
	addcust.custgender("male");
	
	addcust.Custdob("08","23","1995");
	
	addcust.Custaddress("sivan koil street");
	
	addcust.CustCity("Tirunelveli");
	
	addcust.Custstate("Tamilnadu");
	
	addcust.Custpincode("627002");
	
	addcust.Customertelephoneno("7566421350");
	
	String email = randomestring()+"@gmail.com";
	
	addcust.Customermailid(email);
	
	
	addcust.Customerpassword("mani123");
	
	addcust.Customerinfosubmit();
	
	Thread.sleep(3000);
	
	logger.info("Validation started");
	

	
	boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
	
	if(res==true) {
		
		Assert.assertTrue(true);
		
		logger.info("Testcase passed");
	}
	
	else
		
	{
		
		logger.info("Testcase failed");
		
		capturescreen(driver,"Addnewcustomer");
		
		Assert.assertFalse(false);
		
		
	}
		
		
	}
	

}
