package AMS_PAGEOBJECTS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import AMS_TESTPAGE.BASEPAGE;

public class POR_MANAGENTRY extends BASEPAGE{

	public POR_MANAGENTRY(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[text()[normalize-space()='Manage Auto/Taxi Entry']]")
	WebElement AMS_ManageEntry01;
	
	@FindBy(xpath="(//ul[contains(@class,'list-unstyled navbar__sub-list')]//a)[3]")
	WebElement AMS_ALL;
	
	
	@FindBy(xpath="(//table[contains(@class,'table table-borderless')]//a)[3]")
	WebElement AMS_ALLDELETE;
	
	public void AMS_ManageEntry01() {
		AMS_ManageEntry01.click();
	}
	
	public void AMS_ALL() {
		AMS_ALL.click();
	}
	
	public void AMS_ALLDELETE() {
		
		AMS_ALLDELETE.click();
		Alert alt1=driver.switchTo().alert();
		alt1.accept();
	}
	
	
}
