package com.MyStore.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class DriverScript  {
	
	public static WebDriver driver;
    static    Properties prop;
   public static ExtentReports reports;
   public static ExtentTest loggers;
	
	public DriverScript ()
	{
		try
		{
		 prop = new Properties();
	       FileInputStream file = new FileInputStream("./acticonfigaretion/config.properties");
	       prop.load(file);
	    
		}
		
		catch(Exception e)
		{
			System.out.println("sorry we dont have file"+""+e.getMessage());
		}
	}
		
		
		public static void inti()
		{
			String Browser = prop.getProperty("Browser");
			
			if(Browser.equalsIgnoreCase("firefox"))
				
			{
				driver=new FirefoxDriver();
			}
			else if((Browser.equalsIgnoreCase("chrome")))
				
			{
			System.setProperty("webdriver.chrome.", "C:\\FRAMEWORK\\com.MyStore\\actiBrowser\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			//else if((Browser.equalsIgnoreCase("ie")))
					{
				//driver=new ie
					}
	
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(prop.getProperty("TURL"));
			
		
		
		
	
		
	}

}
