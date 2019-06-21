package test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.Config;

public class VerifingHomePageScrollBarMovesAllTheWayToTheBottomPage extends Config{
	
	@Test
	public void VerifingScrollBarMovesAllTheWayToTheBottomPage() throws InterruptedException {
		
		JavascriptExecutor JE = (JavascriptExecutor) driver;  
		JE.executeScript("window.scrollTo(25, document.body.scrollHeight)");

		Thread.sleep(3000);
		
	}

}
