package AMS_PAGEOBJECTS;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import AMS_TESTPAGE.BASEPAGE;

public class POR_ADMINHOMEPAGE extends BASEPAGE {

	//CALL TO CONSTRUCTOR FROM BASEPAGE
	public POR_ADMINHOMEPAGE(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
		
		
		
	

	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/ul/li[3]/a")
	WebElement AMS_Adminhomepage;
	
	@FindBy(name="username")
	WebElement AMS_LoginUsername;
	


	
	@FindBy(name="password")
	WebElement AMS_Adminpassword;

	
	@FindBy(xpath="(//button[@name='login'])[1]")
	WebElement AMS_Adminlogin;

	
	public void AMS_Adminhomepage() {
		
     AMS_Adminhomepage.click();
	}
	
	public void AMS_LoginUsername(String LUN) {
		AMS_LoginUsername.sendKeys(LUN);
		}
	
	public void AMS_Adminpassword(String LUP) {
		AMS_Adminpassword.sendKeys(LUP);
		}
	
	public void AMS_Adminlogin() {
		
		AMS_Adminlogin.click();
		}
	

	

}
		
	
