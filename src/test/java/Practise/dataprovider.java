package Practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@Test(dataProvider = "automation")
	public void add(String s) 
	{
		System.out.println(s);
	}
	
	@DataProvider
	public Object[][] automation()
	{
		Object[][] obj= new Object[2][1] ;
		obj[0][0] ="read";
		//obj[0][1]="rute";
		obj[1][0]="6";
		//obj[1][1]="62";
		return obj;
		
		
	}
	

}

