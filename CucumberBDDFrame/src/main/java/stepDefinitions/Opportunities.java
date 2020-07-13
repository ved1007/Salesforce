package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		driver.manage().window().maximize();
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

		// eLead Cheat checkbox
		driver.findElement(By.cssSelector("*[id^='172:'][id$='a']")).click();
		// Worksheet ID field
		driver.findElement(By.cssSelector("*[id^='57:'][id$='a']")).sendKeys("WorkId101");

		// Date and Time
		driver.findElement(By.cssSelector("*[id^='11:'][id$='a']")).click();
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
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
		driver.findElement(By.cssSelector("*[id^='676:'][id$='a']")).sendKeys("20");

		// Opportunity Selling Owner Name field
		driver.findElement(By.cssSelector("*[id^='708:'][id$='a']")).sendKeys("Opportunity Selling Owner Name");

		// Dropped Dealership field
		driver.findElement(By.cssSelector("*[id^='724:'][id$='a']")).sendKeys("Dropped Dealership field");

		// IDS Customer# field
		driver.findElement(By.cssSelector("*[id^='754:'][id$='a']")).sendKeys("IDS Customer #");

		// IDS FI Quote # field
		driver.findElement(By.cssSelector("*[id^='798:'][id$='a']")).sendKeys("IDS FI Quote #field");

		// Review Requested Date field

		// First Survey Attempt field

		// Write-Up Amount field

		// County field
		driver.findElement(By.cssSelector("*[id^='940:'][id$='a']")).sendKeys("Country field");

		// Customer appointment Date and Time

		// Type dropdown field

		// Appointment complated Date

		// Customer Delivery Date and Time field

		// Appointment - Deliveriry Set - Contacted - Up Assigned checkboxes

		// PDI Printed Date and Time
	}

	@Then("^Interested In Attributes$")
	public void populate_Interested_In_Attributes_fields() {

		// New/Used - Year To

		// Floorplan Style

		// Genius Notes 1 (RV Attributes)
		driver.findElement(By.cssSelector("*[id^='2750:'][id$='a']")).sendKeys("Genius Notes 1 field");

		// Notes 2 (Meet & Greet)
		driver.findElement(By.cssSelector("*[id^='2798:'][id$='a']")).sendKeys("Notes 2 field");

		// Genius Notes 3 (Trade Notes)
		driver.findElement(By.cssSelector("*[id^='2842:'][id$='a']")).sendKeys("Genius Notes 3 field");

		// # Sleeps
		// Year From
		// Year To
		// Price From
		// Price To
		// Payment From
		// Payment To
		// Length From
		// Length To
		// # Slide Outs

	}

	@Then("^Interested In Details$")
	public void Interested_In_Details() {

		// Intrested Type

		// INterior Color

		// Interested Category

		// Exterior Color
		// Interested Year
		// # Doors
		// Interested Make
		// Mileage
		// Interested Model
		// Vehicle Options
		// Interested Product
		// Interest Level dropdown
		// Vehicle Trim
		// Buying Horizon
		// Vehicle Engine
		// Payment Method dropdown
		// Chassis dropdown
		// Payment Details
		// Transmission
		// Vehicle procing
		// Interested Id
		// Webpage
		// Toy Deck drop down
		// Outdoor Kitchen
		// Outdoor Entertainment
		// Check boxes |Meet&Greet|Needs Analysis|Selection|Presentation|Intro to
		// Service|Write Up Stage|T.O to F&I|

	}

	@Then("^Towing Information$")
	public void Towing_Information() {

		// Tow Vehicle Year
		// Tow Vehicle Make
		// Tow Vehicle Model
		// Tow Vehicle Trim
		// Tow Vehicle Style
		// Max Towing Capacity
		// Tow Vehicle VIN

	}

	@Then("^Currently Own Trade-InCurrently Own TradeIn from Web Lead fields$")
	public void currently_Own_Trade_InCurrently_Own_TradeIn_from_Web_Lead_fields() {

		// Current Owner Category
		// Current Owned Year
		// Current Owned Make
		// Current Owned Product
		// Current Owned Model
		// Current Owned Trim
		// Current Owned Length
		// Current Owned Engine
		// Current Owned Options
		// Current Owned Mileage
		// Current Owned Payoff
		// Current Owned Quote Low
		// Current Owned Quote High
		// Current Owned Quote Details
		// Current Owned Comments
		// Current Owned Condition
		// Current Owned ID

	}

	@Then("^Pupulate Info from lead fields$")
	public void pupulate_Info_from_lead_fields() {
		// Lead Phone
		// Lead Mobile Phone
		// Lead other Phone
		// Lead Work Phone
		// Lead Email
		// Lead Score
		// Lead Message
		// End Visit Notes

	}

	@Then("^Lead Source$")
	public void Lead_Source() {
		// Source
		// Lead Source
		// Web Lead Source Detail
		// Web Lead Source
		// Web Lead Source Name
		// Geo Lookup
		// Lead Queue Id
		// Original Location Account
		// FormName
		// Tracking Medium
		// Website
		// Location Primary Lead
		// Enterprise Lead
		// eLead Create Date

	}

	@Then("^Enter the Description Information$")
	public void enter_the_Description_Information() {
		// Description
		// Price dropdown

	}

	@Then("^Other data fields$")
	public void populate_Other_data_fields() {

		// Primary Email
		// Primary Phone
		// Tracking Id
		// Tracking LandingPage URL
		// Tracking Referral URL
		// Tracking Promo Code
		// Tracking Campaign
		// Tracking Source
		// Tracking Content
		// Tracking Keywords
		// Ad Campaign
		// Ad Group
		// Ad Keyword
		// Ad Slot
		// Ad Slot Position
		// Ad Content
		// Lead Ip Address
		// Lead System Data
		// Category
		// Forecast Category
		// Manager Assisted | Manager Interaction | Manager Turn Over check boxes
		// Next Step
		// Backend GP

	}

	@Then("^Populate the System Information fields$")
	public void populate_the_System_Information_fields() {

		// Last Activity Date
		// Next Activity Date
		// Last Stage Change Time Date and Time
		// Last Sales Activity Date Time
		// Last Lead Conversion Date TIme
		// CRM Submission TIME DATE

	}

	@Then("^Click the Save button$")
	public void click_the_Save_button() {

	}
}
