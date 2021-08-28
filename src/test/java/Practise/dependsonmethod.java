package Practise;

import org.testng.annotations.Test;

public class dependsonmethod {
	@Test(dependsOnMethods = "sub")

   public void add()
    {
		System.out.println("a");
    }
	
	@Test
	public void sub()
    {
		System.out.println("c");
    }
	
	@Test
	public void mul()
    {
		System.out.println("b");
    }
	

}
