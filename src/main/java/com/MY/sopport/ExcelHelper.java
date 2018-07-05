package com.MY.sopport;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.MyStore.base.DriverScript;

public class ExcelHelper extends DriverScript{
	
	
	XSSFWorkbook WB; 
	FileInputStream file;
	XSSFSheet sheet;
	
	
	public ExcelHelper(String xlpath)
	{
		try
		{
		 file = new FileInputStream(xlpath);
	     WB = new XSSFWorkbook(file);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
      public int getrowcount(int sheetIndex)
      {
    	int row = WB.getSheetAt(sheetIndex).getLastRowNum();
    	row=row+1;
		return row;
    	  
      }
      public String getdata(int Sheetnum,int row,int col)
      {
    	  WB.getSheetAt(Sheetnum);
    	String data = sheet.getRow(row).getCell(col).toString();
    	return data;
    	 
      }
      
}
