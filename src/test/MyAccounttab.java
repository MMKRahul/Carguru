package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.CarguruLocators;
import values.CarguruValues;

public class MyAccounttab extends Config {

	CarguruLocators cgl = new CarguruLocators();
	CarguruValues cgv = new CarguruValues();
	
	@Test
	public void myaccounttabclick() {
		
		clickByXpath(cgl.MyAccount);
		clickByXpath(cgl.Signin);
		
		typeByXpath(cgl.EmailAddress,cgv.EmailVal);
		driver.findElement(By.xpath(cgl.Next));
		
//		typeByXpath(cgl.Password,cgv.PassVal);
//		driver.findElement(By.xpath(cgl.SigninButton));
		
	}
}
