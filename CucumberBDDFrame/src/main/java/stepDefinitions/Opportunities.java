package stepDefinitions;

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

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Opportunities {

	WebDriver driver;

	@Given("^Open the Salesforce Website$")
	public void open_the_Salesforce_Website() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://rv--test.cs26.my.salesforce.com/");
	//	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
	public void populate_System_Admin_Layout_fields() {

		// Promo Message
		driver.findElement(By.cssSelector("*[id^='77:'][id$='a']")).sendKeys("Promo Message field");
		
		// Expiration Date
		driver.findElement(By.cssSelector("*[id^='11:'][id$='a']")).click();
		List<WebElement> ExpirationDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node = ExpirationDate.size();
		for (int i = 0; i < total_node; i++) {
			String date = ExpirationDate.get(i).getText();
			if (date.equals("31")) {
				ExpirationDate.get(i).click();
				break;
			}
		}

		// eLead Cheat checkbox
		driver.findElement(By.cssSelector("*[id^='172:'][id$='a']")).click();
		// Worksheet ID field
		driver.findElement(By.cssSelector("*[id^='57:'][id$='a']")).sendKeys("WorkId101");

		// Date and Time
		driver.findElement(By.cssSelector("*[id^='11:'][id$='a']")).click();
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node2 = dates.size();
		for (int i = 0; i < total_node2; i++) {
			String date = dates.get(i).getText();
			if (date.equals("20")) {
				dates.get(i).click();
				break;
			}
		}

	}

	@Then("^Opportunity Information$")
	public void Opportunity_Information() throws Throwable {

		// Opportunities Name field
		driver.findElement(By.cssSelector("*[id^='217:'][id$='a']")).sendKeys("Opportunitie Name field");
		
		//Account Name field
		
		driver.findElement(By.cssSelector("*[id^='302:'][id$='a']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Automation1')]")).click();

		// Amount field
		driver.findElement(By.cssSelector("*[id^='233:'][id$='a']")).sendKeys("10");

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
		driver.findElement(By.cssSelector("*[id^='558:'][id$='a']")).sendKeys("Nick Name field");

		// Reason dropdown field

		// Probability % field
		driver.findElement(By.cssSelector("*[id^='676:'][id$='a']")).sendKeys(".20");

		// Opportunity Selling Owner Name field
		driver.findElement(By.cssSelector("*[id^='708:'][id$='a']")).sendKeys("Opportunity Selling Owner Name");

		// Dropped Dealership field
		driver.findElement(By.cssSelector("*[id^='724:'][id$='a']")).sendKeys("Dropped Dealership field");

		// IDS Customer# field
		driver.findElement(By.cssSelector("*[id^='754:'][id$='a']")).sendKeys("IDS Customer #");

		// IDS FI Quote # field
		driver.findElement(By.cssSelector("*[id^='798:'][id$='a']")).sendKeys("IDS FI Quote #field");

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
		driver.findElement(By.cssSelector("*[id^='902:'][id$='a']")).sendKeys("1000");

		// County field
		driver.findElement(By.cssSelector("*[id^='940:'][id$='a']")).sendKeys("Country field");

		// Customer appointment Date and Time
		driver.findElement(By.cssSelector("*[id^='865:'][id$='a']")).click();
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
		driver.findElement(By.xpath("//a[contains(text(),'New')]")).click();

		// Floorplan Style
		driver.findElement(By.cssSelector("*[aria-describedby^='2654:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Expandable')]")).click();

		// Genius Notes 1 (RV Attributes)
		driver.findElement(By.cssSelector("*[id^='2750:'][id$='a']")).sendKeys("Genius Notes 1 field");

		// Notes 2 (Meet & Greet)
		driver.findElement(By.cssSelector("*[id^='2798:'][id$='a']")).sendKeys("Notes 2 field");

		// Genius Notes 3 (Trade Notes)
		driver.findElement(By.cssSelector("*[id^='2842:'][id$='a']")).sendKeys("Genius Notes 3 field");

		// # Sleeps
		driver.findElement(By.cssSelector("*[id^='2886:'][id$='a']")).sendKeys("22");

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
		driver.findElement(By.cssSelector("*[id^='2776:'][id$='a']")).sendKeys("Slide Outs");

	}

	@Then("^Interested In Details$")
	public void Interested_In_Details() {

		// Intrested Type
		driver.findElement(By.cssSelector("*[id^='2933:'][id$='a']")).sendKeys("Intrested Type field");

		// Interior Color
		driver.findElement(By.cssSelector("*[id^='2949:'][id$='a']")).sendKeys("Interior Color field");

		// Interested Category
		driver.findElement(By.cssSelector("*[id^='2969:'][id$='a']")).sendKeys("Intrested Catagory field");

		// Exterior Color
		driver.findElement(By.cssSelector("*[id^='2985:'][id$='a']")).sendKeys("Exterior Color field");
		// Interested Year
		driver.findElement(By.cssSelector("*[id^='3005:'][id$='a']")).sendKeys("2019");
		// # Doors
		driver.findElement(By.cssSelector("*[id^='3021:'][id$='a']")).sendKeys("4");
		// Interested Make
		driver.findElement(By.cssSelector("*[id^='3043:'][id$='a']")).sendKeys("Intrested Make field");
		// Mileage
		driver.findElement(By.cssSelector("*[id^='3059:'][id$='a']")).sendKeys("5000");
		// Interested Model
		driver.findElement(By.cssSelector("*[id^='3081:'][id$='a']")).sendKeys("2020");
		// Vehicle Options
		driver.findElement(By.cssSelector("*[id^='3097:'][id$='a']")).sendKeys("Vehicle Options field");
		// Interested Product
		driver.findElement(By.cssSelector("*[id^='3117:'][id$='a']")).sendKeys("Intrested Product field");

		// Interest Level dropdown
		driver.findElement(By.cssSelector("*[aria-describedby^='3133:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='Highly Interested']")).click();
		
		
		// Vehicle Trim
		driver.findElement(By.cssSelector("*[id^='3183:'][id$='a']")).sendKeys("Vehicle Trim field");
		// Buying Horizon
		driver.findElement(By.cssSelector("*[id^='3199:'][id$='a']")).sendKeys("Buying Horizen field");
		// Vehicle Engine
		driver.findElement(By.cssSelector("*[id^='3219:'][id$='a']")).sendKeys("Vehicle Engine field");

		// Payment Method dropdown

		// Chassis dropdown

		// Payment Details
		driver.findElement(By.cssSelector("*[id^='3331:'][id$='a']")).sendKeys("Payment Details field");
		// Transmission
		driver.findElement(By.cssSelector("*[id^='3351:'][id$='a']")).sendKeys("Transmission field");

		// Vehicle pricing
		driver.findElement(By.cssSelector("*[id^='3367:'][id$='a']")).sendKeys("Vehicle pricing field");

		// Interested Stock
		driver.findElement(By.cssSelector("*[id^='3387:'][id$='a']")).sendKeys("Intrested Stock field");

		// Vehicle Comments
		driver.findElement(By.cssSelector("*[id^='3403:'][id$='a']")).sendKeys("Vehicle comments field");

		// Interested Id
		driver.findElement(By.cssSelector("*[id^='3423:'][id$='a']")).sendKeys("Intrested ID field");

		// Webpage
		driver.findElement(By.cssSelector("*[id^='3439:'][id$='a']")).sendKeys("www.campingworld.com");

		// Toy Deck drop down
		// Outdoor Kitchen
		// Outdoor Entertainment
		// Check boxes |Meet&Greet|Needs Analysis|Selection|Presentation|Intro to
		// Service|Write Up Stage|T.O to F&I|
		//Previouse Stage drop down

	}

	@Then("^Towing Information$")
	public void Towing_Information() {

		// Tow Vehicle Year
		driver.findElement(By.cssSelector("*[id^='3869:'][id$='a']")).sendKeys("2015");

		// Max Towing Capacity
		driver.findElement(By.cssSelector("*[id^='3887:'][id$='a']")).sendKeys("100");

		// Tow Vehicle Make
		driver.findElement(By.cssSelector("*[id^='3909:'][id$='a']")).sendKeys("Tow Vehicle Make field");

		// Tow Vehicle Model
		driver.findElement(By.cssSelector("*[id^='3943:'][id$='a']")).sendKeys("Tow Vehicle Model field");

		// Tow Vehicle VIN
		driver.findElement(By.cssSelector("*[id^='3959:'][id$='a']")).sendKeys("Tow Vehicle VIN field");

		// Tow Vehicle Trim
		driver.findElement(By.cssSelector("*[id^='3979:'][id$='a']")).sendKeys("Tow Vehicle Trim field");

		// Tow Vehicle Style
		driver.findElement(By.cssSelector("*[id^='4013:'][id$='a']")).sendKeys("Tow Vehicle Style field");

	}

	@Then("^Currently Own Trade-InCurrently Own TradeIn from Web Lead fields$")
	public void currently_Own_Trade_InCurrently_Own_TradeIn_from_Web_Lead_fields() {

		// Current Owner Category
		driver.findElement(By.cssSelector("*[id^='4058:'][id$='a']")).sendKeys("Current Owner Category field");

		// Current Owned Mileage
		driver.findElement(By.cssSelector("*[id^='4074:'][id$='a']")).sendKeys("200");

		// Current Owned Year
		driver.findElement(By.cssSelector("*[id^='4096:'][id$='a']")).sendKeys("Current Owned Year field");

		// Current Owned Payoff
		driver.findElement(By.cssSelector("*[id^='4112:'][id$='a']")).sendKeys("500");

		// Current Owned Make
		driver.findElement(By.cssSelector("*[id^='4134:'][id$='a']")).sendKeys("Current Owned Make field");

		// Current Owned Quote Low
		driver.findElement(By.cssSelector("*[id^='4150:'][id$='a']")).sendKeys("10");

		// Current Owned Product
		driver.findElement(By.cssSelector("*[id^='4172:'][id$='a']")).sendKeys("Current Owned Product field");

		// Current Owned Model
		driver.findElement(By.cssSelector("*[id^='4210:'][id$='a']")).sendKeys("Current Owned Model field");

		// Current Owned Quote High
		driver.findElement(By.cssSelector("*[id^='4188:'][id$='a']")).sendKeys("20");

		// Current Owned Trim
		driver.findElement(By.cssSelector("*[id^='4246:'][id$='a']")).sendKeys("Current Owned Trim field");

		// Current Owned Quote Details
		driver.findElement(By.cssSelector("*[id^='4226:'][id$='a']")).sendKeys("Current Owned Quote Details field");

		// Current Owned Length
		driver.findElement(By.cssSelector("*[id^='4282:'][id$='a']")).sendKeys("Current Owned Length field");

		// Current Owned Comments
		driver.findElement(By.cssSelector("*[id^='4262:'][id$='a']")).sendKeys("Current Owned Comments field");

		// Current Owned Engine
		driver.findElement(By.cssSelector("*[id^='4318:'][id$='a']")).sendKeys("Current Owned Engine field");

		// Current Owned Condition
		driver.findElement(By.cssSelector("*[id^='4298:'][id$='a']")).sendKeys("Current Owned Condtion field");

		// Current Owned ID
		driver.findElement(By.cssSelector("*[id^='4334:'][id$='a']")).sendKeys("Current Owner ID field");

		// Current Owned Options
		driver.findElement(By.cssSelector("*[id^='4354:'][id$='a']")).sendKeys("Current Owned Options field");

	}

	@Then("^Pupulate Info from lead fields$")
	public void pupulate_Info_from_lead_fields() {
		// Lead Phone
		driver.findElement(By.cssSelector("*[id^='4399:'][id$='a']")).sendKeys("1112223333");

		// Lead Email
		driver.findElement(By.cssSelector("*[id^='4415:'][id$='a']")).sendKeys("ved@gmail.com");

		// Lead Mobile Phone
		driver.findElement(By.cssSelector("*[id^='4435:'][id$='a']")).sendKeys("2223334444");

		// Lead Score
		driver.findElement(By.cssSelector("*[id^='4451:'][id$='a']")).sendKeys("10");

		// Lead other Phone
		driver.findElement(By.cssSelector("*[id^='4473:'][id$='a']")).sendKeys("1112223333");

		// Lead Work Phone
		driver.findElement(By.cssSelector("*[id^='4507:'][id$='a']")).sendKeys("3334445555");

		// Lead Message
		driver.findElement(By.cssSelector("*[aria-labelledby^='label-4545:'][aria-labelledby$='a']")).sendKeys("Lead Message field");

		// Lead Source

		// End Visit Notes
		driver.findElement(By.cssSelector("*[data-aura-rendered-by^='4615:'][data-aura-rendered-by$='a']"))
				.sendKeys("Lead Message field");

	}

	@Then("^Lead Source$")
	public void Lead_Source() {
		// Source
		driver.findElement(By.cssSelector("*[id^='4652:'][id$='a']")).sendKeys("10");

		// Lead Source drop down
		driver.findElement(By.cssSelector("*[aria-describedby^='4748:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='Internet']")).click();

		// FormName
		driver.findElement(By.cssSelector("*[id^='4794:'][id$='a']")).sendKeys("Form Name field");

		// Web Lead Source Detail drop down
		driver.findElement(By.cssSelector("*[aria-describedby^='4814:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='Dealer Website']")).click();

		// Tracking Medium
		driver.findElement(By.cssSelector("*[id^='4860:'][id$='a']")).sendKeys("Tracking Meduim field");

		// Tracking SCPC
		driver.findElement(By.cssSelector("*[id^='4956:'][id$='a']")).sendKeys("Tracking SCPC field");

		// Web Lead Source Name
		driver.findElement(By.cssSelector("*[id^='4976:'][id$='a']")).sendKeys("Web Lead Source Name field");

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
		driver.findElement(By.cssSelector("*[id^='5468:'][id$='a']")).sendKeys("Description field");

		// Price drop down
		driver.findElement(By.cssSelector("*[aria-describedby^='5488:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='$15,000 to $30,000']")).click();

	}

	@Then("^Other data fields$")
	public void populate_Other_data_fields() {

		// Primary Email
		driver.findElement(By.cssSelector("*[id^='5863:'][id$='a']")).sendKeys("Primary Email field");

		// Primary Phone
		driver.findElement(By.cssSelector("*[id^='5897:'][id$='a']")).sendKeys("1231231234");

		// Lead Ip Address
		driver.findElement(By.cssSelector("*[id^='5945:'][id$='a']")).sendKeys("Lead IP Address field");

		// Lead System Data
		driver.findElement(By.cssSelector("*[id^='5979:'][id$='a']")).sendKeys("Lead System Data field");

		// Category drop down
		driver.findElement(By.cssSelector("*[aria-describedby^='6049:'][aria-describedby$='a-label']")).click();
		driver.findElement(By.xpath("//a[@title='Camping Trailer']")).click();

		// Tracking Id
		driver.findElement(By.cssSelector("*[id^='6138:'][id$='a']")).sendKeys("Tracking ID field");

		// Tracking LandingPage URL
		driver.findElement(By.cssSelector("*[id^='6174:'][id$='a']")).sendKeys("Tracking LandingPage URL field");

		// Tracking Referral URL
		driver.findElement(By.cssSelector("*[id^='6211:'][id$='a']")).sendKeys("Tracking Referral URL field");

		// Tracking Promo Code
		driver.findElement(By.cssSelector("*[id^='6248:'][id$='a']")).sendKeys("Tracking Promo Code field");

		// Next Step
		driver.findElement(By.cssSelector("*[id^='6264:'][id$='a']")).sendKeys("Next Step field");

		// Tracking Campaign
		driver.findElement(By.cssSelector("*[id^='6284:'][id$='a']")).sendKeys("Tracking Campaign field");

		// Tracking Source
		driver.findElement(By.cssSelector("*[id^='6318:'][id$='a']")).sendKeys("Tracking Source field");

		// Tracking Content
		driver.findElement(By.cssSelector("*[id^='6352:'][id$='a']")).sendKeys("Tracking Content field");

		// Tracking Keywords
		driver.findElement(By.cssSelector("*[id^='6448:'][id$='a']")).sendKeys("Tracking Keyword field");

		// Backend GP
		driver.findElement(By.cssSelector("*[id^='6496:'][id$='a']")).sendKeys("10");

		// Ad Campaign
		driver.findElement(By.cssSelector("*[id^='6518:'][id$='a']")).sendKeys("AD Campaign field");

		// Ad Group
		driver.findElement(By.cssSelector("*[id^='6552:'][id$='a']")).sendKeys("AD Group field");

		// Ad Keyword
		driver.findElement(By.cssSelector("*[id^='6586:'][id$='a']")).sendKeys("AD Keyword field");

		// Ad Slot
		driver.findElement(By.cssSelector("*[id^='6620:'][id$='a']")).sendKeys("AD Slot field");

		// Ad Slot Position
		driver.findElement(By.cssSelector("*[id^='6654:'][id$='a']")).sendKeys("AD Slot Position field");

		// Ad Content
		driver.findElement(By.cssSelector("*[id^='6688:'][id$='a']")).sendKeys("AD Content field");

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
