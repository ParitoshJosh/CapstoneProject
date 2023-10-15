package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFlyAwayPage {

WebDriver driver;
	
	By loginbtn1 = By.xpath("//a[@href='login']");
	By username = By.xpath("//input[@name='email_id']");
	By pwd = By.xpath("//input[@name='pwd']");
	By loginBtn = By.xpath("//button[text()='Login']");
	By logoutBtnVal = By.xpath("//a[@href='logout']");
			
	
	public LoginFlyAwayPage(WebDriver driver) {
		this.driver=driver;
	}


	public By getLoginbtn1() {
		driver.findElement(loginbtn1).click();
		return loginbtn1;
	}


	public By getUsername() {
		driver.findElement(username).sendKeys("user1@user1.com");
		return username;
	}


	public By getPwd() {
		driver.findElement(pwd).sendKeys("user1");
		return pwd;
	}


	public By getLoginBtn() {
		driver.findElement(loginBtn).click();
		return loginBtn;
	}


	public By getLogoutBtnVal() {
		driver.findElement(logoutBtnVal).isDisplayed();
		return logoutBtnVal;
	}
}
