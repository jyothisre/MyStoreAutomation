package com.MyStorei.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.base.DriverScript;

public class HOMEpage extends DriverScript 
{
	
 @FindBy(xpath="//img[@ class='logo img-responsive']")

  private WebElement imgLogo;

 @FindBy(linkText="Contact us")
 private WebElement linkContactus;

 @FindBy(linkText="Women")
  private WebElement linkWomen;
 
 @FindBy(xpath="html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
 private WebElement xpathDresses;

 @FindBy(xpath="html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")
 private WebElement xpathshirts;
 
 @FindBy(id="search_query_top")
 private WebElement idsearch;
 
 @FindBy(xpath="//a[contains(text(),'Sign')]")
 private WebElement SigninButton;
 

public  HOMEpage()

{
	PageFactory.initElements(driver, this);
}
public String verifyMyStoreHomepageTitle()
{
	return driver.getTitle();
}
public boolean verifyWomenTab()
{
	return linkWomen.isDisplayed();
}
public boolean verifyDressestab()
{
	return xpathDresses.isDisplayed();
}
public boolean validshirtstab()
{
   return xpathshirts.isDisplayed();
}
public boolean verifysearchtab()
{
	return idsearch.isDisplayed();
}
  public boolean validateMYStoreLogo()
{
     return imgLogo.isDisplayed();
}

    public void clicklinkWomen()
{
        linkWomen.click();
}
    public void clickSigninButton()
    {
    	 SigninButton.click();
    }
}
