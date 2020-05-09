
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class CreateUpAssignToDealerSalesReceptionist {

	public static void main(String[] args) throws InterruptedException {

//		    public static String actualerrormessage;
//		    public static String expectederrormessage = "Complete this field.";

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
		driver.findElement(By.id("username")).sendKeys("jaiden.bodine@campingworld.com.test");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("P@ssw0rd!1");

		// Click on the Login button
		driver.findElement(By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']")).click();
		Thread.sleep(5000);

		// Click on the Create New UP button
		driver.findElement(By.xpath(
				"//div[@class='slds-m-horizontal_xxx-small slds-size--1-of-6 slds-truncate']//button [@type='button']"))
				.click();
		Thread.sleep(5000);

		// Click on the Save button
//		        driver.findElement(By.xpath("//button[contains(text(), 'Save')]")).click();
//		        Thread.sleep(3000);

		// Verify required message for the salesperson field
//		        actualerrormessage = driver.findElement(By.xpath("//div[@class='slds-form-element__help']")).getText();
//		        Assert.assertEquals(actualerrormessage, expectederrormessage);

		// Populate the Salesperson field
		WebElement salespersn = driver.findElement(By.xpath("//select[@class = 'slds-select' and @name = 'splist']"));
		Select salesperson = new Select(salespersn);
		salesperson.selectByVisibleText("Joseph Anderson");
		Thread.sleep(3000);

		// Populate the fields within the Create New Up window
		driver.findElement(By.xpath("//*[@id=\"input-76\"]")).sendKeys("vedant2.jagani2@test.com.test");
		System.out.println("The Email field is populated");

		driver.findElement(By.xpath("//*[@id=\"input-77\"]")).sendKeys("1232341235");
		System.out.println("The Phone field is populated");

		driver.findElement(By.xpath("//*[@id=\"input-78\"]")).sendKeys("Vedant2");
		System.out.println("The First name field is populated");

		driver.findElement(By.xpath("//*[@id=\"input-79\"]")).sendKeys("Jagani2");
		System.out.println("The Last name field is populated");

		driver.findElement(By.xpath("//*[@id=\"input-80\"]")).sendKeys("60103");
		System.out.println("The Zip Code field is populated");

		driver.findElement(By.xpath("//*[@id=\"input-81\"]")).sendKeys("4201 Chicago St");
		System.out.println("The Street Address field is populated");

//		        driver.findElement(By.xpath("//*[@id=\"input-82\"]")).sendKeys("1001");
//		        System.out.println("The Good Sam Club # field is populated");

		// Click on the Save button
		driver.findElement(By.xpath("//button[contains(text(), 'Save')]")).click();
		System.out.println("Clicked on the Save button");
		Thread.sleep(9000);
		// Regresh the Page
		driver.navigate().refresh();

		// Close the browser
//		driver.quit();
//
//		ChromeOptions opt2 = new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//
//		ChromeDriver driver2 = new ChromeDriver(opt2);
//
//		driver2.get("https://rv--test.cs26.my.salesforce.com");
//
//		driver2.findElement(By.id("username")).clear();
//		driver2.findElement(By.id("username")).sendKeys("joseph.anderson@campingworld.com.test");
//		driver2.findElement(By.id("password")).clear();
//		driver2.findElement(By.id("password")).sendKeys("P@ssw0rd!1");
//
//		// Click on the Login button
//		driver2.findElement(By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']")).click();
//		Thread.sleep(5000);
//
//		// Refresh the page
//
//		driver2.navigate().refresh();
//
//		driver2.quit();

	}

}
