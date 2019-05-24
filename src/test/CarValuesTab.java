package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.CarguruLocators;

public class CarValuesTab extends Config{
	
CarguruLocators AD = new CarguruLocators();
	
	@Test
	public void carvaluesclick() {
	
		//driver.findElement(By.xpath(AD.Carvalues)).click();
		
		clickByXpath(AD.Carvalues);
		
		
	}

}
