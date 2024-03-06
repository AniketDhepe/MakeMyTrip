package pageObjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class weddingCard extends basePage{
	
	public weddingCard(WebDriver driver) {
		super(driver);
		
	}
		//Locators
		//Clicking on wedding cards
		@FindBy(xpath="(//img[@alt='giftcard'])[1]")
		WebElement btnWeddingCard;
		
		//Clicking on Email
		@FindBy(xpath="//li[@data-cy='DeliveryModes_444'][2]")
		WebElement btnEmail;
		
		//Sending Email value
		@FindBy(xpath="//input[@name='emailId']")
		WebElement txtEmail;
		
		//Clicking on Buy 
		@FindBy(xpath="//button[normalize-space()='BUY NOW']")
		WebElement btnBuy;
		
		//Error Message
		@FindBy(xpath="(//p[@class='red-text font11 append-top5'])[3]") 
		WebElement Error;
		
		//Clicking on Hotel
		@FindBy(xpath="(//a[@class='headerIcons makeFlex hrtlCenter column'])[2]")
		WebElement btnHotel;
		
		//Actions Class
		
		//SCROLL TO CLICK ON CARD		
		public void WeddingCard() {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", btnWeddingCard);
			btnWeddingCard.click();
		}
		// Clicking on Email butoon

		public void Emailbutton() throws InterruptedException	{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", btnEmail);
			Thread.sleep(2000);
			btnEmail.click();
		}

		//send wrong email
		public void SendEmail() {
			txtEmail.sendKeys("QEA@Cognizant");
		}
		//click on buy button	
		public void Buybutton() {
			btnBuy.click();
		}
		//Get Error message
		public void error() throws InterruptedException {
		String emailerror =Error.getText();
		System.out.println("Error Message Displayed is:"+"\n"+emailerror);
		Thread.sleep(2000);
		}
		//  click on Hotels
		public void hotels() throws InterruptedException {
		driver.navigate().back();		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",btnHotel );
		Thread.sleep(2000);
		btnHotel.click();
		}
}
