package qsp;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3{
	
	@Parameters("city")
	@Test
	public void testA(@Optional("Mysore")String b){
		
		Reporter.log(b,true);
		//Reporter.log(c,true);
	}
}		
