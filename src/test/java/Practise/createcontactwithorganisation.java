package Practise;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createcontactwithorganisation {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		System.out.println("read");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		 System.out.println("read");

		

		 String homePageTitle=driver.getTitle();
		 System.out.println("homePageTitle: "+homePageTitle);
		
		driver.findElement(By.linkText("Organizations")).click();
		 String orgPageTitle=driver.getTitle();
		 System.out.println("organisationPageTitle: "+orgPageTitle);


		
		
		/*driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		driver.findElement(By.name("lastname")).sendKeys("TS");
		String parentWid = driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@alt='Select' "
				+ " and contains(@onclick,'return')]")).click();
		Set<String> allWids = driver.getWindowHandles();
		for(String wid: allWids)
		{
			if(!wid.equals(parentWid))
			{
				driver.switchTo().window(wid);
				break;
			}
		}
		driver.findElement(By.linkText("TestYantra")).click();
		for(String wid: allWids)
		{
			if(wid.equals(parentWid))
			{
				driver.switchTo().window(wid);
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();*/
		driver.quit();

	    }

		}


	


