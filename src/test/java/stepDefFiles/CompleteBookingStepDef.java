package stepDefFiles;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CompleteBookingPage;

public class CompleteBookingStepDef {

	WebDriver driver=Hooks.driver;
	CompleteBookingPage cb;
	
	@Given("As a user click on complete booking button")
	public void as_a_user_click_on_complete_booking_button() {
	    cb = new CompleteBookingPage(driver);
	    cb.getbookFlightBtn();
	    cb.getCompleteBookingBtn();
	}

	@Then("validate title of the complete booking")
	public void validate_title_of_the_complete_booking() {
		cb = new CompleteBookingPage(driver);
		cb.getSeeYourBookingsBtn();
	    
	}
}
