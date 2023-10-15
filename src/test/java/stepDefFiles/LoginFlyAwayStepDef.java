package stepDefFiles;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginFlyAwayPage;

public class LoginFlyAwayStepDef {
	WebDriver driver = Hooks.driver;
	LoginFlyAwayPage lp;

	@When("user entered email address and password")
	public void user_entered_email_address_and_password() {
		lp = new LoginFlyAwayPage(driver);
		lp.getLoginbtn1();
		lp.getUsername();
		lp.getPwd();
	}

	@When("click on signup button")
	public void click_on_signup_button() {
		lp = new LoginFlyAwayPage(driver);
		lp.getLoginBtn();
	}

	@Then("validate logout button is displayed")
	public void validate_logout_button_is_displayed() {
		lp = new LoginFlyAwayPage(driver);
		lp.getLogoutBtnVal();

	}

}
