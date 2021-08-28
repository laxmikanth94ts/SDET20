package com.vtiger.comecast.pomrepositlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInformation {
	

	public ProductInformation(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	
	@FindBy(css="span[class='lvtHeaderText']")
	private WebElement sucessfullMsg;
	
	@FindBy(linkText="Products")
	private WebElement productsLink;

	public WebElement getSucessfullMsg() {
		return sucessfullMsg;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}
	
	
	
	

}
