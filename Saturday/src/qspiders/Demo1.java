package qspiders;

import java.lang.reflect.Method;

import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	
	@BeforeMethod
	public void m1(Method method){
		Reporter.log("Next Method is: "+ method.getName(),true);
	}
	
	@Test
	public void login(){
		Reporter.log("login",true);
	}

	
	@Test
	public void logout(){
		Reporter.log("logout",true);
		Assert.fail();
	}
	
	@AfterMethod
	public void m3(ITestResult result){
		
		if(result.getStatus()==result.SUCCESS){
			
			Reporter.log("The Test is passed",true);
			
		}
		else{
			
			Reporter.log("The Test is Failed",true);

			//Call TakeScreenshot method
		}
	}
}
