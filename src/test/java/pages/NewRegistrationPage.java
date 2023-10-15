package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;


public class NewRegistrationPage {

	WebDriver driver;
	WebDriverWait waits;
	By SignUpBtn1 = By.xpath("//a[@href='login']");
	By NotMemBtn = By.xpath("//a[@href='signup']");
	By EmailInput = By.xpath("//*[@name='email_id']");
	By PwdInput = By.xpath("//*[@name='pwd']");
	By CnfrmPwdInput = By.xpath("//*[@name='pwd2']");
	By NameInput = By.xpath("//*[@name='name']");
	By addressInput = By.xpath("//*[@name='address']");
	By cityInput = By.xpath("//*[@name='city']");
	By signUpBtn = By.xpath("//button[text()='Signup']");
	By signupVal = By.xpath("//a[@href='login'][2]");
	
	
	public NewRegistrationPage(WebDriver driver) {
		this.driver=driver;
	}


	public By getSignUpBtn1() {
		driver.findElement(SignUpBtn1).click();
		return SignUpBtn1;
	}


	public By getNotMemBtn() {
		driver.findElement(NotMemBtn).click();
		return NotMemBtn;
	}


	public By getEmailInput() {
		driver.findElement(EmailInput).sendKeys("user01@user01.com");
		return EmailInput;
	}


	public By getPwdInput() {
		driver.findElement(PwdInput).sendKeys("user01");
		return PwdInput;
	}


	public By getCnfrmPwdInput() {
		driver.findElement(CnfrmPwdInput).sendKeys("user01");
		return CnfrmPwdInput;
	}


	public By getNameInput() {
		driver.findElement(NameInput).sendKeys("user01");
		return NameInput;
	}


	public By getAddressInput() {
		driver.findElement(addressInput).sendKeys("user01");
		return addressInput;
	}


	public By getCityInput() {
		driver.findElement(cityInput).sendKeys("user01");
		return cityInput;
	}


	public By getSignUpBtn() {
		driver.findElement(signUpBtn).click();
		return signUpBtn;
	}


	public By getSignupVal() {
		WebElement signup =driver.findElement(signupVal);
		String acutal = signup.getText();
		System.out.println(acutal);
		Assert.assertEquals(acutal, "Login to continue checking flights");
		return signupVal;
	}
	
}
