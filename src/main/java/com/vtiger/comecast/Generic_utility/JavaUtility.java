package com.vtiger.comecast.Generic_utility;

import java.util.Date;
import java.util.Random;

	
/**
 * 
 * this class contains java specific libraries
 * @author Laxmikanth
 */
public class JavaUtility {
	/**
	 * this method is ued to generate integer random number between 0 to 100
	 * @return int 
	 */

	 public int getRandomnumber()
	{
		Random random= new Random();
		int randomNo= random.nextInt(100);
		return randomNo;
		
	}
	 /**
	  * this method is used to get current system date and time
	  * @return String
	  */
	 
	  public String SystemDate()
	 {
		 Date date=new Date();
		 String systemDate=date.toString();
		return systemDate;
	 }
	  
	/**
	 *   this method will return current system date in yyyy/mm/dd format
	 * @return String
	 */
	  
	  public String SystemDateInFormat()
		 {
			 Date date=new Date();
			 String systemDate=date.toString();
			String[]s= systemDate.split(" ");
			
			String DD=s[2];
			String YYYY=s[5];
			int MM = date.getMonth()+1;
			String currentDate=YYYY+"-"+MM+"-"+DD;
			return currentDate;
			 
			
		 }
	

}
