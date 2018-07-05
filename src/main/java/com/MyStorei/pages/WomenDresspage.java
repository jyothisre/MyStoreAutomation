package com.MyStorei.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.base.DriverScript;

public class WomenDresspage extends  DriverScript 
{
@FindBy(linkText="Tops")
private WebElement linkTops;

public WomenDresspage()
{
	PageFactory.initElements(driver, this);
	
}
public void clicklinkTops()
{
	linkTops.click();
}

}
