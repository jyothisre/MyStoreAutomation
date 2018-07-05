package com.MYStore.testcases;

import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MY.sopport.ExcelHelper;
//import com.sun.java.swing.plaf.windows.TMSchema.Prop;

public class TestExcelHelper extends TestBase{
	 ExcelHelper exceldata;
	 Properties prop;
	
	
	@Test(dataProvider="exceldata")
		
	public void TestLoginPagefactionality(String username,String password)  
		{
	    	mshp.clickSigninButton();
logpage.validsignin2(prop.getProperty("username"),prop.getProperty("password"));
	    	//logpage.validsignin2("dummytest@gmail.com"," pass@123");
	    	
	    
		}

         
	     
	@DataProvider(name="exceldata")
    public  Object [][] logindata()
          {
            	 exceldata = new ExcelHelper("./MSTestdata/testdata.xlsx");
                 int row =exceldata.getrowcount(0);
                 Object[][] data = new Object[row][2];
           
           for(int i=0;i<row;i++)
           {
        	 data[i][1]=exceldata.getdata(0, i, 1);
        	 data[i][2]=exceldata.getdata(0, i, 2);
        			 
           }
           return data;
	
               }

}