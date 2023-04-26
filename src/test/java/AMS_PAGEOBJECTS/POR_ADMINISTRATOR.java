package AMS_PAGEOBJECTS;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import AMS_TESTPAGE.BASEPAGE;

public class POR_ADMINISTRATOR  extends BASEPAGE{

	public POR_ADMINISTRATOR(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="(//img[@alt='John Doe'])[1]")
	WebElement AMS_Adminlogo;
	
	@FindBy(xpath="//div[@class='account-dropdown__footer']//a[1]")
	WebElement AMS_Adminlogout;

	public void AMS_Adminlogo() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",  AMS_Adminlogo);
		
		}

	public void AMS_Adminlogout() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",  AMS_Adminlogout);
		}


}
