package pageObjects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class carBooking extends basePage{
		
		public carBooking(WebDriver driver) {
			super(driver);
			
		}
			//Locators
			
			//FrameID
			@FindBy (id="webklipper-publisher-widget-container-notification-frame") 
			WebElement FrameID;
			
			//Cross Click on popup
			@FindBy (id="webklipper-publisher-widget-container-notification-close-div")
			WebElement locCross;
			
			//Cab Button
			@FindBy (xpath="//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Cabs']")
			WebElement btnCab;
			
			//click on From
			@FindBy (xpath="//input[@id='fromCity']")
			WebElement btnFrom;
			
			//click on Delhi
			@FindBy (xpath="//li[@data-suggestion-index='1']") 
			WebElement btnDelhi;
			
			//Sending value to To Text
			@FindBy (xpath="//input[@placeholder='To']")
			public WebElement txtTo;
			
			//Selecting Manali
			@FindBy (xpath="//li[@id='react-autowhatever-1-section-0-item-0']") 
			public WebElement btnManali;
			
			//Selecting Date
			@FindBy(xpath="//div[@aria-label='Mon Mar 18 2024']")
			WebElement btnDate;
			
			//Selecting Time
			@FindBy(xpath="//span[@class='applyBtnText']")
			WebElement btnTime;
			
			//Clicking on Search
			@FindBy (xpath="//a[normalize-space()='Search']") 
			WebElement btnSearch;
			
			//clicking on SUV
			@FindBy(xpath="//label[normalize-space()='SUV']") 
			WebElement btnSUV;
			
			//Printing Name of vehicle with lowest price
			@FindBy(xpath="(//span[@class='latoBlack font20 appendRight5'])[1]")
			WebElement carName;
			
			//Printing lowest price of vehicle
			@FindBy(xpath="(//div[@class='makeFlex rowReverse alignEnd appendBottom5']//p)[1]") 
			WebElement carPrice;
			
			//Clicking on More
			@FindBy(xpath="//li[@class='menu_More moreItem']")
			WebElement btnMore;
			
			//Clicking on GiftCards
			@FindBy(xpath="//a[normalize-space()='Giftcards']")
			WebElement btnGiftCards;
			
			//Actions Class
			
			//Handling popUp
			 public  void Handle_Popup(){
				try {
						driver.switchTo().frame(FrameID);
						locCross.click();
				  	}
				catch(Exception e) {}
				}

			 //selecting cabs
			public void cabs(){
				btnCab.click();
			}

			//selecting From city	
			public void Fromcity(){
				btnFrom.click();
				btnDelhi.click();
			}
			//selecting  To city
			public void Tocity() throws InterruptedException{
				txtTo.click();
				txtTo.sendKeys("Manali");
				Thread.sleep(5000);
				btnManali.click();		
			}

			//selecting  date		
			public void selectdate(){
				btnDate.click();
			}
		    //Selecting Time
			public void Time(){
				btnTime.click();
			}
			//search button		
			public void Search(){
				btnSearch.click();
			}

			//suv select	
			public void SUV(){
				btnSUV.click();
			}
			
			//Printing Name and price of vehicle with lowest price
			public static String Name;
			public static String Price;
			
			public void Printvalue() {
				 Name = carName.getText();
				 Price=carPrice.getText();
				
			}
			
			//Clicking on GiftCards
			public void GiftCard() {
				btnMore.click();
				btnGiftCards.click();
			}
	}

	
