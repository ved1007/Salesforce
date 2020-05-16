import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateUpAssignToDealerSalesReceptionist2 {

//  public static String actualerrormessage;
//  public static String expectederrormessage = "Complete this field.";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"//Users//vedant.jagani//eclipse-workspace//Drivers//chromedriver3");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(opt);

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://rv--test.cs26.my.salesforce.com");

		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("joseph.anderson@campingworld.com.test");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("P@ssw0rd!1");

//Click on the Login button
		driver.findElement(By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']")).click();
		Thread.sleep(10000);

		driver.navigate().refresh();

//Click on the Home tab

		driver.findElementByXPath("//span [contains( text(), 'Home')]");
		String homepagetitle = driver.getTitle();
		Thread.sleep(5000);
		Assert.assertEquals(homepagetitle, "Home | Salesforce", "Page title is not matched - Home Page");
		System.out.println(homepagetitle);
		Thread.sleep(5000);
		
// Click on the Waffle icon		

		driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']")).click();
		Thread.sleep(5000);
		
// Search field - Enter value
		driver.findElements(By.xpath("//input[@class = 'slds-input' and @type = 'search']")).get(4).sendKeys("Sales Desk");
		Thread.sleep(6000);
		System.out.println("------SEARCH FIELD PASSED-------");

// hover over and click on selected value		
		WebElement desk = driver.findElement(By.xpath("//p[@class = 'slds-truncate']"));
		Actions action = new Actions(driver);
		action.moveToElement(desk).click().build().perform();
		
		
//Click on the Customer name
		Actions action2 = new Actions(driver);
		WebElement element = driver.findElements(By.xpath("//div [@class = 'slds-truncate' and @title = 'Name']")).get(0);
		action2.moveToElement(element)	.click().build().perform();
		Thread.sleep(5000);
		System.out.println("------Clicked on Customer Name------------");
		
// Click the RV Genius button		
//		driver.findElement(By.xpath("//button [contains (text(), 'RV Genius')]")).click();
//		System.out.println("clicked on the RV Genius button");
//		Thread.sleep(10000);
//		
//// Verify RVG title		
//		String RVGtitle = driver.getTitle();
//		Thread.sleep(5000);
//		Assert.assertEquals(RVGtitle, "Lightning Experience", "Page title is not matched - Home Page");
//		System.out.println(RVGtitle);
//		Thread.sleep(5000);
//		
//// City field is populated
//		driver.findElements(By.xpath("//input[@class = 'slds-input']")).get(6).sendKeys("60103");
//		System.out.println("The City field is populated");
//		
		
// Populate the State field
//				WebElement state = driver.findElement(By.xpath("//Select[@name = 'select' and @class = 'slds-select']"));
//				state.click();
//				Select salesperson = new Select(state);
//				salesperson.selectByVisibleText("IL");
//				Thread.sleep(5000);		
		
//Close the browser
//		driver.quit();

	}
}
