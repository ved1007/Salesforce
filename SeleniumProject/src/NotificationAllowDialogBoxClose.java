import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationAllowDialogBoxClose {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver","//Users//vedant.jagani//eclipse-workspace//Drivers//chromedriver3");
		System.setProperty("webdriver.gecko.driver",
				"//Users//vedant.jagani//eclipse-workspace//Drivers//geckodriver2");

// following code for to close the Notification Allow dialog box for Firefox
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

		// Close the browser
//		driver.quit();		

	}

}
