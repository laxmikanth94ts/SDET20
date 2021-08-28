package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class createorganisation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("TestYantra4");
		
		WebElement industryDD = driver.findElement(By.name("industry"));
		Select s1=new Select(industryDD);
		Thread.sleep(3000);
		s1.selectByVisibleText("Banking");
		
		WebElement ratingDD = driver.findElement(By.name("rating"));
		Select s2=new Select(ratingDD);
		Thread.sleep(3000);
       s2.selectByVisibleText("Active");
		
		WebElement typeDD = driver.findElement(By.name("accounttype"));
		Select s3=new Select(typeDD);
		Thread.sleep(3000);
		s3.selectByVisibleText("Customer");
		Thread.sleep(3000);

		
		 driver.findElement(By.xpath("//input[contains(@value,'Save')]")).click();
		 
		/*WebElement s = driver.findElement(By.xpath("//img [@src="
		 		+ "'themes/softed/images/user.PNG']"));
		Actions action=new Actions(driver);
		action.moveToElement(s);
		
		 
		 driver.findElement(By.xpath("//a[text()='Sign Out']")).click();*/
		 
		 driver.quit();

		 
		 

		
		
		
		
		
		
		

	}

}
