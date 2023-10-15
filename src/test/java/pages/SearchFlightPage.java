package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class SearchFlightPage {

	WebDriver driver;

	By fromDd = By.xpath("//select[@name='source']");
	By toDd = By.xpath("//select[@name='destination']");
	By sumbitBtn = By.xpath("//button[text()='Submit']");
	By bookFlightBtn = By.xpath("//a[@href='bookflight?id=7']");
	By homeBtn = By.xpath("//a[@href='home']");

	public SearchFlightPage(WebDriver driver) {
		this.driver = driver;
	}

	public By getHomeBtn() {
		driver.findElement(homeBtn).click();
		return homeBtn;
	}

	public By getFromDd() {
		WebElement from = driver.findElement(fromDd);
		Select fromstates = new Select(from);
		fromstates.selectByVisibleText("Bangalore");

		return fromDd;
	}

	public By getToDd() {
		WebElement to = driver.findElement(toDd);
		Select tostates = new Select(to);
		tostates.selectByVisibleText("Hyderabad");
		return toDd;
	}

	public By getSumbitBtn() {
		driver.findElement(sumbitBtn).click();
		return sumbitBtn;
	}

	public By getBookFlightBtn() throws ClassNotFoundException, SQLException {
		WebElement id = driver.findElement(bookFlightBtn);
		// validate book flight ID UI and DB
		System.out.println(id.isDisplayed());
		String s = id.getAttribute("href");
		System.out.println(s);
		String[] url_id = s.split("\\=");
		System.out.println(url_id[1]);

		// validating book flight id on UI with DB

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/flyaway", "root", "");

		Statement stmt = con.createStatement();

		ResultSet result = stmt.executeQuery("select ID from f_flights where source=1 and destination =11;");
		System.out.println(result);

		while (result.next()) {
			String actual = result.getString("id");
			System.out.println(actual);
			Assert.assertEquals(actual, url_id[1]);
		}
		return bookFlightBtn;
	}
}
