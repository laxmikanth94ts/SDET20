package Practise;

import org.testng.annotations.Test;

public class priority {
	@Test(priority = 2)
	
	public void add() 
	{
		System.out.println("a");
	}
	@Test(priority = 1)
	public void sub() {
		System.out.println("b");

		
	}
	@Test(priority=3)
	public void mul() {
		System.out.println("c");

		
	}

}
