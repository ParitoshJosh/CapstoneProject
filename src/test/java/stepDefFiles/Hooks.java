package stepDefFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks {
	
public static WebDriver driver;
	
	@Before
	public void setup() {
		/*ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("109");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();*/
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		
	}
    
	@Before
	public void beforeScenario() {
		System.out.println("This will run before the scenario");
	}
	@After
	public void afterScenario(io.cucumber.java.Scenario sc) {
		System.out.println("This will run after the scenario");
		if(sc.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshot, "image/png");
		}else {
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshot, "image/png");
		}
	}
	
	@After
	public void teardown() {
		//driver.quit();
	}

}
