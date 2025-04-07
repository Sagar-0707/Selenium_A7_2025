package com.Shopperstack_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page 
{
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(@class,'BaseBadge-badge MuiBadge-badge MuiBadge')]")
	private WebElement accountSettingBtn;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myProfileBtn;

	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logOutBtn;
	
	//Genrate getter for accountSettingBtn,myprofileBtn,logOutBtn.


	public WebElement getAccountSettingBtn() 
	{
		return accountSettingBtn;
	}


	public WebElement getMyprofileBtn() 
	{
		return myProfileBtn;
	}

   public WebElement getLogOutBtn() 
	{
		return logOutBtn;
	}

 }






