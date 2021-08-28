package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.comecast.Generic_utility.BaseClass;

public class createorg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

		String homePageTitle = driver.getTitle();
		System.out.println("homePageTitle: " + homePageTitle);

		driver.findElement(By.linkText("Organizations")).click();
		String orgPageTitle = driver.getTitle();
		System.out.println("organisationPageTitle: " + orgPageTitle);
	}
}
