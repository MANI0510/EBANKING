package com.EBANKING.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting1 extends TestListenerAdapter{
	
  public ExtentHtmlReporter htmlReporter;
  
  public ExtentReports extent;
  
  public ExtentTest Logger;
  
  public void onStart (ITestContext testContext) {
	  
	  String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
	  
	  String repname = "Test Report-"+timestamp+".html";
	  
	  htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/"+repname);
	  
	  htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
	  
	  extent = new ExtentReports();
	  
	  extent.attachReporter(htmlReporter);
	  
	  extent.setSystemInfo("HostName", "Localhost");
	  
	  extent.setSystemInfo("Environment", "QA");
	  
	 extent.setSystemInfo("user","Manikandan");
	 
	 htmlReporter.config().setDocumentTitle("EBANKING test project");
	 
	 htmlReporter.config().setReportName("Functional Automation Report");
	 
	 htmlReporter.config().setTheme(Theme.DARK);
	  
	  
	  
  }
  
  public void onTestSucess(ITestResult tr) {
	  
	  Logger = extent.createTest(tr.getName());
	  
	  Logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
			  
  }
  
  public void onTestFailure(ITestResult tr) {
	  
	  Logger = extent.createTest(tr.getName());
	  
	  Logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
	  
	  String screenshotpath = System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
	  
	  File f = new File(screenshotpath);
	  
	  if(f.exists()) {
		  
		  try {
			  Logger.fail("Screenshot is below "+Logger.addScreenCaptureFromPath(screenshotpath));
		  }
		  
		  catch(Exception e){
			  
			  e.printStackTrace();
		  }
	  }
			  
  }
  
  public void onTestSkipped(ITestResult tr) {
	  
	  Logger = extent.createTest(tr.getName());
	  
	  Logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
			  
  }
  
  public void onFinish(ITestContext textcontext) {
	  
	  extent.flush();
  }
  
  
  
  
  
  
  
  
  
  
  
  

}
