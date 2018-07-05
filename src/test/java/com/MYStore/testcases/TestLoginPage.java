package com.MYStore.testcases;

import org.testng.annotations.Test;

public class TestLoginPage extends TestBase{
	
    @Test
	public void TestLoginPagefactionality() throws Exception
	{
    	mshp.clickSigninButton();
    	logpage.validsignin2("dummytest@gmail.com"," pass@123");
    	Thread.sleep(2000);
    
	}

}
