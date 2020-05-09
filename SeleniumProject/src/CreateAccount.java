import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
import org.testng.Assert;

public class CreateAccount {

	public static <WedDriverWait> void main(String[] args) throws InterruptedException {

//Create a map to store  preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

//add key and value to map as follow to switch off browser notification
//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);

//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();

// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);

//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
//		WebDriver driver = new ChromeDriver(options);

		System.setProperty("webdriver.chrome.driver",
				"//Users//vedant.jagani//eclipse-workspace//Drivers//chromedriver3");
//		System.setProperty("webdriver.gecko.driver","//Users//vedant.jagani//eclipse-workspace//Drivers//geckodriver2");

//		WebDriver driver1 = new FirefoxDriver(); // Open firefox
		WebDriver driver = new ChromeDriver(); // Open Chrome

// Salesforce Test sandbox Web site		
		driver.get("https://rv--test.cs26.my.salesforce.com");

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

// Populate the UserID field
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("vedant.jagani@campingworld.com.test");

// Populate the Password field
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Welcome2019*");

// Click the login button
		driver.findElement(By.xpath("//Input[@id='Login']")).click();

		Thread.sleep(8000);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.titleContains("Home | Salesforce"));
		System.out.println(wait);

// Click the waffle button
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();

		System.out.println("Clicked on the Waffle button");

		try {

			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (Exception e) {

			System.out.println("Alert pop up is closed");

		}

		driver.findElement(By.id("input-77")).sendKeys("Accounts");

		driver.findElement(By.xpath(
				"//div [@class = 'slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']"))
				.sendKeys(Keys.ENTER);

// Close the browser
//		driver.quit();

		System.out.println(
				"===================================Browser is closed Successfully==================================================");
		System.out.println(
				"====================================Script Executed Successfully=================================================================");

	}

}
