package AMS_TESTSUITS;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AMS_PAGEOBJECTS.POR_AUTOTAXI_ENTRY;

public class ADMIN_DASHBOARD extends TEST_BASEPAGE{

	@Test(dataProvider="ATSMS_DB_ATENTRY")
	public void  Test_Dashboard(String vehicle,String drivername,String driverphno,String driverlicence,String driverregino) throws InterruptedException {
		POR_AUTOTAXI_ENTRY PATE=new POR_AUTOTAXI_ENTRY(driver);
		//logger.info("staring the dashboard");
		Thread.sleep(1000);
		PATE.AMS_Dashboard();
		logger.info("***clicked on dashboard****");
		//logger.info("clicked the dashboard");
		Thread.sleep(1000);
		PATE.AMS_NewATEntry();
		logger.info("***clicked on autotaxi****");
		Thread.sleep(2000);
		//logger.info("clicked the ATENTRY");
		
		PATE.AMS_Vehicletype(vehicle);
		logger.info("***entered on vehtype****");
		PATE.AMS_Drivername(drivername);
		logger.info("***entered  on drivername****");
		PATE.AMS_Mobileno(driverphno);
		logger.info("***entered  on driverphno****");
		PATE.AMS_Licensenumber(driverlicence);
		logger.info("***entered  on licenceno****");
		PATE.AMS_Registerno(driverregino);
		logger.info("***entered  on regno****");
		PATE.AMS_AddRegister();
		logger.info("***entered  on adduser****");
	}
	
	
	@DataProvider(name="ATSMS_DB_ATENTRY")
	public Object[][] ProviderData() throws IOException{
		
		Object[][] data = ALib.readMultipleData("Sheet3");
		return data;
		
	}
}
