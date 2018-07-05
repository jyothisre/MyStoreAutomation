package com.MyStorei.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MyStore.base.DriverScript;

public class LoginPage extends DriverScript{
	
	@FindBy(id="email")
	private WebElement MyStoreemail;
	@FindBy(id="passwd")
	private WebElement Mypassword;
	@FindBy(name="SubmitLogin")
	private WebElement LoginSubmit;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void validsignin()
	{
		 MyStoreemail.sendKeys("dummytest@gmail.com");
		 Mypassword.sendKeys("pass@123");
		 LoginSubmit.click();
	}
	
	public void validsignin2(String username, String password)
	{
		 MyStoreemail.sendKeys(username);
		 Mypassword.sendKeys(password);
		 LoginSubmit.click();
	}
}
