package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LeadsPage extends BasePageTest {

	By UserNameField = By.id("username");
	By PasswordField = By.id("password");

	By LoginBtnClick = By.xpath("//input[@id = 'Login' and @class = 'button r4 wide primary']");
	By NewBtnClick = By.xpath("//div[@title='New']");
	By NextBtnClick = By.xpath("//span[contains(text(),'Next')]");

	public void userNamefield(String username) {
		$(UserNameField).sendKeys(username);
	}

	public void passwordField(String password) {
		$(PasswordField).sendKeys(password);

	}

	public void loginBtnClick() {
		$(LoginBtnClick).click();

	}

	public void leadTabClick() {
		Actions action = new Actions(driver);
		WebElement leadtab = driver
				.findElement(By.xpath("//span[contains(text(),'Leads') and @class='slds-truncate']"));
		action.moveToElement(leadtab)
				.moveToElement(
						driver.findElement(By.xpath("//span[contains(text(),'Leads') and @class='slds-truncate']")))
				.click().build().perform();

	}

	public void newBtnClick() {
		$(NewBtnClick).click();

	}

	public void nextBtnClick() {
		$(NextBtnClick).click();

	}

}