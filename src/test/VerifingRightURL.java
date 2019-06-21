package test;

import org.testng.annotations.Test;

import base.Config;

public class VerifingRightURL extends Config {
	
	@Test
	public void UsingRightURL() {
		
		System.out.println(driver.getCurrentUrl());
		String AB = driver.getCurrentUrl();
		
		if(AB.equalsIgnoreCase("https://www.cargurus.com/")){
			System.out.println("User input right url");
		}
		else{
			System.out.println("User used wrong url");
		}
		
	}

}
