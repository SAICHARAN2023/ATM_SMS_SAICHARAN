package AMS_GENERIC_LIBRARY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AMS_DPEXCEL {

	
	/*public Object[][] readMultipleData(String sheets) throws IOException 
	{
		FileInputStream fis = new FileInputStream(".\\TestData\\ALoginData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(sheets);
		int lastRow = sheet.getLastRowNum();
		DataFormatter formatter = new DataFormatter();
		int lastcell = sheet.getRow(0).getLastCellNum();
		                              
		Object[][] data =formatter.formatCellValue(new Object[lastRow][lastcell]);
				
				new Object[lastRow][lastcell];
		
		for(int i=0;i<lastRow;i++)
		{
			for(int j=0;j<lastcell;j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
			}
			
		}
		workbook.close();
		return data;
		
		*/
	
	
	public String[][] readMultipleData(String sheet) throws IOException
	{
		//String path=".\\TestData\\ALoginData.xlsx";//taking xl file from testData
	
		
		ExcelLibrary xlutil=new ExcelLibrary(".\\TestData\\ALoginData.xlsx");//creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount(sheet);	
		int totalcols=xlutil.getCellCount(sheet,1);
				
		String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				logindata[i-1][j]= xlutil.getCellData(sheet,i, j);  //1,0
			}
		}
	return logindata;//returning two dimension array
				
	}
	}

