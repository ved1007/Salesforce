package stepDefinitions2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codoid.products.fillo.Select;
import com.excel.test.utility.Xls_Reader;
import com.qa.util.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.OpportunitesPage;

public class OpportunitiesStepDef {

	WebDriver driver;

	Xls_Reader reader = new Xls_Reader(
			"/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/SampleData/ExcelTestData.xlsx");

	String WorksheetID = reader.getCellData("Sheet2Opportunities", "WorksheetID", 2);
	String PromoMessage = reader.getCellData("Sheet2Opportunities", "PromoMessage", 2);
	String OpportunityName = reader.getCellData("Sheet2Opportunities", "OpportunityName", 2);
	String Amount = reader.getCellData("Sheet2Opportunities", "Amount", 2);
	String Nickname = reader.getCellData("Sheet2Opportunities", "Nickname", 2);
	String Probability = reader.getCellData("Sheet2Opportunities", "Probability", 2);
	String OpportunitySellingOwnerName = reader.getCellData("Sheet2Opportunities", "OpportunitySellingOwnerName", 2);
	String DroppedDealership = reader.getCellData("Sheet2Opportunities", "DroppedDealership", 2);
	String IDSCustomerNum = reader.getCellData("Sheet2Opportunities", "IDSCustomerNum", 2);
	String IDSFIQuoteNum = reader.getCellData("Sheet2Opportunities", "IDSFIQuoteNum", 2);
	String Country = reader.getCellData("Sheet2Opportunities", "Country", 2);
	String WriteUpAmount = reader.getCellData("Sheet2Opportunities", "WriteUpAmount", 2);
	String GeniusNotes1 = reader.getCellData("Sheet2Opportunities", "GeniusNotes1", 2);
	String Notes2MeetAndGreet = reader.getCellData("Sheet2Opportunities", "Notes2MeetAndGreet", 2);
	String GeniusNotes3TradeNotes = reader.getCellData("Sheet2Opportunities", "GeniusNotes3TradeNotes", 2);
	String SlideOuts = reader.getCellData("Sheet2Opportunities", "SlideOuts", 2);
	String NumSleeps = reader.getCellData("Sheet2Opportunities", "NumSleeps", 2);
	String InterestedType = reader.getCellData("Sheet2Opportunities", "InterestedType", 2);
	String InteriorColor = reader.getCellData("Sheet2Opportunities", "InteriorColor", 2);
	String IntrestedCategory = reader.getCellData("Sheet2Opportunities", "IntrestedCategory", 2);
	String ExteriorColor = reader.getCellData("Sheet2Opportunities", "ExteriorColor", 2);
	String InterestedYear = reader.getCellData("Sheet2Opportunities", "InterestedYear", 2);
	String Mileage = reader.getCellData("Sheet2Opportunities", "Mileage", 2);
	String InterestedMake = reader.getCellData("Sheet2Opportunities", "InterestedMake", 2);
	String Doors = reader.getCellData("Sheet2Opportunities", "Doors", 2);
	String IntrestedModel = reader.getCellData("Sheet2Opportunities", "IntrestedModel", 2);
	String VehicleOptions = reader.getCellData("Sheet2Opportunities", "VehicleOptions", 2);
	String IntrestedProduct = reader.getCellData("Sheet2Opportunities", "IntrestedProduct", 2);
	String InterestedLevel = reader.getCellData("Sheet2Opportunities", "InterestedLevel", 2);
	String VehicleTrim = reader.getCellData("Sheet2Opportunities", "VehicleTrim", 2);
	String BuyingHorizon = reader.getCellData("Sheet2Opportunities", "BuyingHorizon", 2);
	String VehicleEngine = reader.getCellData("Sheet2Opportunities", "VehicleEngine", 2);
	String PaymentDetails = reader.getCellData("Sheet2Opportunities", "PaymentDetails", 2);
	String Transmission = reader.getCellData("Sheet2Opportunities", "Transmission", 2);
	String VehiclePricing = reader.getCellData("Sheet2Opportunities", "VehiclePricing", 2);
	String InterestedStock = reader.getCellData("Sheet2Opportunities", "InterestedStock", 2);
	String VehicleComments = reader.getCellData("Sheet2Opportunities", "VehicleComments", 2);
	String IntrestedID = reader.getCellData("Sheet2Opportunities", "IntrestedID", 2);
	String webpage = reader.getCellData("Sheet2Opportunities", "webpage", 2);
	String TowVehicleYear = reader.getCellData("Sheet2Opportunities", "TowVehicleYear", 2);
	String MaxTowingCapacity = reader.getCellData("Sheet2Opportunities", "MaxTowingCapacity", 2);
	String TowVehicleMake = reader.getCellData("Sheet2Opportunities", "TowVehicleMake", 2);
	String TowVehicleModel = reader.getCellData("Sheet2Opportunities", "TowVehicleModel", 2);
	String TowVehicleVIN = reader.getCellData("Sheet2Opportunities", "TowVehicleVIN", 2);
	String TowVehicleTrim = reader.getCellData("Sheet2Opportunities", "TowVehicleTrim", 2);
	String TowVehicleStyle = reader.getCellData("Sheet2Opportunities", "TowVehicleStyle", 2);
	String CurrentOwnerCategory = reader.getCellData("Sheet2Opportunities", "CurrentOwnerCategory", 2);
	String CurrentOwnedMileage = reader.getCellData("Sheet2Opportunities", "CurrentOwnedMileage", 2);
	String CurrentOwnedYear = reader.getCellData("Sheet2Opportunities", "CurrentOwnedYear", 2);
	String CurrentOwnedPayoff = reader.getCellData("Sheet2Opportunities", "CurrentOwnedPayoff", 2);
	String CurrentOwnedMake = reader.getCellData("Sheet2Opportunities", "CurrentOwnedMake", 2);
	String CurrentOwnedQuoteLow = reader.getCellData("Sheet2Opportunities", "CurrentOwnedQuoteLow", 2);
	String CurrentOwnedProduct = reader.getCellData("Sheet2Opportunities", "CurrentOwnedProduct", 2);
	String CurrentOwnedQuoteHigh = reader.getCellData("Sheet2Opportunities", "CurrentOwnedQuoteHigh", 2);
	String CurrentOwnedModel = reader.getCellData("Sheet2Opportunities", "CurrentOwnedModel", 2);
	String CurrentOwnedQuoteDetails = reader.getCellData("Sheet2Opportunities", "CurrentOwnedQuoteDetails", 2);
	String CurrentOwnedTrim = reader.getCellData("Sheet2Opportunities", "CurrentOwnedTrim", 2);
	String CurrentOwnedComments = reader.getCellData("Sheet2Opportunities", "CurrentOwnedComments", 2);
	String CurrentOwnedLength = reader.getCellData("Sheet2Opportunities", "CurrentOwnedLength", 2);
	String CurrentOwnedCondition = reader.getCellData("Sheet2Opportunities", "CurrentOwnedCondition", 2);
	String CurrentOwnedEngine = reader.getCellData("Sheet2Opportunities", "CurrentOwnedEngine", 2);
	String CurrentOwnedID = reader.getCellData("Sheet2Opportunities", "CurrentOwnedID", 2);
	String CurrentOwnedOptions = reader.getCellData("Sheet2Opportunities", "CurrentOwnedOptions", 2);
	String LeadPhone = reader.getCellData("Sheet2Opportunities", "LeadPhone", 2);
	String LeadEmail = reader.getCellData("Sheet2Opportunities", "LeadEmail", 2);
	String LeadMobilePhone = reader.getCellData("Sheet2Opportunities", "LeadScore", 2);
	String LeadScore = reader.getCellData("Sheet2Opportunities", "Mileage", 2);
	String LeadOtherPhone = reader.getCellData("Sheet2Opportunities", "LeadOtherPhone", 2);
	String LeadWorkPhone = reader.getCellData("Sheet2Opportunities", "LeadWorkPhone", 2);
	String LeadMessage = reader.getCellData("Sheet2Opportunities", "LeadMessage", 2);
	String EndViditNotes = reader.getCellData("Sheet2Opportunities", "EndViditNotes", 2);
	String Source = reader.getCellData("Sheet2Opportunities", "Source", 2);
	String FormName = reader.getCellData("Sheet2Opportunities", "FormName", 2);
	String TrackingMedium = reader.getCellData("Sheet2Opportunities", "TrackingMedium", 2);
	String TrackingSCPC = reader.getCellData("Sheet2Opportunities", "TrackingSCPC", 2);
	String WebLeadSourceName = reader.getCellData("Sheet2Opportunities", "WebLeadSourceName", 2);
	String Discription = reader.getCellData("Sheet2Opportunities", "Discription", 2);
	String PrimaryEmail = reader.getCellData("Sheet2Opportunities", "PrimaryEmail", 2);
	String PrimaryPhone = reader.getCellData("Sheet2Opportunities", "PrimaryPhone", 2);
	String LeadIPAddress = reader.getCellData("Sheet2Opportunities", "LeadIPAddress", 2);
	String LeadSystemData = reader.getCellData("Sheet2Opportunities", "LeadSystemData", 2);
	String TrackingID = reader.getCellData("Sheet2Opportunities", "TrackingID", 2);
	String TrackingLandingPageURL = reader.getCellData("Sheet2Opportunities", "TrackingLandingPageURL", 2);
	String TrackingReferralURL = reader.getCellData("Sheet2Opportunities", "TrackingReferralURL", 2);
	String TrackingPromoCode = reader.getCellData("Sheet2Opportunities", "TrackingPromoCode", 2);
	String NextStep = reader.getCellData("Sheet2Opportunities", "NextStep", 2);
	String TrackingCampaign = reader.getCellData("Sheet2Opportunities", "TrackingCampaign", 2);
	String TrackingSource = reader.getCellData("Sheet2Opportunities", "TrackingSource", 2);
	String TrackingContent = reader.getCellData("Sheet2Opportunities", "TrackingContent", 2);
	String TrackingKeywords = reader.getCellData("Sheet2Opportunities", "TrackingKeywords", 2);
	String BackendGP = reader.getCellData("Sheet2Opportunities", "BackendGP", 2);
	String ADCampaign = reader.getCellData("Sheet2Opportunities", "ADCampaign", 2);
	String ADGroup = reader.getCellData("Sheet2Opportunities", "ADGroup", 2);
	String ADKeyword = reader.getCellData("Sheet2Opportunities", "ADKeyword", 2);
	String ADSlot = reader.getCellData("Sheet2Opportunities", "ADSlot", 2);
	String ADSlotPosition = reader.getCellData("Sheet2Opportunities", "ADSlotPosition", 2);
	String ADContent = reader.getCellData("Sheet2Opportunities", "ADContent", 2);


	
	
