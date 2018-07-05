package com.MYStore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.MyStore.base.DriverScript;
import com.MyStorei.pages.HOMEpage;
import com.MyStorei.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;

public class TestBase extends  DriverScript
{
	HOMEpage mshp;
	LoginPage logpage;
	
	@BeforeMethod
	public void precondition()
	{
		reports=new ExtentReports("./actireport/automation.html",true);
		inti();
		mshp=new HOMEpage();
		logpage =new LoginPage();
	//validemail validatSingin = new validsignin();
// password mslp = new password();
	
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
		reports.endTest(loggers);
		reports.flush();
	}

}
