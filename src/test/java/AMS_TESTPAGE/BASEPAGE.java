package AMS_TESTPAGE;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import AMS_GENERIC_LIBRARY.AMSDP_HASHMAPUTIL;
import AMS_GENERIC_LIBRARY.WEBDRIVER_LIBRARY_ATMS;

public class BASEPAGE {
	
	
	//CREATE CONSTRUCTOR
	public  WebDriver driver;
	
	public BASEPAGE(WebDriver driver) {
		  this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public static  AMSDP_HASHMAPUTIL HLib=new AMSDP_HASHMAPUTIL();
	public WEBDRIVER_LIBRARY_ATMS wLib=new WEBDRIVER_LIBRARY_ATMS();
	
	
}
