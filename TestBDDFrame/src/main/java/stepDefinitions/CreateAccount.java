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

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccount {

	WebDriver driver;

	@Given("^User will Open Salesforce Website$")
	public void user_will_Open_Salesforce_Website() {

		System.setProperty("webdriver.chrome.driver",
				"//Users//vedant.jagani//eclipse-workspace//Drivers//chromedriver3");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://rv--test.cs26.my.salesforce.com");
		driver.manage().window().maximize();
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
	public void verify_title_for_the_Salesforce_Home_page() {
		String HomepageTitle = driver.getTitle();
		System.out.println(HomepageTitle);
		Assert.assertEquals("Lightning Experience", HomepageTitle);

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
	public void user_will_navigate_to_the_Search_field_and_search_for_the_Account() {
		driver.findElement(By.xpath("//input[@placeholder = 'Search apps and items...']")).sendKeys("Account");
		driver.findElement(By.xpath("//input[@placeholder = 'Search apps and items...']")).sendKeys(Keys.ENTER);

	}

}
