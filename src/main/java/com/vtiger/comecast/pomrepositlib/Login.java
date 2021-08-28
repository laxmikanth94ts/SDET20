package com.vtiger.comecast.pomrepositlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
 
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	@FindBy(name="user_name")
	private WebElement userNameEdt;
	
	@FindBy(name="user_password")
	private WebElement userPasswordEdt;
	
	@FindAll({@FindBy(id="submit_button"),@FindBy(css="input[id='submitButton']")})
	private WebElement loginButton;

	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getUserPasswordEdt() {
		return userPasswordEdt;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void logintoApp(String username,String password)
	{
		//userNameEdt.clear();
		userNameEdt.sendKeys(username);
		//userPasswordEdt.clear();
		userPasswordEdt.sendKeys(password);
		loginButton.click();
		
	}
	
}
