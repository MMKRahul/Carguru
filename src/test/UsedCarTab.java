package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.CarguruLocators;

public class UsedCarTab extends Config{
	
	CarguruLocators AB = new CarguruLocators();
	
	@Test
	public void usedcarclick() {
	
		//driver.findElement(By.xpath(AB.Usedcar)).click();;
		
		clickByXpath(AB.Usedcar);
	}
	

}
