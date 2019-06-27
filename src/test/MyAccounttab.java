package test;

import org.testng.annotations.Test;
import base.Config;

public class MyAccounttab extends Config {
	
	@Test
	public void myaccounttabclick() throws InterruptedException {
		
		Thread.sleep(7000);
		// Login first
		logInToCarGuru (EmailVal, PassVal);
		
		// do remainting test
		
		
		//logOutFromCarGuru();
	
		
	}
}
