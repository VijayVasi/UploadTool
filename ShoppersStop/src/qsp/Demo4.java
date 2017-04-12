package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo4 {
	
	@BeforeMethod
	public void m1(){
		
		Reporter.log("M1",true);
	}
	
	@Test
	public void m2(){
			
		Reporter.log("M2",true);
	}
	
	@AfterMethod
	public void m3(){
		
		Reporter.log("M3",true);
	}
}
