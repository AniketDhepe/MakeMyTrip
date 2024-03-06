package testCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjects.Hotels;
import pageObjects.weddingCard;
import testBase.BaseClass;
import utilities.ExcelIntegrating;

public class TC_03_Hotels extends BaseClass {
	weddingCard wc;
	Hotels ht;
	//click on Hotels
		@Test(priority=17,groups= {"sanity"})
		public void hotels() throws InterruptedException {
			logger.info("_________Hotels TestCase Started__________");
			wc=new weddingCard(driver);
			wc.hotels();
			logger.info("clicked on Hotels");
		}
		//click on guest
		@Test(priority=18,groups= {"regression","master"})		
		public void Guest() {
			ht= new Hotels(driver);
			ht.Guest();
			logger.info("clicked on guest");
		}
		//click on adults
		@Test(priority=19,groups= {"regression","master"})	
		public void adults() {
			ht.adults();
			for(WebElement num :ht.noOfAdults) {
				System.out.println(num.getText());		
				}
			logger.info("clicked on adults");
		}
		//Printing in Excel
		@Test(priority=20,groups= {"sanity","regression","master"})	
		public void ExcelIntegration() {
			ExcelIntegrating Ex = new ExcelIntegrating();
			Ex.ExcelPrinting();
			logger.info("Printed in Excel");
		}
		//close the browser
		@AfterClass	
		public void quit() {
			driver.quit();
			logger.info("Project is Succesfully Done");
}
}
