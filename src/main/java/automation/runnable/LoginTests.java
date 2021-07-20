package automation.runnable;

import org.junit.Assert;
import org.junit.Test;

import automation.core.SeleneseTest;
import automation.pom.epizy.HomePage;
import automation.pom.epizy.LoginPage;

public class LoginTests extends SeleneseTest {

	@Test
	public void testLogin() {

		String expectedErrorMsg = "Warning: No match for E-Mail Address and/or Password.";

		LoginPage loginPage = new LoginPage(getWebDriver());

		HomePage homePage = new HomePage(getWebDriver());

		homePage.clickOnLoginBtn();

		loginPage.login("home1@acasa.com", "12345");

		Assert.assertEquals(expectedErrorMsg, loginPage.getLoginActualErrorMsg());

	}
}
