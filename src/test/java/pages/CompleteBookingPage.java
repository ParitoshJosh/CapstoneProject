package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class CompleteBookingPage {

	WebDriver driver;
	By completeBookingBtn = By.xpath("//*[text()='Click to complete booking']");
	By seeYourBookingsBtn = By.xpath("//a[text()='See Your Bookings']");
	By bookFlightBtn = By.xpath("//a[@href='bookflight?id=7']");

	public CompleteBookingPage(WebDriver driver) {
		this.driver = driver;
	}

	public By getCompleteBookingBtn() {
		driver.findElement(completeBookingBtn).click();
		return completeBookingBtn;
	}

	public By getbookFlightBtn() {
		driver.findElement(bookFlightBtn).click();
		return bookFlightBtn;
	}

	public By getSeeYourBookingsBtn() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Fly Away - Booking Confirmation");
		driver.findElement(seeYourBookingsBtn).isDisplayed();
		return seeYourBookingsBtn;
	}

}
