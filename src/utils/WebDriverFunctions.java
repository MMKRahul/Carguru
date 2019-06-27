package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import locators.CarguruLocators;
import values.CarguruValues;

public class WebDriverFunctions {
	
	protected WebDriver driver;
	public String EmailVal = "mehedikabir007@gmail.com";
	public String PassVal = "Rahul007";
	
	CarguruLocators cgl = new CarguruLocators();
	CarguruValues cgv = new CarguruValues();
	
	public void logInToCarGuru(String email, String pass) throws InterruptedException {
		
		clickByXpath(cgl.MyAccount);
		clickByXpath(cgl.Signin);
		Thread.sleep(200);
		typeByXpath(cgl.EmailAddress,email);
		driver.findElement(By.xpath(cgl.nextButton)).click();
		typeByXpath(cgl.Password,pass);
		driver.findElement(By.xpath(cgl.SigninButton)).click();
		}
	
	public void logOutFromCarGuru() {
		clickByXpath (" xpath goes here ");
	}
	
	// type
	 // by xpath, 
	 // by id
	 // by class
	 // by css
	
	// click
	 // by link
	 // tagname
	 // by xpatch
	
	// getText
	// radioButton
	// dropdown
	// iFrame
	// windows handle
	// switch
	// ---------------------------- EDIT BOX ----------------
	public void typeByXpath (String loc, String val){
		driver.findElement(By.xpath(loc)).sendKeys(val);
	}
	public void typeByName (String loc, String val){
		driver.findElement(By.name(loc)).sendKeys(val);
	}
	// ----------------------- CLICK -------------------
	public void clickByXpath (String loc){
		driver.findElement(By.xpath(loc)).click();
	}
	
	public void clickByLinkText(String val){
		driver.findElement(By.linkText(val));
	}
	// -------------- TIME
	public void currentTime() {
		// java code to get the current time
	}
	// implicit wait
	public void customSleep (int x) throws InterruptedException{
		Thread.sleep(x);
	}
	
	// ------------------ RadioButton
	
}
