package automation.pom.epizy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.pom.AbstractPageObject;

public class LoginPage extends AbstractPageObject {

	@FindBy(id = "input-email")
	private WebElement txtEmailAddress;

	@FindBy(id = "input-password")
	private WebElement txtPassword;

	// //a[.='Forgotten Password']
	// //div[@id='content']//a[.='Forgotten Password']
	// //a[.='Forgotten Password' and not(@class='list-group-item')]

	@FindBy(name = "Forgotten Password")
	private WebElement btnForgottenPassword;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement btnLogin;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement lblValidationError;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void login(String emailAddress, String password) {
		txtEmailAddress.sendKeys(emailAddress);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}

	public String getLoginActualErrorMsg() {
		return lblValidationError.getText();
	}

	public ForgotPasswordPage navigateToForgottenPassword(WebDriver driver) {

		btnForgottenPassword.click();

		return PageFactory.initElements(driver, ForgotPasswordPage.class);
	}
}
