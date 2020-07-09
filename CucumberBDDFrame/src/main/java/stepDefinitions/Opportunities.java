package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
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
		WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//span[contains(text(),'Next')]")));
		nextButton.click();

	}

	@Then("^Populate New Opportunity RV Sales fields$")
	public void populate_New_Opportunity_RV_Sales_fields() throws Throwable {
		driver.findElement(By.cssSelector("*[id^='217:'][id$='a']")).sendKeys("Opportunitie Name field");

	}

	@Then("^Click the Save button$")
	public void click_the_Save_button() throws Throwable {

	}
}
