package com.vtiger.comecast.producttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.comecast.Generic_utility.BaseClass;
import com.vtiger.comecast.Generic_utility.ExcelUtility;
import com.vtiger.comecast.Generic_utility.FileUtility;
import com.vtiger.comecast.Generic_utility.JavaUtility;
import com.vtiger.comecast.Generic_utility.WebDriverUtility;
import com.vtiger.comecast.pomrepositlib.CreatingNewProduct;
import com.vtiger.comecast.pomrepositlib.Home;
import com.vtiger.comecast.pomrepositlib.Login;
import com.vtiger.comecast.pomrepositlib.Product;
import com.vtiger.comecast.pomrepositlib.ProductInformation;
@Listeners(com.vtiger.comecast.Generic_utility.LisImpClass.class)
public class TC_2_Search_Prdby_partnoTest extends BaseClass{
	@Test

	public void search_Prdby_partnoTest()  throws Throwable {
		// TODO Auto-generated method stub
		
	int randomno=jLib.getRandomnumber();
		
		
		
		
		String productname=eLib.getDataFromExcel("Sheet1",2 ,1 )+randomno;
		String partno=eLib.getDataFromExcel("Sheet1", 2, 3);
		
		
		
				Home homePage=new Home(driver);
		homePage. getProductsLink().click()	;
		
		Product product= new Product(driver);
		product.getPlusLink().click();
		
		CreatingNewProduct crtprd= new CreatingNewProduct(driver);
		crtprd.newProduct(productname, partno,true);
		
		ProductInformation productinf= new ProductInformation(driver);
		 String actualMsg=productinf.getSucessfullMsg().getText();
		 Assert.assertEquals(false, true);
		 /*if(actualMsg.contains(productname))
		 {
			 System.out.println("Pass::Product created succesfully");
		 }
		 else
		 {
			 System.out.println("Fail::Product  not created");

		 }*/
		 
	productinf.getProductsLink().click();
	
	
	/*product.searchingbasedonprdno() ;
	product.getSearchForField().sendKeys(partno);*/
	
	
	
	
		
	product.getSearchByPrdNo().click();
	String confirMsg=product.getSearchByPrdNo().getText();
	 if(partno.equals(confirMsg))
	 {
		 System.out.println("Pass:Searching is successfull");
	 }
	 else
	 {
		 System.out.println("Fail: Searching is not succesfull");

	 
		}
	}

}
