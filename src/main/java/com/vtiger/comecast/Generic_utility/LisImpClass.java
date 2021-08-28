package com.vtiger.comecast.Generic_utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisImpClass implements ITestListener {
	
	
	public void onTestFailure(ITestResult result)
	{
		String testName=result.getMethod().getMethodName();
		System.out.println("execute::im listening");
		
		EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.bDriver);
		File srcFile =eDriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./screenshot/"+testName+".png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
