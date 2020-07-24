package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class OpportunitesPage extends BasePageTest {

	By userNameField = By.id("username");
	By passwordField = By.id("password");
	By LogInToSandboxBtn = By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']");
	By ClickOnOpportunityTab1 = By.xpath("//a[@title='Opportunities']");
	By NewButton = By.xpath("//div[@title='New']");
	By NextBtn = By.xpath("//span[contains(text(),'Next')]");
	By WorkSheetIDInputField = By.cssSelector("*[id^='57:'][id$='a']");
	By DateAndTimeCalendar1 = By.cssSelector("*[id^='11:'][id$='a']");
	By DateAndTimeCalendar2 = By.xpath("//table[@class='calGrid']//td");
	By PromoMessageInputField = By.cssSelector("*[id^='77:'][id$='a']");
	By ExpirationDate1 = By.cssSelector("*[id^='121:'][id$='a']");
	By ExpirationDate2 = By.xpath("//table[@class='calGrid']//td");
	By ELeadCheatCheckBox = By.cssSelector("*[id^='172:'][id$='a']");
	By opportunityNameInput = By.cssSelector("*[id^='217:'][id$='a']");
	By AmountInputField = By.cssSelector("*[id^='233:'][id$='a']");
	By AccountNameSearchField1 = By.cssSelector("*[id^='302:'][id$='a']");
	By AccountNameSearchFieldPopulat = By.xpath("//div[contains(text(),'Automation1')]");
	By CloseDateClick = By.cssSelector("*[id^='378:'][id$='a']");
	By CloseDateCalender = By.xpath("//table[@class='calGrid']//td");
	By StageClick = By.xpath("//a[@class='select']");
	By StageValueSelected = By.xpath("//a[contains(text(),'In-Process')]");
	By NicknameInputField = By.cssSelector("*[id^='558:'][id$='a']");
	By ProbabilityInputField = By.cssSelector("*[id^='676:'][id$='a']");
	By OpportunitySellingOwnerNamefield = By.cssSelector("*[id^='708:'][id$='a']");
	By DroppedDealershipfield = By.cssSelector("*[id^='724:'][id$='a']");
	By IDSCustomerNumber = By.cssSelector("*[id^='754:'][id$='a']");
	By IDSFIQuoteNumber = By.cssSelector("*[id^='798:'][id$='a']");
	By ReviewRequestedDate = By.cssSelector("*[id^='824:'][id$='a']");
	By ReviewRequestedDatePopulated = By.xpath("//table[@class='calGrid']//td");

	public void userNamefield(String username) {
		$(userNameField).sendKeys(username);
	}

	public void passwordField(String password) {
		$(passwordField).sendKeys(password);
	}

	public void LogInToSandboxBtn() {
		$(LogInToSandboxBtn).click();
	}

	public void clickOnOpportunityTab() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", $(ClickOnOpportunityTab1));

	}

	public void clickOnNewBtn() {
		waitForElementToBeClickable(NewButton);
		$(NewButton).click();
	}

	public void clickOnNextBtn() {
		waitForElementToBeClickable(NextBtn);
		$(NextBtn).click();
	}

	public void workSheetIDInputField(String WorksheetID) {
		$(WorkSheetIDInputField).sendKeys(WorksheetID);

	}

	public void dateAndTimeCalender1() {
		$(DateAndTimeCalendar1).click();
	}

	public void dateAndTimeCalender2() {
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node = dates.size();
		for (int i = 0; i < total_node; i++) {
			String date = dates.get(i).getText();
			if (date.equals("25")) {
				dates.get(i).click();
				break;
			}
		}
	}

	public void promoMessageInputField(String PromoMessage) {
		$(PromoMessageInputField).sendKeys(PromoMessage);

	}

	public void expirationDate1() {
		$(ExpirationDate1).click();
	}

	// Expiration Date
	public void expirationDate2() {
		List<WebElement> expirationDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node2 = expirationDate.size();
		for (int i = 0; i < total_node2; i++) {
			String date = expirationDate.get(i).getText();
			if (date.equals("30")) {
				expirationDate.get(i).click();
				break;
			}
		}
	}

	public void eLeadCheatCheckBox() {
		waitForElementToBeClickable(ELeadCheatCheckBox);
		$(ELeadCheatCheckBox).click();

	}

	public void opportunityName(String OpportunityName) {
		$(opportunityNameInput).sendKeys(OpportunityName);
	}

	// Amount field
	public void amountInputField(String Amount) {
		$(AmountInputField).sendKeys(Amount);
	}

	// Account Name search field
	public void accountNameSearchField() {
		$(AccountNameSearchField1).click();
	}

	// Populate Account Name field
	public void accountNameSearchFieldPopulated() {
		$(AccountNameSearchFieldPopulat).click();
	}

	// Clicking on the Close Date field
	public void closeDateClick() {
		$(CloseDateClick).click();
	}

	// Close Date
	public void closeDate() {
		List<WebElement> closeDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node = closeDate.size();
		for (int i = 0; i < total_node; i++) {
			String date = closeDate.get(i).getText();
			if (date.equals("29")) {
				closeDate.get(i).click();
				break;
			}
		}
	}

	// Clicking on the Stage field
	public void stageClick() {
		$(StageClick).click();
	}

	// Populate the Stage field
	public void stageSelect() {
		$(StageValueSelected).click();
	}

	// Nickname field
	public void nickNameInputField(String Nickname) {
		$(NicknameInputField).sendKeys(Nickname);
	}

	// Probability % field
	public void probabilityInputField(String Probability) {
		$(ProbabilityInputField).sendKeys(Probability);
	}

	// Opportunity Selling Owner Name field
	public void opportunitySellingOwnerName(String OpportunitySellingOwnerName) {
		$(OpportunitySellingOwnerNamefield).sendKeys(OpportunitySellingOwnerName);
	}

	// Dropped Dealership field
	public void droppedDealershipfield(String DroppedDealership) {
		$(DroppedDealershipfield).sendKeys(DroppedDealership);
	}

	// IDS Customer# field
	public void idsCustomerNumberfield(String IDSCustomerNum) {
		$(IDSCustomerNumber).sendKeys(IDSCustomerNum);

	}
	
	// IDS Customer# field
		public void iDSFIQuoteNumberField(String IDSFIQuoteNum) {
			$(IDSFIQuoteNumber).sendKeys(IDSFIQuoteNum);

		}
	
		
		// Clicking on the Review Requested Date field
		public void reviewRequestedClick() {
			$(ReviewRequestedDate).click();
		}

		// Review Requested Date field
		public void ReviewRequestedDatePopulated() {
			List<WebElement> requestedDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
			int total_node = requestedDate.size();
			for (int i = 0; i < total_node; i++) {
				String date = requestedDate.get(i).getText();
				if (date.equals("29")) {
					requestedDate.get(i).click();
					break;
				}
			}
		}

}