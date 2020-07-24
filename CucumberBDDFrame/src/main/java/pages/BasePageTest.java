package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestUtil;

public class BasePageTest {

	public WebDriver driver;
	public final int WAIT = 10;

	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://rv--test.cs26.my.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

	}

	public void teardown() {
		if (driver != null)
			driver.quit();

	}

	public void waitForElementToBeClickable(By by) {

		WebDriverWait wait = new WebDriverWait(driver, WAIT);
		WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public WebElement $(By by) {
		return driver.findElement(by);

	}

	public String getTitle() {
		return driver.getTitle();

	}
}
