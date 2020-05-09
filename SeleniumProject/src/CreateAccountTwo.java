
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CreateAccountTwo {

	public static <WedDriverWait, WebDriver> void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver","//Users//vedant.jagani//eclipse-workspace//Drivers//chromedriver3");
		System.setProperty("webdriver.gecko.driver",
				"//Users//vedant.jagani//eclipse-workspace//Drivers//geckodriver2");

// following code for to close the Notification Allow dialog box for firefox
		FirefoxOptions opt = new FirefoxOptions();
		opt.addPreference("dom.webnotifications.enabled", false);
		FirefoxDriver driver = new FirefoxDriver(opt);
		driver.get("https://rv--test.cs26.my.salesforce.com");

// Salesforce Test sandbox Web site		

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		System.out.println("Maximize Window");

// Populate the UserID field
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("vedant.jagani@campingworld.com.test");
		System.out.println("UserId field is populated");

// Populate the Password field
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Welcome2019*");
		System.out.println("Password field is populated");

// Click on the login button
		driver.findElement(By.xpath("//Input[@id='Login']")).click();
		System.out.println("Clicked on the Login button");
		System.out.println("Salesforce Page is displayed");

// Click the waffle button
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		System.out.println("Clicked on the Waffle icon");
		Thread.sleep(3000);

		int total_frames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frame count:-----" + total_frames);

// Click on the Ups tab		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/header/div[3]/one-appnav/div/one-app-nav-bar/"
				+ "nav/div/one-app-nav-bar-item-root[4]/a")).click();

		System.out.println("Clicked on the Ups tab");
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Recently Viewed | Ups | Salesforce", "Page title is not matched - UpsLog");
		Thread.sleep(3000);

// Click the New button

		driver.findElement(By.xpath(
				"/html/body/div[4]/div[1]/section/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/ul/li[1]/a/div"))
				.click();
		Thread.sleep(3000);

//		driver.switchTo().frame("resizeCaptureFrame");

//		WebElement frame = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div")); 
//				driver.switchTo().frame(frame);
//		System.out.println(frame);

// The Last Name field
		driver.findElement(By.cssSelector("*[id^='380:'][id$='a']")).sendKeys("TEST");
		System.out.println("The Last namefield is populated");

// The First Name field
		driver.findElement(By.cssSelector("*[id^='400:'][id$='a']")).sendKeys("SANDBOX");
		System.out.println("The First namefield is populated");

// Road to Sale field		
		
		WebElement ele= driver.findElement(By.cssSelector("*[id^='517:'][id$='a']")); Thread.sleep(3000);
		ele.click();
		
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
	

// The Email field
		driver.findElement(By.cssSelector("*[id^='636:'][id$='a']")).sendKeys("vedant.jagani@test.com.test");
		System.out.println("The Email field is populated");

//Description field
		driver.findElement(By.cssSelector("*[id^='878:'][id$='a']"))
				.sendKeys("This comments for the Description field");
		System.out.println("The Discription field is populated");

// RVVP field
		driver.findElement(By.cssSelector("*[id^='1188:'][id$='a']")).sendKeys("Adding value into the SRVP field");
		System.out.println("The SRVP field is populated");

// RVP field
		driver.findElement(By.cssSelector("*[id^='1222:'][id$='a']")).sendKeys("Adding value into the RVP field");
		System.out.println("The RVP field is populated");

// Note field		
		driver.findElement(By.cssSelector("*[id^='1363:'][id$='a']")).sendKeys("Adding comments for the Notes field");
		System.out.println("The Note field is populated");

// Click on the Save  button

		driver.findElement(By.xpath(
				"//button[@type = 'button' and @class = 'slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']"))
				.click();
		System.out.println("I clicked on the Save button");

// Close the browser
//		driver.quit();

		System.out.println(
				"===================================Browser is closed Successfully==================================================");
		System.out.println(
				"====================================Script Executed Successfully=================================================================");

	}

}
