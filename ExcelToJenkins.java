package Basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelToJenkins {

	@Test 
	public void excel() throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Jenkins.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		

		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(0);
		Cell cl = rw.getCell(1); 
		String data = cl.getStringCellValue();
		System.out.println(data);
		
		Row rw1 = sh.getRow(1);
		Cell cl1 = rw1.getCell(1);
		String data1 = cl1.getStringCellValue();
		System.out.println(data1);
		
		Row rw2 = sh.getRow(2);
		Cell cl2 = rw2.getCell(1);  
		String data2 = cl2.getStringCellValue();
		System.out.println(data2);
		
		Row rw3 = sh.getRow(3);
		Cell cl3 = rw3.getCell(1); 
		String data3 = cl3.getStringCellValue();
		System.out.println(data3);

	}

}
