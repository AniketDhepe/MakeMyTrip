package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hotels extends basePage{
	
	public Hotels(WebDriver driver) {
		super(driver);
		
	}
	//Locators
	
	//Clicking on Rooms and Guest
		@FindBy(xpath="//input[@id='guest']")
		WebElement btnGuest;
		
		//clicking on Adults
		@FindBy(xpath="(//div[@class='gstSlct'])[2]")
		WebElement btnAdults;
		
		//Storing number of Adults
		@FindBy(xpath="//li[@data-cy='GuestSelect$$_323']")
		public List<WebElement> noOfAdults;
		
	//Actions Class
		
		//click on guest

		public void Guest() {
			btnGuest.click();
		}

		//click on adults
		public List<WebElement> adults() {
			btnAdults.click();
			return noOfAdults;

		}
}
