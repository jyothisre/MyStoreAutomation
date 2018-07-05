package com.MYStore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyStore.base.DriverScript;
import com.MyStorei.pages.HOMEpage;
import com.MyStorei.pages.TopsPage;
import com.MyStorei.pages.Tshirts;
import com.MyStorei.pages.WomenDresspage;

public class TCAddtoCart extends  DriverScript {
	HOMEpage hp;
	WomenDresspage wd;
	TopsPage tp;
	Tshirts tshirt;
	
	public TCAddtoCart()
	{
		super();
	}
	@BeforeMethod
	public void precondition()
	{
		inti();
		hp = new HOMEpage();
		wd  = new WomenDresspage();
		 tp = new TopsPage();
		 tshirt = new Tshirts();
	}
@Test
	public void testAddtoCart()
{
	 hp.clicklinkWomen();
    wd.clicklinkTops();
    tp.clicklinktops();
    tshirt.imgTshirt();
}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

 
   
	
}

