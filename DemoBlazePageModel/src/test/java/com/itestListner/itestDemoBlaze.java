package com.itestListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.util.screenShotDemoBlaze;

public class itestDemoBlaze implements ITestListener

{

	

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String path = screenShotDemoBlaze.capture(result.getName()) ;
		
		System.out.println(result.id()+"sriram");
		
	}

	

	
	
	

}
