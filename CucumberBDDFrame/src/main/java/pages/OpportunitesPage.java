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
	By FirstSurveyAttemptDate = By.cssSelector("*[id^='865:'][id$='a']");
	By FirstSurveyAttemptDatePopulate = By.xpath("//table[@class='calGrid']//td");
	By WriteUpAmountInputField = By.cssSelector("*[id^='902:'][id$='a']");
	By CountryField = By.cssSelector("*[id^='940:'][id$='a']");
	By CustomerAppointmentDateAndTimeField = By.cssSelector("*[id^='1112:'][id$='a']");
	By CustomerAppointmentDateAndTimeCalender = By.xpath("//table[@class='calGrid']//td");
	By TypeDropDownFieldClick = By.cssSelector("*[aria-describedby^='1186:'][aria-describedby$='a-label']");
	By TypeDropDownFieldPopulate = By.xpath("//a[contains(text(),'New Business')]");
	By AppointmentCompletedDateField = By.cssSelector("*[id^='1232:'][id$='a']");
	By AppointmentCompletedDateFieldCalender = By.xpath("//table[@class='calGrid']//td");
	By CustomerDeliveryDateAndTimeField = By.cssSelector("*[id^='1335:'][id$='a']");
	By CustomerDeliveryDateAndTimeCalender = By.xpath("//table[@class='calGrid']//td");
	By FirstResponseTimeField = By.cssSelector("*[id^='1523:'][id$='a']");
	By FirstResponseTimeFieldCalender = By.xpath("//table[@class='calGrid']//td");
	By PDIPrintedDateAndTimeField = By.cssSelector("*[id^='1563:'][id$='a']");
	By PDIPrintedDateAndTimeCalender = By.xpath("//table[@class='calGrid']//td");
	By BusinessAdjustedCreatedDateField = By.cssSelector("*[id^='1633:'][id$='a']");
	By BusinessAdjustedCreatedDateCalender = By.xpath("//table[@class='calGrid']//td");
	By BusinessAdjustedCreatedDateEndField = By.cssSelector("*[id^='1687:'][id$='a']");
	By BusinessAdjustedCreatedDateEndCalender = By.xpath("//table[@class='calGrid']//td");
	By BusinessAdjustedCreatedDateStartField = By.cssSelector("*[id^='1741:'][id$='a']");
	By BusinessAdjustedCreatedDateStartCalender = By.xpath("//table[@class='calGrid']//td");
	By NewUsedYearToClick = By.cssSelector("*[aria-describedby^='1928:'][aria-describedby$='a-label']");
	By NewUsedYearToPopulate = By.xpath("//a[@title='New']");
	By FloorplanStyleClick = By.cssSelector("*[aria-describedby^='2654:'][aria-describedby$='a-label']");
	By FloorplanStylePopulate = By.xpath("//a[@title='Park Model']");
	By GeniusNotes1RVAttributes = By.cssSelector("*[id^='2750:'][id$='a']");
	By Notes2MeetAndGreetInput = By.cssSelector("*[id^='2798:'][id$='a']");
	By GeniusNotes3TradeNotesInputField = By.cssSelector("*[id^='2842:'][id$='a']");
	By NumSleepsInputField = By.cssSelector("*[id^='2886:'][id$='a']");
	By YearFromClick = By.cssSelector("*[aria-describedby^='1878:'][aria-describedby$='a-label']");
	By YearFromPopulate = By.xpath("//a[@title='2017']");
	By YearToClick = By.cssSelector("*[aria-describedby^='1974:'][aria-describedby$='a-label']");
	By YearToPopulate = By.xpath("//a[@title='2017']");
	By PriceFromClick = By.cssSelector("*[aria-describedby^='2100:'][aria-describedby$='a-label']");
	By PriceFromPopulate = By.xpath("//a[contains(text(),'6000')]");
	By PriceToClick = By.cssSelector("*[aria-describedby^='2226:'][aria-describedby$='a-label']");
	By PriceToPopulate = By.xpath("//a[contains(text(),'4,000')]");
	By PaymentFromClick = By.cssSelector("*[aria-describedby^='2352:'][aria-describedby$='a-label']");
	By PaymentFromPopulate = By.xpath("//a[@title='75']");
	By PaymentToClick = By.cssSelector("*[aria-describedby^='2478:'][aria-describedby$='a-label']");
	By PaymentToPopulate = By.xpath("//a[@title='100']");
	By LengthFromClick = By.cssSelector("*[aria-describedby^='2604:'][aria-describedby$='a-label']");
	By LengthFromPopulate = By.xpath("//a[@title='6 ft']");
	By LengthToClick = By.cssSelector("*[aria-describedby^='2700:'][aria-describedby$='a-label']");
	By LengthToPopulate = By.xpath("//a[@title='10 ft']");
	By NumberSlideOutsInputField = By.cssSelector("*[id^='2776:'][id$='a']");
	By InterestedTypeInputField = By.cssSelector("*[id^='2933:'][id$='a']");
	By InteriorColorInputField = By.cssSelector("*[id^='2949:'][id$='a']");
	By InterestedCategoryInputField = By.cssSelector("*[id^='2969:'][id$='a']");
	By ExteriorColorInputField = By.cssSelector("*[id^='2985:'][id$='a']");
	By InterestedYearInputField = By.cssSelector("*[id^='3005:'][id$='a']");
	By NumberDoorsInputField = By.cssSelector("*[id^='3021:'][id$='a']");
	By InterestedMakeInputField = By.cssSelector("*[id^='3043:'][id$='a']");
	By MileageInputField = By.cssSelector("*[id^='3059:'][id$='a']");
	By InterestedModelInputField = By.cssSelector("*[id^='3081:'][id$='a']");
	By VehicleOptionsInputField = By.cssSelector("*[id^='3097:'][id$='a']");
	By InterestedProductInput = By.cssSelector("*[id^='3117:'][id$='a']");

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

	// Click on the Expiration Date field
	public void expirationDate1() {
		$(ExpirationDate1).click();
	}

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

	// First Survey Attempt Date field
	public void firstSurveyAttemptDate() {
		$(FirstSurveyAttemptDate).click();
	}

	// First Survey Attempt Date field
	public void firstSurveyAttemptDatePopulate() {
		List<WebElement> firstSurveyAttemptDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node3 = firstSurveyAttemptDate.size();
		for (int i = 0; i < total_node3; i++) {
			String date = firstSurveyAttemptDate.get(i).getText();
			if (date.equals("25")) {
				firstSurveyAttemptDate.get(i).click();
				break;
			}
		}
	}

	// Write-Up Amount field
	public void writeUpAmountField(String WriteUpAmount) {
		$(WriteUpAmountInputField).sendKeys(WriteUpAmount);

	}

	// County field
	public void countryField(String County) {
		$(CountryField).sendKeys(County);

	}

	// Customer appointment Date and Time
	public void customerAppointmentDateAndTimeField() {
		$(CustomerAppointmentDateAndTimeField).click();
	}

	// Customer appointment Date and Time
	public void customerAppointmentDateAndTimeCalender() {
		List<WebElement> customerAppointmentDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node4 = customerAppointmentDate.size();
		for (int i = 0; i < total_node4; i++) {
			String date = customerAppointmentDate.get(i).getText();
			if (date.equals("25")) {
				customerAppointmentDate.get(i).click();
				break;
			}
		}
	}

	// Type Drop down field
	public void typeDropDownField() {
		$(TypeDropDownFieldClick).click();
	}

	// Type Drop down field selected
	public void typeDropDownFieldPopulate() {
		$(TypeDropDownFieldPopulate).click();
	}

	// Appointment completed Date
	public void AppointmentCompletedDateField() {
		$(AppointmentCompletedDateField).click();
	}

	// Appointment completed Date
	public void appointmentCompletedDateFieldCalender() {
		List<WebElement> appointmentCompletedDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node5 = appointmentCompletedDate.size();
		for (int i = 0; i < total_node5; i++) {
			String date = appointmentCompletedDate.get(i).getText();
			if (date.equals("25")) {
				appointmentCompletedDate.get(i).click();
				break;
			}
		}
	}

	// CustomerDelivery Date and Time
	public void customerDeliveryDateAndTime() {
		$(CustomerDeliveryDateAndTimeField).click();
	}

	// CustomerDelivery Date and Time
	public void customerDeliveryDateAndTimeCalender() {
		List<WebElement> CustomerDelivery = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node6 = CustomerDelivery.size();
		for (int i = 0; i < total_node6; i++) {
			String date = CustomerDelivery.get(i).getText();
			if (date.equals("25")) {
				CustomerDelivery.get(i).click();
				break;
			}
		}
	}

	// FirstResponseTime
	public void firstResponseTimeField() {
		$(FirstResponseTimeField).click();
	}

	// FirstResponseTime
	public void FirstResponseTimeFieldCalender() {
		List<WebElement> FirstResponseTime = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node7 = FirstResponseTime.size();
		for (int i = 0; i < total_node7; i++) {
			String date = FirstResponseTime.get(i).getText();
			if (date.equals("25")) {
				FirstResponseTime.get(i).click();
				break;
			}
		}
	}

	// PDIPrinted Date and Time
	public void pdiPrintedDateAndTimeField() {
		$(PDIPrintedDateAndTimeField).click();
	}
	// PDIPrinted Date and Time

	public void PDIPrintedDateAndTimeCalender() {
		List<WebElement> PDIPrinted = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node8 = PDIPrinted.size();
		for (int i = 0; i < total_node8; i++) {
			String date = PDIPrinted.get(i).getText();
			if (date.equals("25")) {
				PDIPrinted.get(i).click();
				break;
			}
		}
	}

	// BusinessAdjustedCreatedDate
	public void businessAdjustedCreatedDateField() {
		$(BusinessAdjustedCreatedDateField).click();
	}

	// BusinessAdjustedCreatedDate
	public void BusinessAdjustedCreatedDateCalender() {
		List<WebElement> BusinessAdjustedCreatedDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node9 = BusinessAdjustedCreatedDate.size();
		for (int i = 0; i < total_node9; i++) {
			String date = BusinessAdjustedCreatedDate.get(i).getText();
			if (date.equals("25")) {
				BusinessAdjustedCreatedDate.get(i).click();
				break;
			}
		}
	}

	// BusinessAdjustedCreatedDate
	public void businessAdjustedCreatedDateEndField() {
		$(BusinessAdjustedCreatedDateEndField).click();
	}

	// BusinessAdjustedCreatedDateEnd
	public void BusinessAdjustedCreatedDateEndCalender() {
		List<WebElement> BusinessAdjustedCreatedDateEnd = driver
				.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node10 = BusinessAdjustedCreatedDateEnd.size();
		for (int i = 0; i < total_node10; i++) {
			String date = BusinessAdjustedCreatedDateEnd.get(i).getText();
			if (date.equals("25")) {
				BusinessAdjustedCreatedDateEnd.get(i).click();
				break;
			}
		}
	}

	// BusinessAdjustedCreatedDate
	public void businessAdjustedCreatedDateStartField() {
		$(BusinessAdjustedCreatedDateStartField).click();

	}

	// BusinessAdjustedCreatedDateEnd
	public void BusinessAdjustedCreatedDateStartCalender() {
		List<WebElement> BusinessAdjustedCreatedDateStart = driver
				.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node11 = BusinessAdjustedCreatedDateStart.size();
		for (int i = 0; i < total_node11; i++) {
			String date = BusinessAdjustedCreatedDateStart.get(i).getText();
			if (date.equals("25")) {
				BusinessAdjustedCreatedDateStart.get(i).click();
				break;
			}
		}
	}

	// New/Used - Year To
	public void newUsedYearToClick() {
		$(NewUsedYearToClick).click();

	}

	// New/Used - Year To
	public void newUsedYearToPopulate() {
		driver.findElements(By.xpath("//a[@title='New']")).get(1).click();

	}

	// Floorplan Style
	public void floorplanStyleClick() {
		$(FloorplanStyleClick).click();

	}

	// Floorplan Style
	public void floorplanStylePopulate() {
		$(FloorplanStylePopulate).click();

	}

	// Genius Notes 1 (RV Attributes)
	public void geniusNotes1RVAttributes(String GeniusNotes1) {
		$(GeniusNotes1RVAttributes).sendKeys(GeniusNotes1);

	}

	// Notes 2 (Meet & Greet)
	public void note2MeetAndGreet(String Notes2MeetAndGreet) {
		$(Notes2MeetAndGreetInput).sendKeys(Notes2MeetAndGreet);
	}

	// Genius Notes 3 (Trade Notes)
	public void geniusNotes3TradeNotesInputField(String GeniusNotes3TradeNotes) {
		$(GeniusNotes3TradeNotesInputField).sendKeys(GeniusNotes3TradeNotes);
	}

	// # Sleeps
	public void numberSleep(String NumSleeps) {
		$(NumSleepsInputField).sendKeys(NumSleeps);

	}

	// Year From
	public void yearFromClick() {
		$(YearFromClick).click();

	}

	// Year From
	public void yearFromPopulate() {
		$(YearFromPopulate).click();

	}

	// Year To field click
	public void yearToClick() {
		$(YearToClick).click();

	}

	// Year To field populate
	public void yearToPopulate() {
		driver.findElements(By.xpath("//a[@title='2017']")).get(1).click();

	}

	// Price From
	public void priceFromClick() {
		$(PriceFromClick).click();

	}

	// Price From
	public void PriceFromPopulate() {
		$(PriceFromPopulate).click();

	}

	// Price To Click
	public void priceToClick() {
		$(PriceToClick).click();

	}

	// Price To Populate
	public void PriceToPopulate() {
		$(PriceToPopulate).click();

	}

	// Payment From click on it
	public void paymentFromClick() {
		$(PaymentFromClick).click();

	}

	// Payment From populated
	public void paymentFromPopulate() {
		$(PaymentFromPopulate).click();

	}

	// Payment To
	public void paymentToClick() {
		$(PaymentToClick).click();

	}

	// Payment To
	public void paymentToPopulate() {
		$(PaymentToPopulate).click();

	}

	// click on the Length From field
	public void lengthFromClick() {
		$(LengthFromClick).click();

	}

	// Populate the Length From field
	public void lengthFromPopulate() {
		driver.findElements(By.xpath("//a[@title='6 ft']")).get(0).click();

	}

	// click on the Length To field
	public void lengthToClick() {
		$(LengthToClick).click();

	}

	// Populate the Length To field
	public void lengthToPopulate() {
		$(LengthToClick).click();

	}

	// # Slide Outs
	public void numberSlideOutsInputField() {
		$(NumberSlideOutsInputField).click();

	}

	// Interested Type
	public void interestedTypeInputField(String InterestedType) {
		$(InterestedTypeInputField).sendKeys(InterestedType);

	}

	// Interior Color
	public void interiorColorInputField(String InteriorColor) {
		$(InteriorColorInputField).sendKeys(InteriorColor);

	}

	// Interested Category
	public void interestedCategoryInputField(String IntrestedCategory) {
		$(InterestedCategoryInputField).sendKeys(IntrestedCategory);

	}

	// Exterior Color
	public void exteriorColorInputField(String ExteriorColor) {
		$(ExteriorColorInputField).sendKeys(ExteriorColor);

	}

	// Interested Year
	public void interestedYear(String InterestedYear) {
		$(InterestedYearInputField).sendKeys(InterestedYear);

	}

	// # Doors
	public void numberDoors(String Doors) {
		$(NumberDoorsInputField).sendKeys(Doors);

	}

	// # Interested Make Input Field
	public void interestedMakeInputField(String InterestedMake) {
		$(InterestedMakeInputField).sendKeys(InterestedMake);

	}

	// MileageInputField
	public void mileageInputField(String Mileage) {
		$(MileageInputField).sendKeys(Mileage);

	}

	// InterestedModel
	public void interestedModelInputField(String IntrestedModel) {
		$(InterestedModelInputField).sendKeys(IntrestedModel);

	}

	// Vehicle Options
	public void vehicleOptionsInputField(String VehicleOptions) {
		$(VehicleOptionsInputField).sendKeys(VehicleOptions);

	}

	// Interested Product
	public void interestedProductInput(String IntrestedProduct) {
		$(InterestedProductInput).sendKeys(IntrestedProduct);

	}

}