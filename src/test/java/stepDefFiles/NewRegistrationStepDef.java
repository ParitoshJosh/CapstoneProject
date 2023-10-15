package stepDefFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.NewRegistrationPage;

public class NewRegistrationStepDef {

	WebDriver driver = Hooks.driver;
	NewRegistrationPage rp;
	
	@Given("As a user navigate to Fly Away website on browser")
	public void as_a_user_navigate_to_Fly_Away_website_on_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://localhost:8080/FlyAway/home");
	}

	@When("user enter requried details to register")
	public void user_enter_requried_details_to_register() {
	    // Write code here that turns the phrase above into concrete actions
		rp = new NewRegistrationPage(driver);
		rp.getSignUpBtn1();
		rp.getNotMemBtn();
		rp.getEmailInput();
		rp.getPwdInput();
		rp.getCnfrmPwdInput();
		rp.getNameInput();
		rp.getAddressInput();
		rp.getCityInput();
		rp.getSignUpBtn();
	}

	@Then("Validate successful registration on UI and DB")
	public void validate_successful_registration_on_UI_and_DB() throws ClassNotFoundException, SQLException {
	    // Write code here that turns the phrase above into concrete actions
		// validating successful registration on UI
				rp = new NewRegistrationPage(driver);
				rp.getSignupVal();
				// Retrieving entry details from DB
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/flyaway", "root", "");
				Statement stmt = con.createStatement();
				ResultSet result = stmt.executeQuery("select * from f_user where name='user01'");
				while (result.next()) {
					String actual = result.getString("name");
					System.out.println(actual);
					Assert.assertEquals(actual, "user01");
				}
				con.close();
	}
}
