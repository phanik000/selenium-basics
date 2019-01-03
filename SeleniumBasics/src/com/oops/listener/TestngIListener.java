package com.oops.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngIListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test cases started and details are" + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test cases succeded and details are" + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed are" + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test cases skiped and results are" + result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("test failed with success percent details are" + result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test cases on started and details are" + context.getName());

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test cases on finished and details are" + context.getName());

	}

}
