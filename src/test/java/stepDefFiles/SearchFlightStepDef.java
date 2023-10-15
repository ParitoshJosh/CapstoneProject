package stepDefFiles;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchFlightPage;

public class SearchFlightStepDef {

	WebDriver driver =Hooks.driver;
	SearchFlightPage sf;
	
	@Given("As a user select source and destination locations")
	public void as_a_user_select_source_and_destination_locations() {
	    sf = new SearchFlightPage(driver);
	    sf.getHomeBtn();
	    sf.getFromDd();
	    sf.getToDd();
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		sf = new SearchFlightPage(driver);
		sf.getSumbitBtn();
	}

	@Then("validate bookFlight Id from UI and DB")
	public void validate_bookFlight_Id_from_UI_and_DB() throws ClassNotFoundException, SQLException {
		sf = new SearchFlightPage(driver);
		sf.getBookFlightBtn();
	}
}
