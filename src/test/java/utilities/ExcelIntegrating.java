package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import pageObjects.Hotels;
import pageObjects.carBooking;
import testBase.BaseClass;

public class ExcelIntegrating extends BaseClass {
	// Printing in Excel Using Apache poi
			
			public void ExcelPrinting() {
				
				carBooking cb = new carBooking(driver);
				Hotels ht = new Hotels(driver);
				
				String filePath = System.getProperty("user.dir")+"\\Result\\Output.xlsx";
						try
						{
							FileOutputStream file =new FileOutputStream(filePath);
							XSSFWorkbook workbook=new XSSFWorkbook();
							XSSFSheet sheet=workbook.createSheet("Cab Booking");
							XSSFRow headerRow=sheet.createRow(0);
							headerRow.createCell(0).setCellValue("Car Name");
							headerRow.createCell(1).setCellValue("Car Price");
							
							 headerRow=sheet.createRow(1);
							 headerRow.createCell(0).setCellValue(cb.Name);
							 headerRow.createCell(1).setCellValue(cb.Price);
							
							
							int rowCount=3;
							//int dataSize=40;
							for(WebElement numb : ht.noOfAdults) {
								XSSFRow row = sheet.createRow(rowCount);
								XSSFCell Number= row.createCell(0);
								Number.setCellValue(numb.getText());
								rowCount++;
							}
							workbook.write(file);
							System.out.println("Printed Succesfully in Excel");
							workbook.close();
							file.close();
					
					}
						catch (IOException e)
						{
							e.printStackTrace();
							}
						}
}
