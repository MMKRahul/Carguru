package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Config;

public class TotalImgsCount extends Config{
	
	@Test
	public void AllImgsCount() {
		
		List<WebElement> xy= driver.findElements(By.tagName("img"));
		System.out.println(xy.size());
		
	}

}
