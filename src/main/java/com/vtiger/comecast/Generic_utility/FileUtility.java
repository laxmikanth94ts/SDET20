package com.vtiger.comecast.Generic_utility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @Laxmikanth 
 * this class contains all excel related libraries
 * 
 */

public class FileUtility {
	
	public String getPropertyKeyVAlue(String key)throws Throwable
	{
		FileInputStream fin= new FileInputStream("./Data/config.properties");
		 Properties pobj = new Properties();
		 pobj.load(fin);
		 String value=pobj.getProperty(key);
		return value;
	}

}
