package com.MyStorei.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.base.DriverScript;

public class TopsPage extends  DriverScript
{
@FindBy(xpath="//h2[@ class='title_block']")
private WebElement linktops;

public  TopsPage()
{
	PageFactory.initElements(driver, this);
}
public void clicklinktops()
{
	linktops.click();
}
}