	@Given("^Open the Salesforce Website$")
	public void open_the_Salesforce_Website() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://rv--test.cs26.my.salesforce.com/");
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

	@When("^verify the Salesforce page title$")
	public void verify_the_Salesforce_page_title() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Login | Salesforce", title);

	}

	@Then("^Login with valid username and password \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_with_valid_username_and_password_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);

	}

	@Then("^Click login button$")
	public void click_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']")).click();

	}

	@Then("^Verify Salesforce Home page title$")
	public void verify_Salesforce_Home_page_title() throws Throwable {
		String HomepageTitle = driver.getTitle();
		System.out.println(HomepageTitle);
		Assert.assertEquals("Lightning Experience", HomepageTitle);
		Thread.sleep(4000);
		driver.navigate().refresh();

	}

	@Then("^Click on the Opportunities tab$")
	public void click_on_the_Opportunities_tab() throws Throwable {
		WebElement element = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(3000);

	}

	@Then("^Click on the New button$")
	public void click_on_the_New_button() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement newButton = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"brandBand_1\"]/div/div/div/div/div[1]/div[1]/div[2]/ul/li/a")));
		newButton.click();

	}

	@Then("^Select a record type and click Next$")
	public void select_a_record_type_and_click_Next() throws Throwable {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement nextButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]")));
		nextButton.click();
		driver.navigate().refresh();
		Thread.sleep(5000);

	}

	@Then("^Populate System Admin Layout fields$")
	public void populate_System_Admin_Layout_fields() throws Exception {

		// Worksheet ID field
		driver.findElement(By.cssSelector("*[id^='57:'][id$='a']")).sendKeys(WorksheetID);

		// Date and Time
		driver.findElement(By.cssSelector("*[id^='11:'][id$='a']")).click();
		List<WebElement> ExpirationDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node = ExpirationDate.size();
		for (int i = 0; i < total_node; i++) {
			String date = ExpirationDate.get(i).getText();
			if (date.equals("25")) {
				ExpirationDate.get(i).click();
				break;
			}

		}

		// Promo Message
		driver.findElement(By.cssSelector("*[id^='77:'][id$='a']")).sendKeys(PromoMessage);

		// Expiration Date
		driver.findElement(By.cssSelector("*[id^='121:'][id$='a']")).click();
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node2 = dates.size();
		for (int i = 0; i < total_node2; i++) {
			String date = dates.get(i).getText();
			if (date.equals("24")) {
				dates.get(i).click();
				break;
			}
		}

		// eLead Cheat checkbox
		driver.findElement(By.cssSelector("*[id^='172:'][id$='a']")).click();

	}

	@Then("^Opportunity Information$")
	public void Opportunity_Information() throws Throwable {

		// Opportunities Name field
		driver.findElement(By.cssSelector("*[id^='217:'][id$='a']")).sendKeys(OpportunityName);

		// Account Name field
		driver.findElement(By.cssSelector("*[id^='302:'][id$='a']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Automation1')]")).click();

		// Amount field
		driver.findElement(By.cssSelector("*[id^='233:'][id$='a']")).sendKeys(Amount);

		// Close Date
		driver.findElement(By.cssSelector("*[id^='378:'][id$='a']")).click();
		List<WebElement> closeDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node = closeDate.size();
		for (int i = 0; i < total_node; i++) {
			String date = closeDate.get(i).getText();
			if (date.equals("25")) {
				closeDate.get(i).click();
				break;
			}
		}

		// Stage field
		driver.findElement(By.xpath("//a[@class='select']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'In-Process')]")).click();

		// Nick Name field
		driver.findElement(By.cssSelector("*[id^='558:'][id$='a']")).sendKeys(Nickname);

		// Reason dropdown field

		// Probability % field
		driver.findElement(By.cssSelector("*[id^='676:'][id$='a']")).sendKeys(Probability);

		// Opportunity Selling Owner Name field
		driver.findElement(By.cssSelector("*[id^='708:'][id$='a']")).sendKeys(OpportunitySellingOwnerName);

		// Dropped Dealership field
		driver.findElement(By.cssSelector("*[id^='724:'][id$='a']")).sendKeys(DroppedDealership);

		// IDS Customer# field
		driver.findElement(By.cssSelector("*[id^='754:'][id$='a']")).sendKeys(IDSCustomerNum);

		// IDS FI Quote # field
		driver.findElement(By.cssSelector("*[id^='798:'][id$='a']")).sendKeys(IDSFIQuoteNum);

		// Review Requested Date field
		driver.findElement(By.cssSelector("*[id^='824:'][id$='a']")).click();
		List<WebElement> reviewRequestedDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node2 = reviewRequestedDate.size();
		for (int i = 0; i < total_node2; i++) {
			String date = reviewRequestedDate.get(i).getText();
			if (date.equals("25")) {
				reviewRequestedDate.get(i).click();
				break;
			}
		}

		// First Survey Attempt Date field
		driver.findElement(By.cssSelector("*[id^='865:'][id$='a']")).click();
		List<WebElement> firstSurveyAttemptDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node3 = firstSurveyAttemptDate.size();
		for (int i = 0; i < total_node3; i++) {
			String date = firstSurveyAttemptDate.get(i).getText();
			if (date.equals("25")) {
				firstSurveyAttemptDate.get(i).click();
				break;
			}
		}

		// Write-Up Amount field
		driver.findElement(By.cssSelector("*[id^='902:'][id$='a']")).sendKeys(WriteUpAmount);

		// County field
		driver.findElement(By.cssSelector("*[id^='940:'][id$='a']")).sendKeys(Country);

		// Customer appointment Date and Time
		driver.findElement(By.cssSelector("*[id^='1112:'][id$='a']")).click();
		List<WebElement> customerAppointmentDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node4 = customerAppointmentDate.size();
		for (int i = 0; i < total_node4; i++) {
			String date = customerAppointmentDate.get(i).getText();
			if (date.equals("25")) {
				customerAppointmentDate.get(i).click();
				break;
			}
		}

		// Type dropdown field
		driver.findElement(By.cssSelector("*[aria-describedby^='1186:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'New Business')]")).click();

		// Appointment completed Date
		driver.findElement(By.cssSelector("*[id^='1232:'][id$='a']")).click();
		List<WebElement> appointmentCompletedDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node5 = appointmentCompletedDate.size();
		for (int i = 0; i < total_node5; i++) {
			String date = appointmentCompletedDate.get(i).getText();
			if (date.equals("25")) {
				appointmentCompletedDate.get(i).click();
				break;
			}
		}

		// CustomerDelivery Date and Time
		driver.findElement(By.cssSelector("*[id^='1335:'][id$='a']")).click();
		List<WebElement> CustomerDelivery = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node6 = CustomerDelivery.size();
		for (int i = 0; i < total_node6; i++) {
			String date = CustomerDelivery.get(i).getText();
			if (date.equals("25")) {
				CustomerDelivery.get(i).click();
				break;
			}
		}

		// Appointment - Deliverery Set - Contacted - Up Assigned check boxes

		// FirstResponseTime
		driver.findElement(By.cssSelector("*[id^='1523:'][id$='a']")).click();
		List<WebElement> FirstResponseTime = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node7 = FirstResponseTime.size();
		for (int i = 0; i < total_node7; i++) {
			String date = FirstResponseTime.get(i).getText();
			if (date.equals("25")) {
				FirstResponseTime.get(i).click();
				break;
			}
		}

		// PDIPrinted Date and Time
		driver.findElement(By.cssSelector("*[id^='1563:'][id$='a']")).click();
		List<WebElement> PDIPrinted = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node8 = PDIPrinted.size();
		for (int i = 0; i < total_node8; i++) {
			String date = PDIPrinted.get(i).getText();
			if (date.equals("25")) {
				PDIPrinted.get(i).click();
				break;
			}
		}

		// BusinessAdjustedCreatedDate
		driver.findElement(By.cssSelector("*[id^='1633:'][id$='a']")).click();
		List<WebElement> BusinessAdjustedCreatedDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node9 = BusinessAdjustedCreatedDate.size();
		for (int i = 0; i < total_node9; i++) {
			String date = BusinessAdjustedCreatedDate.get(i).getText();
			if (date.equals("25")) {
				BusinessAdjustedCreatedDate.get(i).click();
				break;
			}
		}

		// BusinessAdjustedCreatedDateEnd
		driver.findElement(By.cssSelector("*[id^='1687:'][id$='a']")).click();
		List<WebElement> BusinessAdjustedCreatedDateEnd = driver
				.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node10 = BusinessAdjustedCreatedDateEnd.size();
		for (int i = 0; i < total_node10; i++) {
			String date = BusinessAdjustedCreatedDateEnd.get(i).getText();
			if (date.equals("25")) {
				BusinessAdjustedCreatedDateEnd.get(i).click();
				break;
			}
		}

		// BusinessAdjustedCreatedDateStart
		driver.findElement(By.cssSelector("*[id^='1741:'][id$='a']")).click();
		List<WebElement> BusinessAdjustedCreatedDateStart = driver
				.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node11 = BusinessAdjustedCreatedDateStart.size();
		for (int i = 0; i < total_node11; i++) {
			String date = BusinessAdjustedCreatedDateStart.get(i).getText();
			if (date.equals("25")) {
				BusinessAdjustedCreatedDateStart.get(i).click();
				break;
			}
		}

	}

	@Then("^Interested In Attributes$")
	public void populate_Interested_In_Attributes_fields() {

		// New/Used - Year To
		driver.findElement(By.cssSelector("*[aria-describedby^='1928:'][aria-describedby$='a-label']")).click();
		driver.findElements(By.xpath("//a[@title='New']")).get(1).click();

		// Floorplan Style
		driver.findElement(By.cssSelector("*[aria-describedby^='2654:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='Park Model']")).click();

		// Genius Notes 1 (RV Attributes)
		driver.findElement(By.cssSelector("*[id^='2750:'][id$='a']")).sendKeys(GeniusNotes1);

		// Notes 2 (Meet & Greet)
		driver.findElement(By.cssSelector("*[id^='2798:'][id$='a']")).sendKeys(Notes2MeetAndGreet);

		// Genius Notes 3 (Trade Notes)
		driver.findElement(By.cssSelector("*[id^='2842:'][id$='a']")).sendKeys(GeniusNotes3TradeNotes);

		// # Sleeps
		driver.findElement(By.cssSelector("*[id^='2886:'][id$='a']")).sendKeys(NumSleeps);

		// Year From
		driver.findElement(By.cssSelector("*[aria-describedby^='1878:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='2017']")).click();

		// Year To
		driver.findElement(By.cssSelector("*[aria-describedby^='1974:'][aria-describedby$='a-label']")).click();
		driver.findElements(By.xpath("//a[@title='2017']")).get(1).click();

		// Price From
		driver.findElement(By.cssSelector("*[aria-describedby^='2100:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'6000')]")).click();

		// Price To
		driver.findElement(By.cssSelector("*[aria-describedby^='2226:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'4,000')]")).click();

		// Payment From
		driver.findElement(By.cssSelector("*[aria-describedby^='2352:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='75']")).click();

		// Payment To
		driver.findElement(By.cssSelector("*[aria-describedby^='2478:'][aria-describedby$='a-label']")).click();
		driver.findElements(By.xpath("//a[@title='100']")).get(1).click();

		// Length From
		driver.findElement(By.cssSelector("*[aria-describedby^='2604:'][aria-describedby$='a-label']")).click();
		driver.findElements(By.xpath("//a[@title='6 ft']")).get(0).click();

		// Length To
		driver.findElement(By.cssSelector("*[aria-describedby^='2700:'][aria-describedby$='a-label']")).click();
		driver.findElements(By.xpath("//a[@title='10 ft']")).get(1).click();

		// # Slide Outs
		driver.findElement(By.cssSelector("*[id^='2776:'][id$='a']")).sendKeys(SlideOuts);

	}

	@Then("^Interested In Details$")
	public void Interested_In_Details() {

		// Interested Type
		driver.findElement(By.cssSelector("*[id^='2933:'][id$='a']")).sendKeys(InterestedType);

		// Interior Color
		driver.findElement(By.cssSelector("*[id^='2949:'][id$='a']")).sendKeys(InteriorColor);

		// Interested Category
		driver.findElement(By.cssSelector("*[id^='2969:'][id$='a']")).sendKeys(IntrestedCategory);

		// Exterior Color
		driver.findElement(By.cssSelector("*[id^='2985:'][id$='a']")).sendKeys(ExteriorColor);
		// Interested Year
		driver.findElement(By.cssSelector("*[id^='3005:'][id$='a']")).sendKeys(InterestedYear);
		// # Doors
		driver.findElement(By.cssSelector("*[id^='3021:'][id$='a']")).sendKeys(Doors);
		// Interested Make
		driver.findElement(By.cssSelector("*[id^='3043:'][id$='a']")).sendKeys(InterestedMake);
		// Mileage
		driver.findElement(By.cssSelector("*[id^='3059:'][id$='a']")).sendKeys(Mileage);
		// Interested Model
		driver.findElement(By.cssSelector("*[id^='3081:'][id$='a']")).sendKeys(IntrestedModel);
		// Vehicle Options
		driver.findElement(By.cssSelector("*[id^='3097:'][id$='a']")).sendKeys(VehicleOptions);
		// Interested Product
		driver.findElement(By.cssSelector("*[id^='3117:'][id$='a']")).sendKeys(IntrestedProduct);

		// Interest Level dropdown
		driver.findElement(By.cssSelector("*[aria-describedby^='3133:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='Highly Interested']")).click();

		// Vehicle Trim
		driver.findElement(By.cssSelector("*[id^='3183:'][id$='a']")).sendKeys(VehicleTrim);
		// Buying Horizon
		driver.findElement(By.cssSelector("*[id^='3199:'][id$='a']")).sendKeys(BuyingHorizon);
		// Vehicle Engine
		driver.findElement(By.cssSelector("*[id^='3219:'][id$='a']")).sendKeys(VehicleEngine);

		// Payment Method dropdown
		driver.findElement(By.cssSelector("*[aria-describedby^='3235:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='Finance']")).click();

		// Chassis dropdown
		driver.findElement(By.cssSelector("*[aria-describedby^='3285:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='Chevrolet Express 3500']")).click();

		// Payment Details
		driver.findElement(By.cssSelector("*[id^='3331:'][id$='a']")).sendKeys(PaymentDetails);
		// Transmission
		driver.findElement(By.cssSelector("*[id^='3351:'][id$='a']")).sendKeys(Transmission);

		// Vehicle pricing
		driver.findElement(By.cssSelector("*[id^='3367:'][id$='a']")).sendKeys(VehiclePricing);

		// Interested Stock
		driver.findElement(By.cssSelector("*[id^='3387:'][id$='a']")).sendKeys(InterestedStock);

		// Vehicle Comments
		driver.findElement(By.cssSelector("*[id^='3403:'][id$='a']")).sendKeys(VehicleComments);

		// Interested Id
		driver.findElement(By.cssSelector("*[id^='3423:'][id$='a']")).sendKeys(IntrestedID);

		// Webpage
		driver.findElement(By.cssSelector("*[id^='3439:'][id$='a']")).sendKeys(webpage);

		// Toy Deck drop down
		// Outdoor Kitchen
		// Outdoor Entertainment
		// Check boxes |Meet&Greet|Needs Analysis|Selection|Presentation|Intro to
		// Service|Write Up Stage|T.O to F&I|
		// Previouse Stage drop down

	}

	@Then("^Towing Information$")
	public void Towing_Information() {

		// Tow Vehicle Year
		driver.findElement(By.cssSelector("*[id^='3869:'][id$='a']")).sendKeys(TowVehicleYear);

		// Max Towing Capacity
		driver.findElement(By.cssSelector("*[id^='3887:'][id$='a']")).sendKeys(MaxTowingCapacity);

		// Tow Vehicle Make
		driver.findElement(By.cssSelector("*[id^='3909:'][id$='a']")).sendKeys(TowVehicleMake);

		// Tow Vehicle Model
		driver.findElement(By.cssSelector("*[id^='3943:'][id$='a']")).sendKeys(TowVehicleModel);

		// Tow Vehicle VIN
		driver.findElement(By.cssSelector("*[id^='3959:'][id$='a']")).sendKeys(TowVehicleVIN);

		// Tow Vehicle Trim
		driver.findElement(By.cssSelector("*[id^='3979:'][id$='a']")).sendKeys(TowVehicleTrim);

		// Tow Vehicle Style
		driver.findElement(By.cssSelector("*[id^='4013:'][id$='a']")).sendKeys(TowVehicleStyle);

	}

	@Then("^Currently Own Trade-InCurrently Own TradeIn from Web Lead fields$")
	public void currently_Own_Trade_InCurrently_Own_TradeIn_from_Web_Lead_fields() {

		// Current Owner Category
		driver.findElement(By.cssSelector("*[id^='4058:'][id$='a']")).sendKeys(CurrentOwnerCategory);

		// Current Owned Mileage
		driver.findElement(By.cssSelector("*[id^='4074:'][id$='a']")).sendKeys(CurrentOwnedMileage);

		// Current Owned Year
		driver.findElement(By.cssSelector("*[id^='4096:'][id$='a']")).sendKeys(CurrentOwnedYear);

		// Current Owned Payoff
		driver.findElement(By.cssSelector("*[id^='4112:'][id$='a']")).sendKeys(CurrentOwnedPayoff);

		// Current Owned Make
		driver.findElement(By.cssSelector("*[id^='4134:'][id$='a']")).sendKeys(CurrentOwnedMake);

		// Current Owned Quote Low
		driver.findElement(By.cssSelector("*[id^='4150:'][id$='a']")).sendKeys(CurrentOwnedQuoteLow);

		// Current Owned Product
		driver.findElement(By.cssSelector("*[id^='4172:'][id$='a']")).sendKeys(CurrentOwnedProduct);

		// Current Owned Model
		driver.findElement(By.cssSelector("*[id^='4210:'][id$='a']")).sendKeys(CurrentOwnedModel);

		// Current Owned Quote High
		driver.findElement(By.cssSelector("*[id^='4188:'][id$='a']")).sendKeys(CurrentOwnedQuoteHigh);

		// Current Owned Trim
		driver.findElement(By.cssSelector("*[id^='4246:'][id$='a']")).sendKeys(CurrentOwnedTrim);

		// Current Owned Quote Details
		driver.findElement(By.cssSelector("*[id^='4226:'][id$='a']")).sendKeys(CurrentOwnedQuoteDetails);

		// Current Owned Length
		driver.findElement(By.cssSelector("*[id^='4282:'][id$='a']")).sendKeys(CurrentOwnedLength);

		// Current Owned Comments
		driver.findElement(By.cssSelector("*[id^='4262:'][id$='a']")).sendKeys(CurrentOwnedComments);

		// Current Owned Engine
		driver.findElement(By.cssSelector("*[id^='4318:'][id$='a']")).sendKeys(CurrentOwnedEngine);

		// Current Owned Condition
		driver.findElement(By.cssSelector("*[id^='4298:'][id$='a']")).sendKeys(CurrentOwnedCondition);

		// Current Owned ID
		driver.findElement(By.cssSelector("*[id^='4334:'][id$='a']")).sendKeys(CurrentOwnedID);

		// Current Owned Options
		driver.findElement(By.cssSelector("*[id^='4354:'][id$='a']")).sendKeys(CurrentOwnedOptions);

	}

	@Then("^Pupulate Info from lead fields$")
	public void pupulate_Info_from_lead_fields() {
		// Lead Phone
		driver.findElement(By.cssSelector("*[id^='4399:'][id$='a']")).sendKeys(LeadPhone);

		// Lead Email
		driver.findElement(By.cssSelector("*[id^='4415:'][id$='a']")).sendKeys(LeadEmail);

		// Lead Mobile Phone
		driver.findElement(By.cssSelector("*[id^='4435:'][id$='a']")).sendKeys(LeadMobilePhone);

		// Lead Score
		driver.findElement(By.cssSelector("*[id^='4451:'][id$='a']")).sendKeys(LeadScore);

		// Lead other Phone
		driver.findElement(By.cssSelector("*[id^='4473:'][id$='a']")).sendKeys(LeadOtherPhone);

		// Lead Work Phone
		driver.findElement(By.cssSelector("*[id^='4507:'][id$='a']")).sendKeys(LeadWorkPhone);

		// Lead Message
		driver.findElement(By.cssSelector("*[aria-labelledby^='label-4545:'][aria-labelledby$='a']"))
				.sendKeys(LeadMessage);

		// End Visit Notes
		driver.findElement(By.cssSelector("*[data-aura-rendered-by^='4615:'][data-aura-rendered-by$='a']"))
				.sendKeys(EndViditNotes);

	}

	@Then("^Lead Source$")
	public void Lead_Source() {
		// Source
		driver.findElement(By.cssSelector("*[id^='4652:'][id$='a']")).sendKeys(Source);

		// Lead Source drop down
		driver.findElement(By.cssSelector("*[aria-describedby^='4748:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='Internet']")).click();

		// FormName
		driver.findElement(By.cssSelector("*[id^='4794:'][id$='a']")).sendKeys(FormName);

		// Web Lead Source Detail drop down
		driver.findElement(By.cssSelector("*[aria-describedby^='4814:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='Dealer Website']")).click();

		// Tracking Medium
		driver.findElement(By.cssSelector("*[id^='4860:'][id$='a']")).sendKeys(TrackingMedium);

		// Tracking SCPC
		driver.findElement(By.cssSelector("*[id^='4956:'][id$='a']")).sendKeys(TrackingSCPC);

		// Web Lead Source Name
		driver.findElement(By.cssSelector("*[id^='4976:'][id$='a']")).sendKeys(WebLeadSourceName);

		// Geo Lookup
		// Lead Queue Id
		// Original Location Account
		// Website
		// Location Primary Lead
		// Enterprise Lead
		// eLead Create Date
		driver.findElement(By.cssSelector("*[id^='5430:'][id$='a']")).click();
		List<WebElement> eLeadCreatedDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node = eLeadCreatedDate.size();
		for (int i = 0; i < total_node; i++) {
			String date = eLeadCreatedDate.get(i).getText();
			if (date.equals("27")) {
				eLeadCreatedDate.get(i).click();
				break;
			}

		}

	}

	@Then("^Enter the Description Information$")
	public void enter_the_Description_Information() {
		// Description
		driver.findElement(By.cssSelector("*[id^='5468:'][id$='a']")).sendKeys(Discription);

		// Price drop down
		driver.findElement(By.cssSelector("*[aria-describedby^='5488:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='$15,000 to $30,000']")).click();

	}

	@Then("^Other data fields$")
	public void populate_Other_data_fields() {

		// Primary Email
		driver.findElement(By.cssSelector("*[id^='5863:'][id$='a']")).sendKeys(PrimaryEmail);

		// Primary Phone
		driver.findElement(By.cssSelector("*[id^='5897:'][id$='a']")).sendKeys(PrimaryPhone);

		// Lead Ip Address
		driver.findElement(By.cssSelector("*[id^='5945:'][id$='a']")).sendKeys(LeadIPAddress);

		// Lead System Data
		driver.findElement(By.cssSelector("*[id^='5979:'][id$='a']")).sendKeys(LeadSystemData);

		// Category drop down
		driver.findElement(By.cssSelector("*[aria-describedby^='6049:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='Camping Trailer']")).click();

		// Tracking Id
		driver.findElement(By.cssSelector("*[id^='6138:'][id$='a']")).sendKeys(TrackingID);

		// Tracking LandingPage URL
		driver.findElement(By.cssSelector("*[id^='6174:'][id$='a']")).sendKeys(TrackingLandingPageURL);

		// Tracking Referral URL
		driver.findElement(By.cssSelector("*[id^='6211:'][id$='a']")).sendKeys(TrackingReferralURL);

		// Tracking Promo Code
		driver.findElement(By.cssSelector("*[id^='6248:'][id$='a']")).sendKeys(TrackingPromoCode);

		// Next Step
		driver.findElement(By.cssSelector("*[id^='6264:'][id$='a']")).sendKeys(NextStep);

		// Tracking Campaign
		driver.findElement(By.cssSelector("*[id^='6284:'][id$='a']")).sendKeys(TrackingCampaign);

		// Tracking Source
		driver.findElement(By.cssSelector("*[id^='6318:'][id$='a']")).sendKeys(TrackingSource);

		// Tracking Content
		driver.findElement(By.cssSelector("*[id^='6352:'][id$='a']")).sendKeys(TrackingContent);

		// Tracking Keywords
		driver.findElement(By.cssSelector("*[id^='6448:'][id$='a']")).sendKeys(TrackingKeywords);

		// Backend GP
		driver.findElement(By.cssSelector("*[id^='6496:'][id$='a']")).sendKeys(BackendGP);

		// Ad Campaign
		driver.findElement(By.cssSelector("*[id^='6518:'][id$='a']")).sendKeys(ADCampaign);

		// Ad Group
		driver.findElement(By.cssSelector("*[id^='6552:'][id$='a']")).sendKeys(ADGroup);

		// Ad Keyword
		driver.findElement(By.cssSelector("*[id^='6586:'][id$='a']")).sendKeys(ADKeyword);

		// Ad Slot
		driver.findElement(By.cssSelector("*[id^='6620:'][id$='a']")).sendKeys(ADSlot);

		// Ad Slot Position
		driver.findElement(By.cssSelector("*[id^='6654:'][id$='a']")).sendKeys(ADSlotPosition);

		// Ad Content
		driver.findElement(By.cssSelector("*[id^='6688:'][id$='a']")).sendKeys(ADContent);

		// Forecast Category
		// Manager Assisted | Manager Interaction | Manager Turn Over check boxes

	}

	@Then("^System Information fields$")
	public void System_Information_fields() {

		// LastActivityDate
		driver.findElement(By.cssSelector("*[id^='6733:'][id$='a']")).click();
		List<WebElement> LastActivityDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node12 = LastActivityDate.size();
		for (int i = 0; i < total_node12; i++) {
			String date = LastActivityDate.get(i).getText();
			if (date.equals("27")) {
				LastActivityDate.get(i).click();
				break;
			}
		}
		// Next Activity Date
		driver.findElement(By.cssSelector("*[id^='6780:'][id$='a']")).click();
		List<WebElement> NextActivityDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node13 = NextActivityDate.size();
		for (int i = 0; i < total_node13; i++) {
			String date = NextActivityDate.get(i).getText();
			if (date.equals("27")) {
				NextActivityDate.get(i).click();
				break;
			}
		}

		// LastStageChangeTime Date and Time
		driver.findElement(By.cssSelector("*[id^='6843:'][id$='a']")).click();
		List<WebElement> LastStageChangeTime = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node14 = LastStageChangeTime.size();
		for (int i = 0; i < total_node14; i++) {
			String date = LastStageChangeTime.get(i).getText();
			if (date.equals("27")) {
				LastStageChangeTime.get(i).click();
				break;
			}
		}

		// Last Sales Activity Date Time
		driver.findElement(By.cssSelector("*[id^='6803:'][id$='a']")).click();
		List<WebElement> LastSalesActivityDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node15 = LastSalesActivityDate.size();
		for (int i = 0; i < total_node15; i++) {
			String date = LastSalesActivityDate.get(i).getText();
			if (date.equals("27")) {
				LastSalesActivityDate.get(i).click();
				break;
			}
		}

		// Last Lead Conversion Date Time
		driver.findElement(By.cssSelector("*[id^='6879:'][id$='a']")).click();
		List<WebElement> LastLeadConversionDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node16 = LastLeadConversionDate.size();
		for (int i = 0; i < total_node16; i++) {
			String date = LastLeadConversionDate.get(i).getText();
			if (date.equals("30")) {
				LastLeadConversionDate.get(i).click();
				break;
			}
		}

		// CRM Submission TIME DATE
		driver.findElement(By.cssSelector("*[id^='7061:'][id$='a']")).click();
		List<WebElement> CRMSubmissionTime = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node17 = CRMSubmissionTime.size();
		for (int i = 0; i < total_node17; i++) {
			String date = CRMSubmissionTime.get(i).getText();
			if (date.equals("30")) {
				CRMSubmissionTime.get(i).click();
				break;
			}
		}

	}

	@Then("^Click the Save button$")
	public void click_the_Save_button() {

		driver.findElement(By.cssSelector("*[data-aura-rendered-by^='9211:'][data-aura-rendered-by$='a']")).click();

	}
}
