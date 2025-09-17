package com.listeners.selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.annotations.IListeners;

public class ListernersClass implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		
		String res= result.getName();
		Reporter.log("Method" +res+"is Started",true);
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String res= result.getName();
		Reporter.log("Method" +res+"is  Passed",true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		String res= result.getName();
		Reporter.log("Method" +res+"is failed",true);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}



	

}
