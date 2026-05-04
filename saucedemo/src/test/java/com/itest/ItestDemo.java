package com.itest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.utilities.DemoScreenShot;

public class ItestDemo implements ITestListener 
{

	

	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		String path = DemoScreenShot.capture(result.getName());
		
		System.out.println(path);
	}

	

	


	

}
