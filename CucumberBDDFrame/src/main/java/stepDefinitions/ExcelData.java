package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.api.cucumber.trasform.ExcelDataToDataTable;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ExcelData {

	WebDriver driver;

	@Given("^Open Salesforce Website$")
	public void open_Salesforce_Website() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://rv--test.cs26.my.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		throw new PendingException();
	}

	@When("^User login with the follwoing username and password with data in excel file at  \"([^\"]*)\"$")
	public void user_login_with_the_follwoing_username_and_password_with_data_in_excel_file_at(
			@Transform(ExcelDataToDataTable.class) DataTable table) throws Throwable {

		System.out.println(table.asList(String.class));
		List<String> datalist = table.asList(String.class);
		for (String str : datalist) {
			System.out.println(str);
		}

		throw new PendingException();
	}

}
