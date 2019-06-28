package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Config;
import locators.CarguruLocators;
import values.CarguruValues;

public class SearchNewCar extends Config{
	
	CarguruLocators cgl = new CarguruLocators();
	CarguruValues cgv = new CarguruValues();
	
	
	@Test
	public void NewcarByModel() throws InterruptedException {
		
		clickByXpath(cgl.SearchNewCars);
		
		WebElement xy=driver.findElement(By.xpath(cgl.SelectMakes));
		Select sel=new Select (xy);
		sel.selectByValue("m3");
		
		WebElement yz=driver.findElement(By.xpath(cgl.SelectModels));
		Select sel1=new Select (yz);
		sel1.selectByValue("d2263");
		
		typeByXpath(cgl.Near,cgv.NearVal);
		
		driver.findElement(By.xpath(cgl.NewClickSearch)).click();
		
		Thread.sleep(9000);

		
	}

}
