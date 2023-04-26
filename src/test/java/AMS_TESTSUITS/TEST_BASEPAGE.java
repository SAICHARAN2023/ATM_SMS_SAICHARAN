package AMS_TESTSUITS;

import java.io.IOException;

import java.util.HashMap;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import AMS_GENERIC_LIBRARY.AMSDP_HASHMAPUTIL;
import AMS_GENERIC_LIBRARY.AMS_DPEXCEL;
import AMS_GENERIC_LIBRARY.WEBDRIVER_LIBRARY_ATMS;
import AMS_PAGEOBJECTS.POR_ADMINHOMEPAGE;
import AMS_PAGEOBJECTS.POR_ADMINISTRATOR;

public class TEST_BASEPAGE {
	
	public static WebDriver driver;
	
	public ResourceBundle rb;
	public static Logger logger;
	
	public static AMSDP_HASHMAPUTIL HLib=new AMSDP_HASHMAPUTIL();
	
	public static AMS_DPEXCEL ALib=new AMS_DPEXCEL();
	
	public WEBDRIVER_LIBRARY_ATMS wLib=new WEBDRIVER_LIBRARY_ATMS();
	    
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	@Parameters({"browser"})
	public void Browsersetup(String br) throws InterruptedException, IOException {
		logger=LogManager.getLogger(this.getClass());
			logger.info("****** start the browser *********");
		rb=ResourceBundle.getBundle("config");
		
		if(br.equals("chrome")) {
		
			   driver=new ChromeDriver();
			   
		}else if((br.equals("fire")) ) {
	        
			driver=new FirefoxDriver();
		}
		
        else if((br.equals("edge")) ) {
	        
			driver=new EdgeDriver();
		}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			HashMap<String,String>  data=HLib.AMS_MAPDataManager();
			String U=data.get("URL");
			driver.get(U);
			logger.info("***browser setup****");
			
			String hometitle=driver.getTitle();
			
		 	Assert.assertEquals(hometitle, "Auto/Taxi Stand Management System | Home Page");
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
			
			
		}
	
	
	
	@BeforeMethod
	public void AdminLoginsetup() throws IOException
	{
		
		
			
		POR_ADMINHOMEPAGE  AHP=new POR_ADMINHOMEPAGE(driver);
	    AHP.AMS_Adminhomepage();
		HashMap<String,String>  data=HLib.AMS_MAPDataManager();
		String A=data.get("AUNAME");
	
		String P=data.get("AUPASS");
	
		AHP.AMS_LoginUsername(A);
		logger.info("***entered username****");
	    AHP.AMS_Adminpassword(P);
	    logger.info("***entered password****");
		
		//AHP.AMS_LoginUsername(rb.getString("A"));
		// AHP.AMS_Adminpassword(rb.getString("P"));
		AHP.AMS_Adminlogin();
	
		}
	
	
	@AfterMethod
	public void AdminLogoutsetup() {
		POR_ADMINISTRATOR PAS=new POR_ADMINISTRATOR(driver);
		PAS.AMS_Adminlogo();
		logger.info("***clicked on logo ****");
		PAS.AMS_Adminlogout();
		logger.info("***clicked on logout****");
	}
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
	}
	
	
	

}
