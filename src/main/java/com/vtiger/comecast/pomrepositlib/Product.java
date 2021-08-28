package com.vtiger.comecast.pomrepositlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.comecast.Generic_utility.WebDriverUtility;

public class Product {
	
	public Product(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement plusLink;
	
	@FindBy(xpath="//td[text()='PRO1 ']")
	private WebElement searchbyprdno;
	
	@FindBy(xpath="//td[text()='PRO1 ']")
	private WebElement searchbypartno;
	
	@FindBy(xpath="//td[text()='PRO1 ']")
	private WebElement searchbyComm;
	
	@FindBy(xpath="//b[text()='In']/../..//select[@id='bas_searchfield']")
	private WebElement searchINTextField;
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchForField;



	
	public WebElement getSearchbyprdno() {
		return searchbyprdno;
	}

	public WebElement getSearchbypartno() {
		return searchbypartno;
	}

	public WebElement getSearchbyComm() {
		return searchbyComm;
	}

	public WebElement getSearchINTextField() {
		return searchINTextField;
	}

	public WebElement getSearchForField() {
		return searchForField;
	}
		
	public WebElement getPlusLink() {
		return plusLink;
	}

	public WebElement getSearchByPrdNo() {
		return searchbyprdno;
		
	}

	public void searchingbasedonprdno() 
	{
		 WebDriverUtility wLib = new WebDriverUtility();
		wLib.select(searchForField, "Product No");
		
	}
	
	
	

}
