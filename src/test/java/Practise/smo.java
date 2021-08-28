package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class smo extends BaseClass{
	@Test

	public void search_Prdby_partnoTest() throws Throwable {
		

		
		String productname=eLib.getDataFromExcel("Sheet1", 1, 1)+jLib.getRandomnumber();
		String productno=eLib.getDataFromExcel("Sheet1", 1, 2)+jLib.getRandomnumber();
				
		Home homePage=new Home(driver);
		homePage. getProductsLink().click()	;
		
		Product product= new Product(driver);
		product.getPlusLink().click();
		
		CreatingNewProduct crtprd= new CreatingNewProduct(driver);
		crtprd.newProduct(productname, productno);
		Thread.sleep(5000);
		
		ProductInformation productinf= new ProductInformation(driver);
		Thread.sleep(5000);
		 String actualMsg=productinf.getSucessfullMsg().getText();
		 if(actualMsg.contains(productname))
		 {
			 System.out.println("Pass::Product created succesfully");
		 }
		 else
		 {
			 System.out.println("Fail::Product  not created");

		 }
		 Thread.sleep(5000);
		 
	productinf.getProductsLink().click();
		
	product.getSearchByPrdNo().click();
	Thread.sleep(5000);
	String confirMsg=product.getSearchByPrdNo().getText();
	 if(productno.equals(confirMsg))
	 {
		 System.out.println("Pass:Searching is successfull");
	 }
	 else
	 {
		 System.out.println("Fail: Searching is not succesfull");

	 }
	 Thread.sleep(5000);
		}
	@Test(groups="smoke")
	public void search_Prdby_partnoTest1()  throws Throwable {
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
	 if(partno.equals(confirMsg))
	 {
		 System.out.println("Pass:Searching is successfull");
	 }
	 else
	 {
		 System.out.println("Fail: Searching is not succesfull");

	 }
		}
	
	@Test
	public void search_Prdby_commrateTest() throws Throwable {

	int randomno=jLib.getRandomnumber();
	
	
	
	
	String productname=eLib.getDataFromExcel("Sheet1",3 ,1 )+randomno;
	String commrate=eLib.getDataFromExcel("Sheet1", 3, 4);
	
	
	
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

	 System.out.println("Pass:Searching is successfull");
 }
 else
 {
	 System.out.println("Fail: Searching is not succesfull");

 }
 
}


	
}
	
	
	
	
		
		
		
		
		
		

		
		

	


