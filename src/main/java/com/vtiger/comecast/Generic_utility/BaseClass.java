package com.vtiger.comecast.Generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import com.vtiger.comecast.pomrepositlib.Home;
import com.vtiger.comecast.pomrepositlib.Login;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver bDriver;
	
	 public WebDriver driver;
	public WebDriverUtility wLib = new WebDriverUtility();
	public JavaUtility jLib = new JavaUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public FileUtility fLib = new FileUtility();

	
		@BeforeSuite(groups="smoke")
		public void configBS()
		{
			System.out.println("Before Suite");

		}
		//@Parameters("BROWSER")
		@BeforeClass(groups="smoke")
		public void Bc() throws Throwable
		{
			/*if(BROWSER.equals("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(BROWSER.equals("firefox"))
			{
				driver=new FirefoxDriver();

			}
			else
			{
				driver=new ChromeDriver();
			}*/
			
			   driver=new ChromeDriver();
			   bDriver=driver;
				driver.manage().window().maximize();
				wLib.implictWait(driver);
				
		}
				

		
		@BeforeMethod(groups="smoke")
		public void BM() throws Throwable
		{
			   String url=fLib.getPropertyKeyVAlue("appUrl");
			   driver.get(url);
			   

			 String username=fLib.getPropertyKeyVAlue("username");
			   String password=fLib.getPropertyKeyVAlue("password");
			wLib.implictWait(driver);
			Login loginPage=new Login(driver);
			loginPage.logintoApp( username, password);
			
			
		}
		@AfterMethod(groups="smoke")
		public void AM()
		{
			Home homePage= new Home(driver);
			 homePage.logout();
		}
		@AfterClass(groups="smoke")
		public void AC()
		{
			driver.quit();
		}
		@AfterSuite(groups="smoke")
		public void configAS()
		{
			System.out.println("After Suite");
		}
		

}
