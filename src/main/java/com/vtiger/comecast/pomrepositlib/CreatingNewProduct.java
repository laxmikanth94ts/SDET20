package com.vtiger.comecast.pomrepositlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewProduct {
	
	public CreatingNewProduct(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	@FindBy(name="productname")
	private WebElement productNameEdt;
	
	@FindBy(id="productcode")
	private WebElement partNumberEdt;
	
	@FindBy(css="input[title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(id="commissionrate")
	private WebElement commEdt;

	public WebElement getProductNameEdt() {
		return productNameEdt;
	}

	public WebElement getProductCodeEdt() {
		return partNumberEdt;
	}
	
	public void newProduct(String productname, String productcode)
	{
		productNameEdt.sendKeys(productname);
		partNumberEdt.sendKeys(productcode);
		saveBtn.click();
		
	}
	public void newProduct(String productname, String partno,Boolean value)
	{
		productNameEdt.sendKeys(productname);
		partNumberEdt.sendKeys(partno);
		saveBtn.click();
		
	}
	public void newProduct(String productname, String commissionRate,Boolean value, Boolean no)
	{
		productNameEdt.sendKeys(productname);
		commEdt.sendKeys(commissionRate);
		saveBtn.click();
		
	}
	
	
	
	
}
