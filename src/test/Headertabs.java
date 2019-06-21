package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Config;
import locators.CarguruLocators;

public class Headertabs extends Config{
	
CarguruLocators AD = new CarguruLocators();
	
	@Test
	public void Headertabsclick() throws InterruptedException {
	
		
		clickByXpath(AD.Carvalues);
		clickByXpath(AD.Newcars);
		clickByXpath(AD.Sellmycars);
		clickByXpath(AD.Usedcar);
		clickByXpath(AD.Research);
		clickByXpath(AD.Questions);
		clickByXpath(AD.Advertise);
		clickByXpath(AD.DropdownEN);
		clickByXpath(AD.SelectUSA);

		
		//driver.findElement(By.linkText(AD.PopularSedansUHS)).click();
		
		
		
	}

}
