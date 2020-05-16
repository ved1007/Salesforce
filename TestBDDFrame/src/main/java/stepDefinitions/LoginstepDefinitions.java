package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginstepDefinitions {

	WebDriver driver;

	@Given("^Open Salesforce Website$")
	public void open_Salesforce_Website() {

		System.setProperty("webdriver.chrome.driver",
				"//Users//vedant.jagani//eclipse-workspace//Drivers//chromedriver3");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://rv--test.cs26.my.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@When("^verify title$")
	public void verify_title() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Login | Salesforce", title);
	}

	@Then("^user enter ID and Password$")
	public void user_enter_ID_and_Password() {
		driver.findElement(By.id("username")).sendKeys("jaiden.bodine@campingworld.com.test");
		driver.findElement(By.id("password")).sendKeys("P@ssw0rd!1");

	}

	@Then("^user click on the login button$")
	public void user_click_on_the_login_button() {
		driver.findElement(By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']")).click();

	}

	@Then("^user will create new up$")
	public void user_will_create_new_up() {
		driver.findElement(By.xpath(
				"//div[@class='slds-m-horizontal_xxx-small slds-size--1-of-6 slds-truncate']//button [@type='button']"))
				.click();
	}

	@Then("^user will populate the SalesPerson field$")
	public void user_will_populate_the_SalesPerson_field() {
		WebElement salespersn = driver.findElement(By.xpath("//select[@class = 'slds-select' and @name = 'splist']"));
		salespersn.click();
		Select salesperson = new Select(salespersn);
		salesperson.selectByVisibleText("Joseph Anderson");

	}

	@Then("^user will populate the email firstname lastname zipcode address fields$")
	public void user_will_populate_the_email_firstname_lastname_zipcode_address_fields() {
		driver.findElement(By.xpath("//input [@class = 'slds-input' and @type = 'email']"))
				.sendKeys("vedant2.jagani2@test.com.test");
		driver.findElement(By.xpath("//input[@type = 'tel']")).sendKeys("1232341235");
		driver.findElements(By.xpath("//input [@class = 'slds-input' and @type = 'string']")).get(0)
				.sendKeys("Vedant10");
		driver.findElements(By.xpath("//input [@class = 'slds-input' and @type = 'string']")).get(1)
				.sendKeys("Jagani10");
		driver.findElements(By.xpath("//input[@class = 'slds-input' and @type = 'text']")).get(1).sendKeys("60103");
		driver.findElements(By.xpath("//input[@class = 'slds-input' and @type = 'text']")).get(2)
				.sendKeys("4203 Chicago St");
		driver.findElements(By.xpath("//input[@class = 'slds-input' and @type = 'text']")).get(3).sendKeys("1001");

	}

	@Then("^user click on the save button$")
	public void user_click_on_the_save_button() {
		driver.findElement(By.xpath("//button[contains(text(), 'Save')]")).click();
	}

	@Then("^user will refresh the page$")
	public void user_will_refresh_the_page() {
		driver.navigate().refresh();
	}

	@Then("^user will close the browser$")
	public void user_will_close_the_browser() {
		driver.quit();

	}

}
