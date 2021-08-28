package com.vtiger.comecast.pomrepositlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
	
	public Home(WebDriver driver)
	{
		 this.driver = driver;
		PageFactory.initElements(driver,this );
	}
	@FindBy(xpath="//a[text()='Products']")
	private WebElement productsLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorImg;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutLink;

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getAdministratorImg() {
		return administratorImg;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}
	
	public void logout()
	{
		Actions act= new Actions(driver);
		act.moveToElement(administratorImg).perform();
		signOutLink.click();
		
		
	}
	
	
	
	
}
	
	


