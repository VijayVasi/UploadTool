package qsp;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import btm.MyListener;

@Listeners(MyListener.class)

public class Demo2 {
	
	@Test
	public void m1(){
		
		Reporter.log("m1", true);
		Assert.fail();
	}
	
	@Test
	public void m2(){
		
		Reporter.log("m2", true);
	}
	
	@Test
	public void m3(){
		
		Reporter.log("m3", true);
	}
	
	@Test
	public void m4(){
		
		Reporter.log("m4", true);
	}
	
	@Test
	public void m5(){
		
		Reporter.log("m5", true);
	}
	
	@Test
	public void m6(){
		
		Reporter.log("m6", true);
	}
	
	@Test
	public void m7(){
		
		Reporter.log("m7", true);
	}
	
	@Test
	public void m8(){
		
		Reporter.log("m8", true);
	}
	
	@Test
	public void m9(){
		
		Reporter.log("m9", true);
	}
}
