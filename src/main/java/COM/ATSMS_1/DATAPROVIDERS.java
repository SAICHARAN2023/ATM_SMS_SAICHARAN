package COM.ATSMS_1;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DATAPROVIDERS {

	public static void main(String[] args) throws IOException {
		FileInputStream FIS=new FileInputStream("./TestData/LoginData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(FIS);
		XSSFSheet sh=wb.getSheet("A1_ATSMS");
		int rowcount= sh.getLastRowNum();
		int cellcount=sh.getRow(1).getLastCellNum();
		
		for(int i=0;i<rowcount;i++) {
			XSSFRow curentrow=sh.getRow(i);
			
			for(int j=0;j<cellcount;j++) {
				String value=curentrow.getCell(j).toString();
				System.out.println(value);
				
				
			}
		}
		
		wb.close();
		FIS.close();
		System.out.println("done");

	}

}


/*/*Set<String> s=testdata.keySet();
			Iterator<String> itr=s.iterator();
			while(itr.hasNext()) {
				String key1=itr.next();
				
			}
		    String S1=testdata.get(key);
		    System.out.println(S1);
		   //System.out.println(S1.charAt(1));
		    //String data=.get(admin);
		 //  keywords.entertext("xpath",data);
			*/
