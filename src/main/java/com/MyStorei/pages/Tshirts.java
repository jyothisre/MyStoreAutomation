package com.MyStorei.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.base.DriverScript;

public class Tshirts extends  DriverScript
{
	@FindBy(xpath="//img[@ class='replace-2x img-responsive']")
	
	private WebElement imgTshirt;
	
	@FindBy(xpath="//button[@ class='exclusive']")
	
	private WebElement addcart;
	
	public void imgTshirt()
	{
		PageFactory.initElements(driver, this);
	}
public void addcar()
{
	 imgTshirt.click();
	 addcart.click();
	 
}
}
