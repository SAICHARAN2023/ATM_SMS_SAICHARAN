package AMS_TESTSUITS;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import AMS_PAGEOBJECTS.POR_MANAGENTRY;

public class ADMIN_EDV extends TEST_BASEPAGE {
	@Test
	public void EDV() throws InterruptedException{
	 POR_MANAGENTRY ENT=new POR_MANAGENTRY(driver);
	
	ENT.AMS_ManageEntry01();
	logger.info("***clicked on manage entry autotaxi****");
	ENT.AMS_ALL();
	logger.info("***clicked on all****");
	
	/*while(true) {
		try {
		
	ENT.AMS_ALLDELETE();
	logger.info("***clicked on delete****");
	

	
	}catch(Exception e) {
		e.getMessage();
	}*/
	}
	
}
	
	
}
