package testCases;

import org.testng.annotations.Test;

import pageObjects.carBooking;
import testBase.BaseClass;

public class TC_01_CabBooking extends BaseClass {
		carBooking cb;
		//Handling Popup
		@Test(priority=2,groups= {"sanity","master"})
		public void Handle_Popup() {
			logger.info("_________Cab Booking TestCase Started__________");
			cb = new carBooking(driver);
			cb.Handle_Popup();
			logger.info("Popup Handled");
		}
		//Clicking on cab Button
		@Test(priority=3,groups= {"sanity","master"})
		public void cabButton() {
			
			cb.cabs();
			logger.info("Clicked on Cab Button");
		}
		//selecting From city
		@Test(priority=4,groups= {"regression","master"})
		public void txt_From() throws InterruptedException {
			cb.Fromcity();
			logger.info("selected From city");
		}
		//selecting  To city
		@Test(priority=5,groups= {"regression","master"})
		public void txt_To() throws InterruptedException {
			cb.Tocity();
			logger.info("selected To city");
		}
		//selecting  date
		@Test(priority=6,groups= {"regression","master"})
		public void Date() {
			cb.selectdate();
			logger.info("selected date");
		}
		//Selecting Time
		@Test(priority=7,groups= {"regression","master"})
		public void time() {
			cb.Time();
			logger.info("selected Time");
		}
		//search button
		@Test(priority=8,groups= {"sanity","master"})
		public void search() {
			cb.Search();
			logger.info("Clicked search button");
		}
		//suv select
		@Test(priority=9,groups= {"regression","master"})
		public void SUV() {
			cb.SUV();
			logger.info("selected suv");
		}
		//Printing Name and price of vehicle with lowest price
		@Test(priority=10,groups= {"regression","master"})
		public void Printing_Lowest_price() {
			cb.Printvalue();
			System.out.println("Car name with lowest price"+"\n"+cb.Name+"\n"+cb.Price);
			logger.info("Printed Name and price of vehicle with lowest price");
		}

	
}
