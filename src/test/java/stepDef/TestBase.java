package stepDef;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ReadConfigFile;

public class TestBase {
	public static WebDriver driver;
	static ReadConfigFile read = new ReadConfigFile();

	public static void setUp() {
		String browser = read.getBrowser();

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", read.getChromeDriverPath());
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", read.getFirefoxDriverPath());
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", read.getChromeDriverPath());
			driver = new ChromeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void tearDown() {
		driver.quit();
	}
	
	public static void explicitWait(WebDriver driver, WebElement locator, int timeout) {
	      WebDriverWait wait =  new WebDriverWait(driver,timeout);
	      wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
	    }
	
}
