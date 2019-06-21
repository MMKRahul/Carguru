package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Config;
import locators.CarguruLocators;
import values.CarguruValues;

public class SearchUsedCarByModel extends Config{

	CarguruLocators cgl = new CarguruLocators();
	CarguruValues cgv = new CarguruValues();
	
	@Test
	public void UsedCarByModel() throws InterruptedException {
		
		WebElement xy=driver.findElement(By.xpath(cgl.AllMakes));
		Select sel=new Select (xy);
		sel.selectByValue("m19");
		
		WebElement yz=driver.findElement(By.xpath(cgl.AllModels));
		Select sel1=new Select (yz);
		sel1.selectByValue("d25");
		
		typeByXpath(cgl.ZIP,cgv.ZIPVal);
		
		driver.findElement(By.xpath(cgl.ClickSearch)).click();
		
		Thread.sleep(3000);

		
	}

}
