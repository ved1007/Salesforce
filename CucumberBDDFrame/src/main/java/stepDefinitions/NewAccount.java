package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewAccount {

	WebDriver driver;

	@Given("^User will Open Salesforce Website$")
	public void user_will_Open_Salesforce_Website() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/vedant.jagani/Documents/Automation/ABCD/Drivers/chromedriver");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://rv--test.cs26.my.salesforce.com");
//			driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@When("^verify title for the Salesforce page$")
	public void verify_title_for_the_Salesforce_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Login | Salesforce", title);

	}

	@Then("^user will enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_will_enter_and(String arg1, String arg2) {
		driver.findElement(By.id("username")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);

	}

	@Then("^user click  the login button$")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']")).click();

	}

	@Then("^verify title for the Salesforce Home page$")
	public void verify_title_for_the_Salesforce_Home_page() throws InterruptedException {
		String HomepageTitle = driver.getTitle();
		System.out.println(HomepageTitle);
		Assert.assertEquals("Lightning Experience", HomepageTitle);
		Thread.sleep(4000);

	}

	@Then("^user will click on the waffle icon$")
	public void user_will_click_on_the_waffle_icon() throws InterruptedException {

		Actions action = new Actions(driver);
		WebElement waffle = driver.findElement(By.xpath("//button[@class='slds-button']"));
		action.moveToElement(waffle).click().build().perform();

		System.out.println("Clicked on the Waffle button");
		Thread.sleep(3000);

		try {

			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (Exception e) {

			System.out.println("Alert pop up is closed");

		}

	}

	@Then("^user will navigate to the Search field and search for the Account$")
	public void user_will_navigate_to_the_Search_field_and_search_for_the_Account() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder = 'Search apps and items...']")).sendKeys("Accounts");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder = 'Search apps and items...']")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);

	}

// Verify page title
	@Then("^user weill verify title for the Account page$")
	public void user_weill_verify_title_for_the_Account_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Recently Viewed | Accounts | Salesforce", title);
	}

// Click on New button
	@Then("^user will click on the New button$")
	public void user_will_click_on_the_New_button() {
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='New']")));
		button.click();

	}

	@Then("^user will select the Household radio button$")
	public void user_will_select_the_Household_radio_button() {

	}

	@Then("^user will click the Next button within the New Account window$")
	public void user_will_click_the_Next_button_within_the_New_Account_window() {
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		WebElement nextButton = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]")));
		nextButton.click();

	}

	@Then("^user will verify that the required fields message is displayed$")
	public void user_will_verify_that_the_required_fields_message_is_displayed() {
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement saveButton = wait3
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Save']")));
		saveButton.click();

		String requiredFieldMessage = driver
				.findElement(By.xpath("//span[contains(text(), 'Review the errors on this page.')]")).getText();
		String expected = "Review the errors on this page.";
		Assert.assertEquals(requiredFieldMessage, expected);

	}

	@Then("^user will populate fields within the Account Information section$")
	public void user_will_populate_fields_within_the_Account_Information_section() {

	}

	@Then("^user will populate fields within the Address Inforamtion section$")
	public void user_will_populate_fields_within_the_Address_Inforamtion_section() {

	}

	@Then("^user will populate fields within the Cloud MDM Information$")
	public void user_will_populate_fields_within_the_Cloud_MDM_Information() {

	}

	@Then("^user will create new account by clicking the Save button$")
	public void user_will_create_new_account_by_clicking_the_Save_button() {

	}

	@Then("^use will close the application$")
	public void use_will_close_the_application() {

		// driver.close();
	}

}
