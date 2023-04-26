package COM.ATSMS_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashMap_001 {

	public static void main(String[] args) throws IOException {
		FileInputStream Fis=new FileInputStream(".\\TestData\\ALoginData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(Fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int row=sheet.getLastRowNum();
		HashMap<String,String> data=new HashMap<String,String>();
		for(int r=0;r<row;r++) {
		String key=sheet.getRow(r).getCell(0).getStringCellValue();
		String value=sheet.getRow(r).getCell(1).getStringCellValue();
		data.put(key, value);
		}
		

	}

}
