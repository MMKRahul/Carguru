package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.CarguruLocators;
import values.CarguruValues;

public class MyAccounttabs extends Config{
	
//CarguruLocators AB = new CarguruLocators();

CarguruLocators 	cgl = new CarguruLocators();
CarguruValues		cgv = new CarguruValues();
	
	@Test
	public void MyAccounttabsclick() throws InterruptedException {
		
		clickByXpath(cgl.MyAccount);
		clickByXpath(cgl.Signin);
		
	
			driver.findElement(By.xpath(cgl.EmailAddress)).sendKeys(cgv.EmailVal);

			driver.findElement(By.xpath(cgl.Next));
//			clickByXpath(cgl.Next);
			
			driver.findElement(By.xpath(cgl.Password)).sendKeys(cgv.PassVal);
			
			driver.findElement(By.xpath(cgl.SigninButton));
			
//		clickByXpath(cgl.SigninButton);	
		
		Thread.sleep(5000);
		
		
		}
		

}
