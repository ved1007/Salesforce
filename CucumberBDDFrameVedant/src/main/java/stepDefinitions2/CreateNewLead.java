package stepDefinitions2;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.codoid.products.fillo.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateNewLead {

	WebDriver driver;

	@Given("^Salesforce site$")
	public void salesforce_site() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://rv--train.my.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("^Salesforce page title$")
	public void salesforce_page_title() {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Login | Salesforce", title);

	}

	@Then("^login as Dealer Sales or DealerSalesManagerOrSystemAdmin enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_as_Dealer_Sales_or_DealerSalesManagerOrSystemAdmin_enter_and(String un, String pwd) {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);

	}

	@Then("^click login button$")
	public void click_login_button() {
		driver.findElement(By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']")).click();

	}

	@Then("^Salesforce Home page title$")
	public void salesforce_Home_page_title() throws Exception {
		String HomepageTitle = driver.getTitle();
		System.out.println(HomepageTitle);
		Assert.assertEquals("Lightning Experience", HomepageTitle);
		Thread.sleep(4000);

	}

	@Then("^click Leads tab$")
	public void click_Leads_tab() throws Throwable {

		Actions action = new Actions(driver);
		WebElement leadtab = driver
				.findElement(By.xpath("//span[contains(text(),'Leads') and @class='slds-truncate']"));
		action.moveToElement(leadtab)
				.moveToElement(
						driver.findElement(By.xpath("//span[contains(text(),'Leads') and @class='slds-truncate']")))
				.click().build().perform();

	}

	@Then("^click on the new button$")
	public void click_on_the_new_button() throws Throwable {
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(2000);

	}

	@Then("^Choose Location and Save$")
	public void choose_Location_and_Save() {

		
	}

}
