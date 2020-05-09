import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ClickOnGearIcon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver","//Users//vedant.jagani//eclipse-workspace//Drivers//chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"//Users//vedant.jagani//eclipse-workspace//Drivers//geckodriver2");

		FirefoxDriver driver = new FirefoxDriver(); // Open firefox
		// WebDriver driver = new ChromeDriver(); // Open Chrome
		//
		
		driver.get("https://rv--test.cs26.my.salesforce.com");

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("vedant.jagani@campingworld.com.test");

		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Welcome2019*");
		
// Click the login button
		driver.findElement(By.xpath("//Input[@id='Login']")).click(); 
		Thread.sleep(5000);
		

		// WebElement element = driver.findElement (By.xpath ("//*[@id=\"75:227;a\"]"));
		// JavascriptExecutor executor = (JavascriptExecutor) driver;
		// executor.executeScript ("arguments[0].click();" , element);


//CLICK THE GEAR ICON
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By
				.xpath("/html/body/div[4]/div[1]/section/header/div[2]/span/div[2]/ul/li[7]/div/div/div[1]/div/div/a/div")))
				.build().perform();
		driver.findElement(By.xpath(
				"/html/body/div[4]/div[1]/section/header/div[2]/span/div[2]/ul/li[7]/div/div/div[1]/div/div/a/div")).click();
		System.out.println("Clicked on the Gear icon");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div[4]/div[1]/section/header/div[2]/span/div[2]/ul/li[7]/div/div/div[1]/div/div/a/div")));
		
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		

// Close the browser
		driver.quit();

		System.out.println("===================================Browser is closed Successfully==================================================");
		System.out.println("====================================Script Executed Successfully=================================================================");

	}

}
