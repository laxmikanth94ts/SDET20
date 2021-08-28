package Pracise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class report1 {
	public WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;

	@BeforeSuite
	public void configs() {
		reporter = new ExtentHtmlReporter("./TestReport/vTigerReport.html");
		reports = new ExtentReports();

		System.out.println("connect to db");
		System.out.println("before suit");
		reports.attachReporter(reporter);
		
		reporter.config().setDocumentTitle("vtiger Analysis Report");
		reporter.config().setTheme(Theme.DARK);
		System.out.println("connect to db");
	}

	@BeforeClass
	public void confb() {
		driver = new ChromeDriver();
		//driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void configBM() {

		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
	}

	@Test
	public void getHomeTitle() {
		driver.findElement(By.linkText("Organizations")).click();
		String  homePageTitle= driver.getTitle();
		System.out.println("HomePageTitle: " + homePageTitle);
		Assert.assertEquals(homePageTitle, "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		test = reports.createTest(homePageTitle);
	}
	@Test
	public void getorgTitle() {
		driver.findElement(By.linkText("Organizations")).click();
		String orgPageTitle= driver.getTitle();
		System.out.println("OrganisationPageTitle: " + orgPageTitle);
		Assert.assertEquals(orgPageTitle, "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		test = reports.createTest(orgPageTitle);
	}
	@AfterMethod
	public void AM() 
	{
	WebElement adminimg= driver.findElement(By.xpath("//img[@src='themes/"
			+ "softed/images/user.PNG']"));
	Actions act= new Actions(driver);
	act.moveToElement(adminimg).perform();
	driver.findElement(By.linkText("Sign Out")).click();

	}
	@AfterClass
	public void AC() 
	{
		driver.quit();
	}
	@AfterSuite
	public void As() 
	{
		
		reports.flush();
	}



	

}
