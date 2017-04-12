	package Reports;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo {

	public ExtentReports reports;
	public ExtentTest test;
	
	@BeforeSuite
	public void m1(){
		reports = new ExtentReports("./res/report.html");
	}
	
	@AfterSuite
	public void m2(){
		reports.flush();
	}
	
	@BeforeMethod
	public void m3(Method method){
		test = reports.startTest(method.getName());
	}
	
	@AfterMethod
	public void m4(ITestResult result){
		if(result.getStatus()==result.SUCCESS){
			test.log(LogStatus.PASS, "details");
		}
		else
		{
			test.log(LogStatus.FAIL, "details");
		}
		
		reports.endTest(test);
	}
	
	@Test
	public void login(){
		
	}
	
	@Test
	public void logout(){
		Assert.fail();
	}
}
