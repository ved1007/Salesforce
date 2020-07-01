package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteAccount {

	WebDriver driver;

	@Given("^Open Salesforce Website$")
	public void open_Salesforce_Website() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://rv--test.cs26.my.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("^verify Salesforce page title$")
	public void verify_Salesforce_page_title() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Login | Salesforce", title);

	}

	@Then("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);

	}

	@Then("^click  the login button$")
	public void click_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']")).click();

	}

	@Then("^verify Salesforce Home page title$")
	public void verify_Salesforce_Home_page_title() throws Throwable {
		String HomepageTitle = driver.getTitle();
		System.out.println(HomepageTitle);
		Assert.assertEquals("Lightning Experience", HomepageTitle);
		Thread.sleep(4000);

	}

	@Then("^click on the waffle icon$")
	public void click_on_the_waffle_icon() throws Throwable {

		Actions action = new Actions(driver);
		WebElement waffle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
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

	@Then("^Search for the Accounts option$")
	public void search_for_the_Accounts_option() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder = 'Search apps and items...']")).sendKeys("Accounts");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder = 'Search apps and items...']")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);

	}

// Verify page title
	@Then("^Verify title for the Account page$")
	public void verify_title_for_the_Account_page() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Recently Viewed | Accounts | Salesforce", title);
	}

	@Then("^user will click on the Account Name$")
	public void user_will_click_on_the_Account_Name() throws Throwable 
	{
		driver.findElement(By.xpath("//a[@title='Automation1']")).click();

	}

	@Then("^user will delete the account$")
	public void user_will_delete_the_account() throws Throwable 
	{
		Actions action = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath("//span[contains(text(),'Show 5 more actions')]"));
		action.moveToElement(mainMenu).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Show 5 more actions')]"))).click().build().perform();
		

	}
	@Then("^Take a screenshot$")
	public void take_a_screenshot() throws Throwable {
	
		// Take screenshot and store as a file format
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		// now copy the screenshot to desired location using copyFile //method
		try {
			FileUtils.copyFile(source,
					new File("/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/Screenshots/AccountDeleted.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	   
	}

	@Then("^close the application$")
	public void close_the_application() throws Throwable 
	{
//	  driver.quit();
	}
}
