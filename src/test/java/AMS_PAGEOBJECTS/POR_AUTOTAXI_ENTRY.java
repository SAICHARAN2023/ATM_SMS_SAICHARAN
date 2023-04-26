package AMS_PAGEOBJECTS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import AMS_TESTPAGE.BASEPAGE;

public class POR_AUTOTAXI_ENTRY  extends BASEPAGE{

	public POR_AUTOTAXI_ENTRY(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[text()[normalize-space()='Dashboard']]")
	WebElement AMS_Dashboard;
	
	
	public void AMS_Dashboard() {
		AMS_Dashboard.click();
		}
	
	@FindBy(xpath="//a[text()[normalize-space()='New Auto/Taxi Entry']]")
	WebElement AMS_NewATEntry;

	public void AMS_NewATEntry() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", AMS_NewATEntry);
		//AMS_NewATEntry.click();
		}
	
	
	@FindBy(xpath="//div[@class='col-12 col-md-9']//select[1]")
	WebElement AMS_Vehicletype;
	
	
	@FindBy(name="drivername")
	WebElement AMS_Drivername;
	
	@FindBy(name="mobilenumber")
	WebElement AMS_Mobileno;
	
	@FindBy(name="licensenumber")
	WebElement AMS_Licensenumber;
	
	@FindBy(name="registrationnumber")
	WebElement AMS_Registerno;
	
    @FindBy(xpath="//button[text()[normalize-space()='Add']]")
    WebElement AMS_AddRegister; 
    
    public void AMS_Vehicletype(String vehicle) {
    	wLib.handleDropDown(vehicle, AMS_Vehicletype);
    	
		} 
    
    public void AMS_Mobileno(String mno) {
    	AMS_Mobileno.sendKeys(mno);
    	
    }
    
    public void AMS_Drivername(String Dno) {
    	AMS_Drivername.sendKeys(Dno);
    	
    }
    
    
    public void AMS_Licensenumber(String lno) {
    	AMS_Licensenumber.sendKeys(lno);
    	
    }
    
    public void AMS_Registerno(String rno) {
    	AMS_Registerno.sendKeys(rno);
    	
    }
    
    public void AMS_AddRegister() {
    	AMS_AddRegister.click();
    	Alert at=driver.switchTo().alert();
    	at.accept();
    	
    }
    
    

}
