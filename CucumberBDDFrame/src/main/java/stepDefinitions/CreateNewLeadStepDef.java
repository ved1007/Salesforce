package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.excel.test.utility.Xls_Reader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LeadsPage;

public class CreateNewLeadStepDef {

	WebDriver driver;

	Xls_Reader reader = new Xls_Reader(
			"/Users/vedant.jagani/git/Salesforce/CucumberBDDFrame/SampleData/ExcelTestData.xlsx");

	String WorksheetID = reader.getCellData("Leads", "WorksheetID", 2);

	LeadsPage leads = new LeadsPage();

	@Given("^Salesforce site$")
	public void salesforce_site() throws Throwable {

		leads.setup();

	}

	@When("^Salesforce page title as \"([^\"]*)\"$")
	public void salesforce_page_title_as(String SFPageTitle) throws Throwable {

		String title = leads.getTitle();
		System.out.println(title);
		Assert.assertEquals(SFPageTitle, title);

	}

	@Then("^Login as Dealer Sales or DealerSalesManagerOrSystemAdmin enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_as_Dealer_Sales_or_DealerSalesManagerOrSystemAdmin_enter_and(String un, String pwd)
			throws Throwable {

		leads.userNamefield(un);
		leads.passwordField(pwd);

	}

	@Then("^Click login btn$")
	public void click_login_btn() {
		leads.loginBtnClick();

	}

	@Then("^Salesforce Home page title as \"([^\"]*)\"$")
	public void salesforce_Home_page_title_as(String SFHomePageTitle) throws Throwable {
		String HomepageTitle = leads.getTitle();
		System.out.println(HomepageTitle);
		Assert.assertEquals(SFHomePageTitle, HomepageTitle);
		Thread.sleep(4000);

	}

	@Then("^Click Leads tab$")
	public void click_Leads_tab() throws Throwable {

		leads.leadTabClick();

//		Actions action = new Actions(driver);
//		WebElement leadtab = driver
//				.findElement(By.xpath("//span[contains(text(),'Leads') and @class='slds-truncate']"));
//		action.moveToElement(leadtab)
//				.moveToElement(
//						driver.findElement(By.xpath("//span[contains(text(),'Leads') and @class='slds-truncate']")))
//				.click().build().perform();

	}

	@Then("^Click on the new button$")
	public void click_on_the_new_button() throws Throwable {
		leads.newBtnClick();



	}

//	@Then("^Choose Location and Save$")
//	public void choose_Location_and_Save() {

//	}

	@Then("^Click on Next button$")
	public void click_on_Next_button() {
		leads.nextBtnClick();

	}

	@Then("^Populate the Search Criteria fields$")
	public void populate_the_Search_Criteria_fields() {

	}

	@Then("^Click Search$")
	public void click_Search() {

	}

}
