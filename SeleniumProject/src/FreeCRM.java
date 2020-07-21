import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FreeCRM {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");

		
		
		driver = new ChromeDriver();
		
		
		driver.get("https://phptravels.org/clientarea.php");
		
		
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[2]/a")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"Primary_Navbar-Home\"]/a")).click();
		System.out.println("I clicked on HOme tab");
		
		
		driver.findElement(By.xpath("//*[@id=\"Primary_Navbar-Announcements\"]/a")).click();
		
		System.out.println("I clicked on Announcements tab");
		
		

	}

}
