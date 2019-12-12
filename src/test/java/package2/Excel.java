package package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
	
	@Test
	
	public void Excel() throws IOException{
		
		File f=new File("D:\\ExcelRead\\ReadExcel.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sh=wb.getSheet("sheet1");
		for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
			Row r=sh.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell c=r.getCell(j);
				
				if(c.getCellType()==1) {
					System.out.println(c.getStringCellValue());
				}
				
				else if(c.getCellType()==0) {
					
					System.out.println(c.getNumericCellValue());
				}
			}
		}
		
	}
	

}
