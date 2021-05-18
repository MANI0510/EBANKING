package com.EBANKING.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver ldriver;
	
	public Loginpage(WebDriver rdriver){
		
		ldriver= rdriver;
		
		PageFactory.initElements(rdriver, this);
		
		
	}
	
	@FindBy(name="uid")
	WebElement txt_UserName;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(name="btnLogin")
	WebElement loginbtn;
	
	@FindBy(linkText = "Log out")
	WebElement logoutlink;
	
	public void setusername(String uname) {
		
		txt_UserName.sendKeys(uname);
		
		}
	
	public void setpassword(String pwd) {
		
		txt_password.sendKeys(pwd);
	}
	
	public void clickonbutton() {
		
		loginbtn.click();
	}
	
	public void clickonlink() {
		
		logoutlink.click();
	}

}
