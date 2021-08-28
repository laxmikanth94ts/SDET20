package Practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeMyTrip 
{
	

	
	@Test(dataProvider="bookTicketDataProvider")
	public void bookTicket(String src,String des)
	
	{
		System.out.println("Source:"+src+" Destianation:"+des);
	}
	@DataProvider
	public Object[][]bookTicketDataProvider() 
	{
		Object[][]obj=new Object[5][2];
		obj[0][0]="Bangalore";
		obj[0][1]="Mangalore";
		
	     obj[1][0]="Bangalore";
		obj[1][1]="Mysore";
		
		obj[2][0]="Bangalore";
		obj[2][1]="Mandya";
		
		obj[3][0]="Bangalore";
		obj[3][1]="Hubli";
		
		obj[4][0]="Udupi";
		obj[4][1]="Belagum";
		 return obj;
	}
	

	
}
