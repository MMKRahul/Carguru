package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.WebDriverFunctions;

public class Config extends WebDriverFunctions {
	
	@BeforeTest
	public void BeforeTestStart() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DevilR\\Documents\\GitHub\\Carguru\\drivers\\chromedriver.exe");
		// init the chrome driver
		driver = new ChromeDriver();
		
		driver.get("https://www.cargurus.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void afterEachTest(){
		driver.close();
	}

	//@AfterSuite
	//public void suiteComplete(){
		//driver.quit();
		//currentTime();
	
}
