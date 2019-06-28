package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.CarguruLocators;
import utils.Xls_Reader;

public class WriteInToXL extends Config{
	
Xls_Reader XLR = new Xls_Reader(System.getProperty("user.dir")+"//testCase.xlsx");
	
	CarguruLocators cgl = new CarguruLocators();
	
	@Test
	public void TextWriteInXL () {
		
		String valueF=driver.findElement(By.xpath(cgl.FooterText)).getText();
		XLR.setCellData("Carguru","TestData",7,valueF);
		
		String valueH=driver.findElement(By.xpath(cgl.HeaderText)).getText();
		XLR.setCellData("Carguru","TestData",6,valueH);
		
	}

}
