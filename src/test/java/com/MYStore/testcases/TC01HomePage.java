package com.MYStore.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TC01HomePage extends TestBase
{


	public TC01HomePage()
{
	super();
}
 
	@Test
 public void TCHomePage  ()
{
		loggers=reports.startTest("Test Home Page");
	
		String title = mshp.verifyMyStoreHomepageTitle();
	Assert.assertEquals(title,"My Store","Title does not match");
	loggers.log(LogStatus.PASS, "verifyMyStoreHomepageTitle");
	
	boolean dress = mshp.verifyDressestab();
	Assert.assertTrue(dress);
	loggers.log(LogStatus.PASS, "Dressestab is verifed");
	
	boolean shirt = mshp.validshirtstab();
	Assert.assertTrue(shirt);
	loggers.log(LogStatus.PASS, "shirtstab is verifed");
   
	boolean Logo = mshp.validateMYStoreLogo();
    Assert.assertTrue(Logo);
    loggers.log(LogStatus.PASS, "MYStoreLogo is verifed");
   
    boolean search = mshp.verifysearchtab();
    Assert.assertTrue(search);
    loggers.log(LogStatus.PASS, "searchtab is verifed");
    
    boolean tab = mshp.verifyWomenTab();
    Assert.assertTrue(tab);
    loggers.log(LogStatus.PASS, "verifyWomenTab");
  
    
	
	
}

}
