package automation.pom.epizy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automation.pom.AbstractPageObject;

public class HomePage extends AbstractPageObject {

	@FindBy(xpath = "//a[@title='My Account']//span[1]")
	private WebElement btnMyAccount;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	private WebElement btnLogin;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickOnLoginBtn() {
		btnMyAccount.click();
		btnLogin.click();
	}

}
