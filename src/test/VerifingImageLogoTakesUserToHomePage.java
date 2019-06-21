package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Config;
import locators.CarguruLocators;

public class VerifingImageLogoTakesUserToHomePage extends Config{
	
	CarguruLocators IMG = new CarguruLocators();	
	
	@Test
	public void ImagelogoClickToHomePage() {
		
		WebElement ImageFile = driver.findElement(By.xpath(IMG.Image));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent)
        {
             System.out.println("Image not displayed.");
        }
        else
        {
            System.out.println("Image displayed.");
        }
		
	}

}
