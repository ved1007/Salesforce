import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyTitleForDialogWindow {
	
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
	driver.findElement(By.id("username")).sendKeys("vedant.jagani@campingworld.com.test");
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("Welcome2019*");
	
	
	driver.findElement(By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']")).click();
	Thread.sleep(10000);
	
	

}
}

