package pages;

import org.openqa.selenium.By;

public class OpportunitesPage extends BasePage {

	By nextBtn = By.xpath("//span[contains(text(),'Next')]");
	By opportunityNameInput = By.cssSelector("*[id^='217:'][id$='a']");

	public void clickOnNextBtn() {

		waitForElementToBeClickable(nextBtn);

		$(nextBtn).click();

		driver.navigate().refresh();

	}

	public void opportunityName(String OpportunityName) {
		$(opportunityNameInput).sendKeys(OpportunityName);
	}
}