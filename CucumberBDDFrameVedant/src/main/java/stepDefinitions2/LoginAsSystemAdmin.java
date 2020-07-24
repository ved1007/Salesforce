package stepDefinitions2;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginAsSystemAdmin {

	WebDriver driver;

	@Given("^Open Salesforce Application$")
	public void open_Salesforce_Application() {
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

	@When("^verify title Salesforce login page$")
	public void verify_title_Salesforce_login_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Login | Salesforce", title);

	}

	@Then("^populate \"([^\"]*)\" and \"([^\"]*)\"$")
	public void populate_and(String arg1, String arg2) {
		driver.findElement(By.id("username")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);

	}

	@Then("^click the login button$")
	public void click_the_login_button() {
		driver.findElement(By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']")).click();

	}

	@Then("^verify Salesforce Home title$")
	public void verify_Salesforce_Home_title() throws Exception {
		Thread.sleep(4000);
		String HomepageTitle = driver.getTitle();
		System.out.println(HomepageTitle);
		Assert.assertEquals("Lightning Experience", HomepageTitle);

	}

	@Then("^user will close the application$")
	public void user_will_close_the_application() {

		driver.quit();
	}

}
