import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MySecondTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver","//Users//vedant.jagani//eclipse-workspace//Drivers//chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"//Users//vedant.jagani//eclipse-workspace//Drivers//geckodriver2");

		WebDriver driver = new FirefoxDriver(); // Open firefox
		// WebDriver driver = new ChromeDriver(); // Open Chrome
		driver.get("https://rv--test.cs26.my.salesforce.com");

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("vedant.jagani@campingworld.com.test");

		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Welcome2019*");
		
// Click the login button
		driver.findElement(By.xpath("//Input[@id='Login']")).click(); 
		Thread.sleep(5000);
		
// Title from the Home Page
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Lightning Experience", "Home page title is not matched22");
		Thread.sleep(5000);

		// WebElement element = driver.findElement (By.xpath ("//*[@id=\"75:227;a\"]"));
		// JavascriptExecutor executor = (JavascriptExecutor) driver;
		// executor.executeScript ("arguments[0].click();" , element);

//Click on the Chatter tab
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/header/div[3]/one-appnav/"
				+ "div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]/a/span")).click();
		String titleChatter = driver.getTitle();
		System.out.println(titleChatter);
		Assert.assertEquals(titleChatter, "Chatter Home | Salesforce", "Page title is not matched-Chatter");
		Thread.sleep(3000);

//Click on the Daily UP Log tab
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/header/div[3]/one-appnav/div/"
				+ "one-app-nav-bar/nav/div/one-app-nav-bar-item-root[3]/a/span")).click();
		String titleDailyUPLog = driver.getTitle();
		System.out.println(titleDailyUPLog);
		Thread.sleep(3000);

//Click on the UPs Log tab
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/header/div[3]/"
//				+ "one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[4]/a/span")).click();
//		String titleUPsLog = driver.getTitle();
//		System.out.println(titleUPsLog);
//		Assert.assertEquals(titleUPsLog, "Ups | Salesforce", "Page title is not matched - UpsLog");
//		Thread.sleep(3000);

//Click on the Leads tab
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/header/div[3]/one-appnav/div/one-app-nav-bar/"
//				+ "nav/div/one-app-nav-bar-item-root[5]/a/span")).click();
//		String titleLeads = driver.getTitle();
//		System.out.println(titleLeads);
//		Assert.assertEquals(titleLeads, "", "Page title is not matched- Leads");
//		Thread.sleep(3000);
//
//Click on the Opportunities tab
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/header/div[3]/one-appnav/div/"
//				+ "one-app-nav-bar/nav/div/one-app-nav-bar-item-root[6]/a/span")).click();
//		String titileOpportunities = driver.getTitle();
//		System.out.println(titileOpportunities);
//	    Assert.assertEquals(titileOpportunities, "", "Page title is not matched - Opportunities");
//		Thread.sleep(3000);

//Click on the My Calendars tab
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/header/div[3]/one-appnav/div/"
//				+ "one-app-nav-bar/nav/div/one-app-nav-bar-item-root[7]/a/span")).click();

//Click on the Activities tab
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/header/div[3]/one-appnav/div/"
//				+ "one-app-nav-bar/nav/div/one-app-nav-bar-item-root[8]/a/span")).click();
//		String ActivityTitile = driver.getTitle();
//		System.out.println(ActivityTitile);
//		Thread.sleep(3000);

//Click on the MyLocation Assets tab
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/header/div[3]/one-appnav/div/one-app-nav-bar/"
				+ "nav/div/one-app-nav-bar-item-root[9]/a/span")).click();
		String MyLocationTitle = driver.getTitle();
		System.out.println(MyLocationTitle);
		Thread.sleep(3000);

// Click on the Location Manager tab
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/header/div[3]/one-appnav/div/"
				+ "one-app-nav-bar/nav/div/one-app-nav-bar-item-root[10]/a/span")).click();
		String LocationManagerTitle = driver.getTitle();
		System.out.println(LocationManagerTitle);
		Assert.assertEquals(LocationManagerTitle, "My Location Assets | Salesforce",
				"Page title is not matched for the Location Manager");
		Thread.sleep(3000);

//CLICK THE GEAR ICON
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By
				.xpath("/html/body/div[4]/div[1]/section/header/div[2]/span/div[2]/ul/li[7]/div/div/div[1]/div/div/a")))
				.build().perform();
		Thread.sleep(6000);
		driver.findElement(By.xpath(
				"/html/body/div[4]/div[1]/section/header/div[2]/span/div[2]/ul/li[7]/div/div/div[1]/div/div/a/div"))
				.click();
		Thread.sleep(6000);
		System.out.println("Clicked on the Gear icon");

// Click the Setup Option		
		driver.findElement(By
				.xpath("/html/body/div[4]/div[1]/section/header/div[2]/span/div[2]/ul/li[7]/div/div/div[1]/div/div/a"))
				.click();
		Thread.sleep(4000);

// Close the browser
		driver.quit();

		System.out.println(
				"====================================Browser is closed Successfully===============================================================");
		System.out.println(
				"====================================Script Executed Successfully=================================================================");

	}

}
