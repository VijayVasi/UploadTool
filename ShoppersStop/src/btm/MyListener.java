package btm;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListener implements ITestListener{
	
	public static int p=0;
	public static int f=0;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Hi", true);
		p++;
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		f++;
		
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
		Reporter.log("PassCount: "+p, true);
		Reporter.log("FailCount: "+f, true);
		
	}

}
