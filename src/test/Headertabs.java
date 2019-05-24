package test;

import org.testng.annotations.Test;

import base.Config;
import locators.CarguruLocators;

public class Headertabs extends Config{
	
CarguruLocators AD = new CarguruLocators();
	
	@Test
	public void Headertabsclick() {
	
		
		clickByXpath(AD.Carvalues);
		clickByXpath(AD.Newcars);
		clickByXpath(AD.Sellmycars);
		clickByXpath(AD.Usedcar);
		clickByXpath(AD.Research);
		clickByXpath(AD.Questions);
		
		
	}

}
