package Practise;

import org.testng.annotations.Test;

public class invocationcount {
	@Test(invocationCount = 3)
	
	public void add() 
	{
		System.out.println("a");
	}
	
	

}
