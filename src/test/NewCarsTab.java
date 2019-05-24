package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.CarguruLocators;

public class NewCarsTab extends Config{
	
CarguruLocators AC = new CarguruLocators();
	
	@Test
	public void newcarsclick() {
	
		driver.findElement(By.xpath(AC.Newcars)).click();
		
		//clickByXpath(AC.Newcars);
		
	}

}
