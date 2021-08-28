package com.vtiger.comecast.Generic_utility;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**this class contains WebDriver specific methods/libraries
 * @Laxmikanth
 */


public class WebDriverUtility {
	/**
	 *  this method will wait  for 10 Seconds for page loading 
	 * @param driver
	 */
	
	public void implictWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/**
	 *  this method will wait  for  element to be visible Untill 10 Seconds 
	 * @param driver
	 * @param element
	 */
	
	public void explicitWait(WebDriver driver,WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 *  this method will wait  for 10 Seconds for page loading 
	 * @param driver
	 * @param element
	 */
	
	
	public void mouseHovering(WebDriver driver, WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element);
	}
	
	
	/**
	 *  this method will perform right click operation 
	 * @param driver
	 * @param element
	 */
	
	public void rightClick(WebDriver driver, WebElement element)
	{
		Actions action=new Actions(driver);
		action.contextClick(element);
	}
	
	/**
	 *  this method enables user to select option from dropdown based on Visible text  
	 * @param driver
	 * @param element
	 */
	
	
	public void select(WebElement element, String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	/**
	 *  this method enables user to select option from dropdown based on index  
	 * @param driver
	 * @param element
	 */
	
	public void select(WebElement element, int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void switchToWindow(WebDriver driver,String partialWinTitle)
	{
		Set<String>allWids=driver.getWindowHandles();
		for(String wid:allWids)
		{
			driver.switchTo().window(wid);
			break;
		}
	}
	public void accept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void dismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	
	
	
	
}
