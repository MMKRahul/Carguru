package test;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.CarguruLocators;
import utils.Xls_Reader;


public class ReadFromXL extends Config{
	
	Xls_Reader XLR = new Xls_Reader(System.getProperty("user.dir")+"//testCase.xlsx");
	
	CarguruLocators cgl = new CarguruLocators();
	
	@Test
	public void ReadfrmXL() throws InterruptedException {
		
		clickByXpath(cgl.MyAccount);
		
		clickByXpath(cgl.Signin);
		
		String Value = XLR.getCellData("Carguru","TestData",2);
		
		driver.findElement(By.xpath(cgl.EmailAddress)).sendKeys(Value);
		
		Thread.sleep(5000);
		
		clickByXpath(cgl.Next);
		
		
		
	}

}
