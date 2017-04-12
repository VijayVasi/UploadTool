package qsp;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	
	Logger l = Logger.getLogger(Demo1.class);
	
	@BeforeMethod
	public void m1()
	{
		l.info("m1...");
	}
	
	@Test
	public void LogDemo(){
		l.info("testA...");
	}
}
