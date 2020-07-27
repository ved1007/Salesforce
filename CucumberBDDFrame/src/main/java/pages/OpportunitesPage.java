package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;

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
	By AppointmentSetCheckbox = By.xpath("*[id^='1375:'][id$='a']");
	By DeliverySetCheckbox = By.xpath("*[id^='1471:'][id$='a']");
	By ContactedCheckBox = By.xpath("*[id^='1507:'][id$='a']");
	By UpAssignedCheckbox = By.xpath("*[id^='1487:'][id$='a']");
	By RepliedCheckBox = By.xpath("*[id^='1599:'][id$='a']");
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
//	By PriceFromClick = By.cssSelector("*[aria-describedby^='2100:'][aria-describedby$='a-label']");
//	By PriceFromPopulate = By.xpath("//a[contains(text(),'6000')]");
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
	By InterestLevelDropdownClick = By.cssSelector("*[aria-describedby^='3133:'][aria-describedby$='a-label']");
	By InterestLevelDropdownPopulate = By.xpath("//a[@title='Highly Interested']");
	By VehicleTrimInputField = By.cssSelector("*[id^='3183:'][id$='a']");
	By BuyingHorizonInputField = By.cssSelector("*[id^='3199:'][id$='a']");
	By VehicleEngineInputField = By.cssSelector("*[id^='3219:'][id$='a']");
	By PaymentMethodDropdownClick = By.cssSelector("*[aria-describedby^='3235:'][aria-describedby$='a-label']");
	By PaymentMethodDropdownPopulate = By.xpath("//a[@title='Finance']");
	By ChassisDropdownClick = By.cssSelector("*[aria-describedby^='3285:'][aria-describedby$='a-label']");
	By ChassisDropdownPopulate = By.xpath("//a[@title='Chevrolet Express 3500']");
	By PaymentDetailsInput = By.cssSelector("*[id^='3331:'][id$='a']");
	By TransmissionField = By.cssSelector("*[id^='3351:'][id$='a']");
	By VehiclePricingField = By.cssSelector("*[id^='3367:'][id$='a']");
	By InterestedStockField = By.cssSelector("*[id^='3387:'][id$='a']");
	By VehicleCommentsField = By.cssSelector("*[id^='3403:'][id$='a']");
	By InterestedIdField = By.cssSelector("*[id^='3423:'][id$='a']");
	By WebpageField = By.cssSelector("*[id^='3439:'][id$='a']");
	By TowVehicleYearField = By.cssSelector("*[id^='3869:'][id$='a']");
	By MaxTowingCapacityField = By.cssSelector("*[id^='3887:'][id$='a']");
	By TowVehicleMakeField = By.cssSelector("*[id^='3909:'][id$='a']");
	By TowVehicleModelField = By.cssSelector("*[id^='3943:'][id$='a']");
	By TowVehicleVINField = By.cssSelector("*[id^='3959:'][id$='a']");
	By TowVehicleTrimField = By.cssSelector("*[id^='3979:'][id$='a']");
	By TowVehicleStyleField = By.cssSelector("*[id^='4013:'][id$='a']");
	By CurrentOwnerCategoryField = By.cssSelector("*[id^='4058:'][id$='a']");
	By CurrentOwnedMileageField = By.cssSelector("*[id^='4074:'][id$='a']");
	By CurrentOwnedYearField = By.cssSelector("*[id^='4096:'][id$='a']");
	By CurrentOwnedPayoffField = By.cssSelector("*[id^='4112:'][id$='a']");
	By CurrentOwnedMakeField = By.cssSelector("*[id^='4134:'][id$='a']");
	By CurrentOwnedQuoteLowField = By.cssSelector("*[id^='4150:'][id$='a']");
	By CurrentOwnedProductField = By.cssSelector("*[id^='4172:'][id$='a']");
	By CurrentOwnedModelField = By.cssSelector("*[id^='4210:'][id$='a']");
	By CurrentOwnedQuoteHighField = By.cssSelector("*[id^='4188:'][id$='a']");
	By CurrentOwnedTrimField = By.cssSelector("*[id^='4246:'][id$='a']");
	By CurrentOwnedQuoteDetailsField = By.cssSelector("*[id^='4226:'][id$='a']");
	By CurrentOwnedLengthField = By.cssSelector("*[id^='4282:'][id$='a']");
	By CurrentOwnedCommentsField = By.cssSelector("*[id^='4262:'][id$='a']");
	By CurrentOwnedEngineField = By.cssSelector("*[id^='4318:'][id$='a']");
	By CurrentOwnedConditionField = By.cssSelector("*[id^='4298:'][id$='a']");
	By CurrentOwnedIDField = By.cssSelector("*[id^='4334:'][id$='a']");
	By CurrentOwnedOptionsField = By.cssSelector("*[id^='4354:'][id$='a']");
	By LeadPhoneField = By.cssSelector("*[id^='4399:'][id$='a']");
	By LeadEmailField = By.cssSelector("*[id^='4415:'][id$='a']");
	By LeadMobilePhoneField = By.cssSelector("*[id^='4435:'][id$='a']");
	By LeadScoreField = By.cssSelector("*[id^='4451:'][id$='a']");
	By LeadOtherPhoneField = By.cssSelector("*[id^='4473:'][id$='a']");
	By LeadWorkPhoneField = By.cssSelector("*[id^='4507:'][id$='a']");
	By LeadMessageField = By.cssSelector("*[aria-labelledby^='label-4545:'][aria-labelledby$='a']");
	By EndVisitNotesField = By.cssSelector("*[data-aura-rendered-by^='4615:'][data-aura-rendered-by$='a']");
	By SourceField = By.cssSelector("*[id^='4652:'][id$='a']");
	By LeadSourceDropDownClick = By.cssSelector("*[aria-describedby^='4748:'][aria-describedby$='a-label']");
	By LeadSourceDropDownPopulate = By.xpath("//a[@title='Internet']");
	By FormNameField = By.cssSelector("*[id^='4794:'][id$='a']");
	By WebLeadSoureDetailDropDownClick = By.cssSelector("*[aria-describedby^='4814:'][aria-describedby$='a-label']");
	By WebLeadSoureDetailDropDownPopulate = By.xpath("//a[@title='Dealer Website']");
	By TrackingMediumField = By.cssSelector("*[id^='4860:'][id$='a']");
	By TrackingSCPCField = By.cssSelector("*[id^='4956:'][id$='a']");
	By WebLeadSourceNameField = By.cssSelector("*[id^='4976:'][id$='a']");
	By DiscriptionField = By.cssSelector("*[id^='5468:'][id$='a']");
	By PriceDropDownClick = By.cssSelector("*[aria-describedby^='5488:'][aria-describedby$='a-label']");
	By PriceDropDownPopulate = By.xpath("//a[@title='$15,000 to $30,000']");
	By PrimaryEmailField = By.cssSelector("*[id^='5863:'][id$='a']");
	By PrimaryPhoneField = By.cssSelector("*[id^='5897:'][id$='a']");
	By LeadIPAddressField = By.cssSelector("*[id^='5945:'][id$='a']");
	By LeadSystemDataField = By.cssSelector("*[id^='5979:'][id$='a']");
	By CategoryDropDownClick = By.cssSelector("*[aria-describedby^='6049:'][aria-describedby$='a-label']");
	By CategoryDropDownPopulate = By.xpath("//a[@title='Camping Trailer']");
	By TrackingIDField = By.cssSelector("*[id^='6138:'][id$='a']");
	By TrackingLandingPageURLField = By.cssSelector("*[id^='6174:'][id$='a']");
	By TrackingReferralURLField = By.cssSelector("*[id^='6211:'][id$='a']");
	By TrackingPromoCodeField = By.cssSelector("*[id^='6248:'][id$='a']");
	By NextStepField = By.cssSelector("*[id^='6264:'][id$='a']");
	By TrackingCampaignField = By.cssSelector("*[id^='6284:'][id$='a']");
	By TrackingSourceField = By.cssSelector("*[id^='6318:'][id$='a']");
	By TrackingContentField = By.cssSelector("*[id^='6352:'][id$='a']");
	By TrackingKeywordsField = By.cssSelector("*[id^='6448:'][id$='a']");
	By BackendGPField = By.cssSelector("*[id^='6496:'][id$='a']");
	By ADCampaignField = By.cssSelector("*[id^='6518:'][id$='a']");
	By ADGroupField = By.cssSelector("*[id^='6552:'][id$='a']");
	By ADKeywordField = By.cssSelector("*[id^='6586:'][id$='a']");
	By ADSlotField = By.cssSelector("*[id^='6620:'][id$='a']");
	By ADSlotPositionField = By.cssSelector("*[id^='6654:'][id$='a']");
	By ADContentField = By.cssSelector("*[id^='6688:'][id$='a']");
	By ClicktheSavebutton = By.cssSelector("*[data-aura-rendered-by^='9211:'][data-aura-rendered-by$='a']");

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

	// Appointment Set checkbox
	public void appointmentSetCheckbox() {
		$(AppointmentSetCheckbox).click();
	}

	// Delivery Set checkbox
	public void deliverySetCheckbox() {
		$(DeliverySetCheckbox).click();
	}

	// Contacted
	public void contactedCheckBox() {
		$(ContactedCheckBox).click();
	}

	// Up Assigned checkbox
	public void upAssignedCheckbox() {
		$(UpAssignedCheckbox).click();
	}

	// Replied
	public void repliedCheckBox() {
		$(RepliedCheckBox).click();
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
		driver.findElements(By.xpath("//a[@title='New']")).get(2).click();

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

//	// Price From
//	public void priceFromClick() {
//		$(PriceFromClick).click();
//
//	}
//
//	// Price From
//	public void PriceFromPopulate() {
//		$(PriceFromPopulate).click();
//
//	}

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

		driver.findElements(By.xpath("//a[@title='100']")).get(1).click();

	}

	// click on the Length From field
	public void lengthFromClick() {
		$(LengthFromClick).click();

	}

	// Populate the Length From field
	public void lengthFromPopulate() {
		driver.findElements(By.xpath("//a[@title='6 ft']")).get(0).click();

	}

	// Length To field click
	public void lengthToClick() {
		$(LengthToClick).click();

	}

	// Length To field populate
	public void lengthToPopulate() {
		driver.findElements(By.xpath("//a[@title='10 ft']")).get(1).click();

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

	// Interest Level Click

	public void iNterestLevelDropdownClick() {
		$(InterestLevelDropdownClick).click();

	}
	// Interest Level Populate

	public void iNterestLevelDropdownPopulate() {
		$(InterestLevelDropdownPopulate).click();

	}

	// Vehicle Trim
	public void vehicleTrim(String VehicleTrim) {
		$(VehicleTrimInputField).sendKeys(VehicleTrim);

	}

	// Buying Horizon
	public void buyingHorizon(String BuyingHorizon) {
		$(BuyingHorizonInputField).sendKeys(BuyingHorizon);

	}

	// Vehicle Engine
	public void vehicleEngine(String VehicleEngine) {
		$(VehicleEngineInputField).sendKeys(VehicleEngine);

	}

	// Payment Method Click

	public void paymentMethodDropdownClick() {
		$(PaymentMethodDropdownClick).click();

	}
	// Payment Method Populate

	public void paymentMethodDropdownPopulate() {
		$(PaymentMethodDropdownPopulate).click();

	}

	// Chassis dropdown Click
	public void chassisDropdownClick() {
		$(ChassisDropdownClick).click();

	}

	// Chassis dropdown Populate
	public void chassisDropdownPopulate() {
		$(ChassisDropdownPopulate).click();

	}

	// Payment Details
	public void paymentDetailsInput(String PaymentDetails) {
		$(PaymentDetailsInput).sendKeys(PaymentDetails);

	}

	// Transmission
	public void transmissionField(String Transmission) {
		$(TransmissionField).sendKeys(Transmission);
	}

	// Vehicle pricing
	public void vehiclePricingField(String VehiclePricing) {
		$(VehiclePricingField).sendKeys(VehiclePricing);
	}

	// Interested Stock
	public void interestedStockField(String InterestedStock) {
		$(InterestedStockField).sendKeys(InterestedStock);
	}

	// Vehicle Comments
	public void vehicleCommentsField(String VehicleComments) {
		$(VehicleCommentsField).sendKeys(VehicleComments);
	}

	// Interested Id
	public void interestedIdField(String IntrestedID) {
		$(InterestedIdField).sendKeys(IntrestedID);
	}

	// Webpage
	public void webpageField(String webpage) {
		$(WebpageField).sendKeys(webpage);
	}

	// Tow Vehicle Year
	public void towVehicleYearField(String TowVehicleYear) {
		$(TowVehicleYearField).sendKeys(TowVehicleYear);
	}

	// Max Towing Capacity
	public void maxTowingCapacityField(String MaxTowingCapacity) {
		$(MaxTowingCapacityField).sendKeys(MaxTowingCapacity);
	}

	// Tow Vehicle Make
	public void towVehicleMakeField(String TowVehicleMake) {
		$(TowVehicleMakeField).sendKeys(TowVehicleMake);
	}

	// Tow Vehicle Model
	public void towVehicleModelField(String TowVehicleModel) {
		$(TowVehicleModelField).sendKeys(TowVehicleModel);
	}

	// Tow Vehicle VIN
	public void towVehicleVINField(String TowVehicleVIN) {
		$(TowVehicleVINField).sendKeys(TowVehicleVIN);
	}

	// Tow Vehicle Trim
	public void towVehicleTrimField(String TowVehicleTrim) {
		$(TowVehicleTrimField).sendKeys(TowVehicleTrim);
	}

	// Tow Vehicle Style
	public void towVehicleStyleField(String TowVehicleStyle) {
		$(TowVehicleStyleField).sendKeys(TowVehicleStyle);
	}

	// Current Owner Category
	public void currentOwnerCategoryField(String CurrentOwnerCategory) {
		$(CurrentOwnerCategoryField).sendKeys(CurrentOwnerCategory);
	}

	// Current Owned Mileage
	public void currentOwnedMileageField(String CurrentOwnedMileage) {
		$(CurrentOwnedMileageField).sendKeys(CurrentOwnedMileage);
	}

	// Current Owned Year
	public void currentOwnedYearField(String CurrentOwnedYear) {
		$(CurrentOwnedYearField).sendKeys(CurrentOwnedYear);
	}

	// Current Owned Payoff
	public void currentOwnedPayoffField(String CurrentOwnedPayoff) {
		$(CurrentOwnedPayoffField).sendKeys(CurrentOwnedPayoff);
	}

	// Current Owned Make
	public void currentOwnedMakeField(String CurrentOwnedMake) {
		$(CurrentOwnedMakeField).sendKeys(CurrentOwnedMake);
	}

	// Current Owned Quote Low
	public void currentOwnedQuoteLowField(String CurrentOwnedQuoteLow) {
		$(CurrentOwnedQuoteLowField).sendKeys(CurrentOwnedQuoteLow);
	}

	// Current Owned Product
	public void currentOwnedProductField(String CurrentOwnedProduct) {
		$(CurrentOwnedProductField).sendKeys(CurrentOwnedProduct);
	}

	// Current Owned Model
	public void currentOwnedModelField(String CurrentOwnedModel) {
		$(CurrentOwnedModelField).sendKeys(CurrentOwnedModel);
	}

	// Current Owned Quote High
	public void currentOwnedQuoteHighField(String CurrentOwnedQuoteHigh) {
		$(CurrentOwnedQuoteHighField).sendKeys(CurrentOwnedQuoteHigh);
	}

	// Current Owned Trim
	public void currentOwnedTrimField(String CurrentOwnedTrim) {
		$(CurrentOwnedTrimField).sendKeys(CurrentOwnedTrim);
	}

	// Current Owned Quote Details
	public void currentOwnedQuoteDetailsField(String CurrentOwnedQuoteDetails) {
		$(CurrentOwnedQuoteDetailsField).sendKeys(CurrentOwnedQuoteDetails);
	}

	// Current Owned Length
	public void currentOwnedLengthField(String CurrentOwnedLength) {
		$(CurrentOwnedLengthField).sendKeys(CurrentOwnedLength);
	}

	// Current Owned Comments
	public void currentOwnedCommentsField(String CurrentOwnedComments) {
		$(CurrentOwnedCommentsField).sendKeys(CurrentOwnedComments);
	}

	// Current Owned Engine
	public void currentOwnedEngineField(String CurrentOwnedEngine) {
		$(CurrentOwnedEngineField).sendKeys(CurrentOwnedEngine);
	}

	// Current Owned Condition
	public void currentOwnedConditionField(String CurrentOwnedCondition) {
		$(CurrentOwnedConditionField).sendKeys(CurrentOwnedCondition);
	}

	// Current Owned ID
	public void currentOwnedIDField(String CurrentOwnedID) {
		$(CurrentOwnedIDField).sendKeys(CurrentOwnedID);
	}

	// Current Owned Options
	public void currentOwnedOptionsField(String CurrentOwnedOptions) {
		$(CurrentOwnedOptionsField).sendKeys(CurrentOwnedOptions);
	}

	// Lead Phone
	public void leadPhoneField(String LeadPhone) {
		$(LeadPhoneField).sendKeys(LeadPhone);
	}

	// Lead Email
	public void leadEmailField(String LeadEmail) {
		$(LeadEmailField).sendKeys(LeadEmail);
	}

	// Lead Mobile Phone
	public void leadMobilePhoneField(String LeadMobilePhone) {
		$(LeadMobilePhoneField).sendKeys(LeadMobilePhone);
	}

	// Lead Score
	public void leadScoreField(String LeadScore) {
		$(LeadScoreField).sendKeys(LeadScore);
	}

	// Lead other Phone
	public void leadOtherPhoneField(String LeadOtherPhone) {
		$(LeadOtherPhoneField).sendKeys(LeadOtherPhone);
	}

	// Lead Work Phone
	public void leadWorkPhoneField(String LeadWorkPhone) {
		$(LeadWorkPhoneField).sendKeys(LeadWorkPhone);
	}

	// Lead Message
	public void leadMessageField(String LeadMessage) {
		$(LeadMessageField).sendKeys(LeadMessage);
	}

	// End Visit Notes
	public void endVisitNotesField(String EndViditNotes) {
		$(EndVisitNotesField).sendKeys(EndViditNotes);
	}

	// Source
	public void sourceField(String Source) {
		$(SourceField).sendKeys(Source);
	}

	// Lead Source drop down click
	public void leadSourceDropDownClick() {
		$(LeadSourceDropDownClick).click();
	}

	// Lead Source drop down populate
	public void leadSourceDropDownPopulate() {
		$(LeadSourceDropDownPopulate).click();
	}

	// FormName
	public void FormNameField(String FormName) {
		$(FormNameField).sendKeys(FormName);
	}

	// Web Lead Source Detail drop down click
	public void webLeadSoureDetailDropDownClick() {
		$(WebLeadSoureDetailDropDownClick).click();

	}

	// Web Lead Source Detail drop down populate
	public void WebLeadSoureDetailDropDownPopulate() {
		$(WebLeadSoureDetailDropDownPopulate).click();

	}

	// Tracking Medium
	public void trackingMediumField(String TrackingMedium) {
		$(TrackingMediumField).sendKeys(TrackingMedium);
	}

	// Tracking SCPC
	public void trackingSCPCField(String TrackingSCPC) {
		$(TrackingSCPCField).sendKeys(TrackingSCPC);
	}

	// Web Lead Source Name
	public void webLeadSourceNameField(String WebLeadSourceName) {
		$(WebLeadSourceNameField).sendKeys(WebLeadSourceName);
	}

	// eLead Create Date
	public void eLeadCreateDateCalender() {
		driver.findElement(By.cssSelector("*[id^='5430:'][id$='a']")).click();
		List<WebElement> eLeadCreatedDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node = eLeadCreatedDate.size();
		for (int i = 0; i < total_node; i++) {
			String date = eLeadCreatedDate.get(i).getText();
			if (date.equals("27")) {
				eLeadCreatedDate.get(i).click();
				break;
			}

		}

	}

	// Description
	public void discriptionField(String Discription) {
		$(DiscriptionField).sendKeys(Discription);
	}

	// Price drop down click
	public void priceDropDownClick() {
		$(PriceDropDownClick).click();

	}

	// Price drop down populate
	public void priceDropDownPopulate() {
		$(PriceDropDownPopulate).click();

	}

	// Primary Email
	public void primaryEmailField(String PrimaryEmail) {
		$(PrimaryEmailField).sendKeys(PrimaryEmail);
	}

	// Primary Phone
	public void primaryPhoneField(String PrimaryPhone) {
		$(PrimaryPhoneField).sendKeys(PrimaryPhone);
	}

	// Lead Ip Address
	public void leadIPAddressField(String LeadIPAddress) {
		$(LeadIPAddressField).sendKeys(LeadIPAddress);
	}

	// Lead System Data
	public void leadSystemDataField(String LeadSystemData) {
		$(LeadSystemDataField).sendKeys(LeadSystemData);
	}

	// Category drop down click
	public void categoryDropDownClick() {
		$(CategoryDropDownClick).click();
	}

	// Category drop down populate
	public void categoryDropDownPopulate() {
		$(CategoryDropDownPopulate).click();
	}

	// Tracking Id
	public void trackingIDField(String TrackingID) {
		$(TrackingIDField).sendKeys(TrackingID);
	}

	// Tracking LandingPage URL
	public void trackingLandingPageURLField(String TrackingLandingPageURL) {
		$(TrackingLandingPageURLField).sendKeys(TrackingLandingPageURL);
	}

	// Tracking Referral URL
	public void trackingReferralURLField(String TrackingReferralURL) {
		$(TrackingReferralURLField).sendKeys(TrackingReferralURL);
	}

	// Tracking Promo Code
	public void trackingPromoCodeField(String TrackingPromoCode) {
		$(TrackingPromoCodeField).sendKeys(TrackingPromoCode);
	}

	// Next Step
	public void nextStepField(String NextStep) {
		$(NextStepField).sendKeys(NextStep);
	}

	// Tracking Campaign
	public void trackingCampaignField(String TrackingCampaign) {
		$(TrackingCampaignField).sendKeys(TrackingCampaign);
	}

	// Tracking Source
	public void trackingSourceField(String TrackingSource) {
		$(TrackingSourceField).sendKeys(TrackingSource);
	}

	// Tracking Content
	public void TrackingContentField(String TrackingContent) {
		$(TrackingContentField).sendKeys(TrackingContent);
	}

	// Tracking Keywords
	public void trackingKeywordsField(String TrackingKeywords) {
		$(TrackingKeywordsField).sendKeys(TrackingKeywords);
	}

	// Backend GP
	public void BackendGPField(String BackendGP) {
		$(BackendGPField).sendKeys(BackendGP);
	}

	// Ad Campaign
	public void ADCampaignField(String ADCampaign) {
		$(ADCampaignField).sendKeys(ADCampaign);
	}

	// Ad Group
	public void aDGroupField(String ADGroup) {
		$(ADGroupField).sendKeys(ADGroup);
	}

	// Ad Keyword
	public void ADKeywordField(String ADKeyword) {
		$(ADKeywordField).sendKeys(ADKeyword);
	}

	// Ad Slot
	public void ADSlotField(String ADSlot) {
		$(ADSlotField).sendKeys(ADSlot);
	}

	// Ad Slot Position
	public void aDSlotPositionField(String ADSlotPosition) {
		$(ADSlotPositionField).sendKeys(ADSlotPosition);
	}

	// Ad Content
	public void ADContentField(String ADContent) {
		$(ADContentField).sendKeys(ADContent);
	}

	// LastActivityDate
	public void lastActivityDateCalender() {
		driver.findElement(By.cssSelector("*[id^='6733:'][id$='a']")).click();
		List<WebElement> LastActivityDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node12 = LastActivityDate.size();
		for (int i = 0; i < total_node12; i++) {
			String date = LastActivityDate.get(i).getText();
			if (date.equals("27")) {
				LastActivityDate.get(i).click();
				break;
			}
		}
	}

	// Next Activity Date
	public void nextActivityDateCalender() {
		driver.findElement(By.cssSelector("*[id^='6780:'][id$='a']")).click();
		List<WebElement> NextActivityDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node13 = NextActivityDate.size();
		for (int i = 0; i < total_node13; i++) {
			String date = NextActivityDate.get(i).getText();
			if (date.equals("27")) {
				NextActivityDate.get(i).click();
				break;
			}
		}
	}

	// LastStageChangeTime Date and Time
	public void lastStageChangeTimeDateAndTimeCalender() {
		driver.findElement(By.cssSelector("*[id^='6843:'][id$='a']")).click();
		List<WebElement> LastStageChangeTime = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node14 = LastStageChangeTime.size();
		for (int i = 0; i < total_node14; i++) {
			String date = LastStageChangeTime.get(i).getText();
			if (date.equals("27")) {
				LastStageChangeTime.get(i).click();
				break;
			}
		}
	}

	// Last Sales Activity Date Time
	public void LastSalesActivityDateTimeCalender() {
		driver.findElement(By.cssSelector("*[id^='6803:'][id$='a']")).click();
		List<WebElement> LastSalesActivityDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node15 = LastSalesActivityDate.size();
		for (int i = 0; i < total_node15; i++) {
			String date = LastSalesActivityDate.get(i).getText();
			if (date.equals("27")) {
				LastSalesActivityDate.get(i).click();
				break;
			}
		}
	}

	// Last Lead Conversion Date Time
	public void LastLeadConversionDateTimeCalender() {
		driver.findElement(By.cssSelector("*[id^='6879:'][id$='a']")).click();
		List<WebElement> LastLeadConversionDate = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node16 = LastLeadConversionDate.size();
		for (int i = 0; i < total_node16; i++) {
			String date = LastLeadConversionDate.get(i).getText();
			if (date.equals("30")) {
				LastLeadConversionDate.get(i).click();
				break;
			}
		}
	}

	// CRM Submission TIME DATE
	public void CRMSubmissionTIMEDATECalender() {
		driver.findElement(By.cssSelector("*[id^='7061:'][id$='a']")).click();
		List<WebElement> CRMSubmissionTime = driver.findElements(By.xpath("//table[@class='calGrid']//td"));
		int total_node17 = CRMSubmissionTime.size();
		for (int i = 0; i < total_node17; i++) {
			String date = CRMSubmissionTime.get(i).getText();
			if (date.equals("30")) {
				CRMSubmissionTime.get(i).click();
				break;
			}
		}

	}

	public void clicktheSavebutton() {
		$(ClicktheSavebutton).click();

	}

}