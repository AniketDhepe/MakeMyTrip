package testCases;

import org.testng.annotations.Test;

import pageObjects.carBooking;
import pageObjects.weddingCard;
import testBase.BaseClass;

public class TC_02_weddingCard extends BaseClass {
	weddingCard wc;
	carBooking cb;
	//Clicking on GiftCards
		@Test(priority=11,groups= {"sanity"})
		public void Gift_cards() {
			logger.info("_________Wedding Card TestCase Started__________");
			cb = new carBooking(driver);
			cb.GiftCard();
			logger.info("Clicked on GiftCards");
		}
		//Clicking on wedding card
		@Test(priority=12,groups= {"regression","master"})
		public void Wedding_Card() {
			wc=new weddingCard(driver);
			wc.WeddingCard();
			logger.info("Clicked on wedding card");
		}	
			
		//Clicking on Email Button
		@Test(priority=13,groups= {"regression","master"})
		public void Emailbutton() throws InterruptedException	{
			wc.Emailbutton();
			logger.info("Clicked on Email Button");
		}

		//send wrong email
		@Test(priority=14,groups= {"regression","master"})
		public void SendEmail() {
			wc.SendEmail();
			logger.info("send wrong email");
		}
		//click on buy button	
		@Test(priority=15,groups= {"regression","master"})		
		public void BuyButton() {
			wc.Buybutton();
			logger.info("clicked on buy button	");
		}
		//Get Error message
		@Test(priority=16,groups= {"regression","master"})	
		public void error() throws InterruptedException {
			wc.error();
			logger.info("Got Error message");
		}
}
