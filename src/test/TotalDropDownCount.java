package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Config;

public class TotalDropDownCount extends Config{
	
	@Test
	public void AllDropDownCount() {
		
		List<WebElement> xy= driver.findElements(By.tagName("select"));
		System.out.println(xy.size());
		
	}

}
