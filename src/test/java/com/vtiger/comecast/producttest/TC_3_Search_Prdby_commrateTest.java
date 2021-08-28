package com.vtiger.comecast.producttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.comecast.Generic_utility.ExcelUtility;
import com.vtiger.comecast.Generic_utility.FileUtility;
import com.vtiger.comecast.Generic_utility.JavaUtility;
import com.vtiger.comecast.Generic_utility.WebDriverUtility;
import com.vtiger.comecast.pomrepositlib.CreatingNewProduct;
import com.vtiger.comecast.pomrepositlib.Home;
import com.vtiger.comecast.pomrepositlib.Login;
import com.vtiger.comecast.pomrepositlib.Product;
import com.vtiger.comecast.pomrepositlib.ProductInformation;

public class TC_3_Search_Prdby_commrateTest {
	@Test(groups="smoke")

	public void search_Prdby_commrateTest() throws Throwable {
		// TODO Auto-generated method stub
		
		JavaUtility jLib=new JavaUtility();
		WebDriverUtility wLib=new WebDriverUtility();
		ExcelUtility eLib = new ExcelUtility();
		FileUtility fLib = new FileUtility();
		
		String username=fLib.getPropertyKeyVAlue("username");
		String password=fLib.getPropertyKeyVAlue("password");
		String url=fLib.getPropertyKeyVAlue("appUrl");
		
		int randomno=jLib.getRandomnumber();
		
		
		
		
		String productname=eLib.getDataFromExcel("Sheet1",3 ,1 )+randomno;
		String commrate=eLib.getDataFromExcel("Sheet1", 3, 4);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		wLib.implictWait(driver);
		driver.get(url);
		
		Login loginPage=new Login(driver);
		loginPage.logintoApp( username, password);
		
		Home homePage=new Home(driver);
		homePage. getProductsLink().click()	;
		
		Product product= new Product(driver);
		product.getPlusLink().click();
		
		CreatingNewProduct crtprd= new CreatingNewProduct(driver);
		crtprd.newProduct(productname, commrate,true,true);
		
		ProductInformation productinf= new ProductInformation(driver);
		 String actualMsg=productinf.getSucessfullMsg().getText();
		 if(actualMsg.contains(productname))
		 {
			 System.out.println("Pass::Product created succesfully");
		 }
		 else
		 {
			 System.out.println("Fail::Product  not created");

		 }
		 
	productinf.getProductsLink().click();
		
	product.getSearchByPrdNo().click();
	String confirMsg=product.getSearchByPrdNo().getText();
	 if(commrate.equals(confirMsg))
	 {
		 System.out.println("Pass:Searching is successfull");
	 }
	 else
	 {
		 System.out.println("Fail: Searching is not succesfull");

	 }
	 homePage.logout();
	 
    
	 

	}

}
