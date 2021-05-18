package com.EBANKING.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver){
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(linkText = "New Customer")
	
	WebElement linkAddCustomer;
	
	
	@FindBy(name = "name")
	
	WebElement txtcustomername;
	
	@FindBy(name = "rad1")
	
	WebElement rdgender;
	
	@FindBy(id = "dob")

	WebElement txtdob;
	
	
	@FindBy(name = "addr")
	
	WebElement txtaddress;
	
	@FindBy(name = "city")
	
	WebElement txtcity;
	
	@FindBy(name = "state")
	
	WebElement txtstate;
	
	@FindBy(name ="pinno")
	
	WebElement txtpincode;
	
	@FindBy(name = "telephoneno")
	
	WebElement txtphoneno;


	@FindBy(name="emailid")

	WebElement txtmail;
	

	@FindBy(name ="password")
	
	WebElement txtpassword;
	

	@FindBy(name = "sub")
	
	WebElement clickonsubmit;
	
	public void Addnewcustomer() {
		linkAddCustomer.click();
	}
	
	public void custname(String cname) {
		txtcustomername.sendKeys(cname);
	}
	
	
	public void custgender(String cgender) {
		rdgender.click();
	}
	
	
	public void Custdob(String mm,String dd,String yyyy) {
		
		txtdob.sendKeys(mm);
		
		txtdob.sendKeys(dd);
		
		txtdob.sendKeys(yyyy);
	}
	
	
	public void Custaddress(String caddr) {
		 
		txtaddress.sendKeys(caddr);
	}
	
	
	
	public void CustCity(String cityname) {
		
		txtcity.sendKeys(cityname);
	}
	
	
	public void Custstate(String cstate) {
		
		txtstate.sendKeys(cstate);
	}
	
	
	public void Custpincode(String cpin) {
		
		txtpincode.sendKeys(cpin);
	}
	
	public void Customertelephoneno(String cphoneno) {
		
		txtphoneno.sendKeys(cphoneno);
	}
	
	
	
	public void Customermailid (String mailid) {
		
		txtmail.sendKeys(mailid);
	}
	
	public void Customerpassword(String pwd) {
		
		txtpassword.sendKeys(pwd);
	}
	
	public void Customerinfosubmit() {
		clickonsubmit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
