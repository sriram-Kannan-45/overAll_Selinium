package com.itest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.utils.screenShot;

public class itestDemo implements ITestListener 
{
	private static final Logger log = LogManager.getLogger(itestDemo.class);
	
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("started: ",result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("passed: ",result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		log.error("failed: ",result.getName());
		
		String path = screenShot.capture(result.getName());
		
		log.error("ScreenShot saved at :",path);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("skiped : ",result.getName());
	}

	
  
}
