package test;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.Config;
import locators.CarguruLocators;

public class FooterTabs extends Config{
	
	CarguruLocators AD = new CarguruLocators();
	
	@Test
	public void VerifingFooterTabs() {
		
		driver.findElement(By.xpath(AD.AboutCarGuru)).click();
		
		driver.findElement(By.xpath(AD.DealerSignup)).click();
		
		driver.findElement(By.xpath(AD.Privacy)).click();
		
		driver.findElement(By.xpath(AD.Help)).click();
		
		throw new SkipException("Don't Want To Run This Test For Now");
	}

}
