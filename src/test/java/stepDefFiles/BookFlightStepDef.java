package stepDefFiles;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.BookFlightPage;

public class BookFlightStepDef {

	WebDriver driver = Hooks.driver;
	BookFlightPage bf;

	@Then("valiate title of the book flight")
	public void valiate_title_of_the_book_flight() {
	    bf = new BookFlightPage(driver);
	    bf.getBookFlightBtn();
	}
}