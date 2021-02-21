package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDef.TestBase;

public class LSEHomePage extends TestBase {

	public LSEHomePage() {
	PageFactory.initElements(driver, this);
}

	@FindBy(id = "ccc-overlay")
	static WebElement cookiesPopup;

	@FindBy(id = "ccc-notify-accept")
	static WebElement cookiesAcceptButton;

	@FindBy(id = "nav-item-0")
	static WebElement discoverMenu;

	@FindBy(id = "nav-item-1")
	static WebElement newsAndPricesMenu;
	
	@FindBy(xpath = "//*[@id='sub-nav-item-1-1']//a[contains(text(),'FTSE 100')]")
	static WebElement ftse100Submenu;
	
	@FindBy(xpath = "//*[@id='sub-nav-item-0-1']//a[contains(text(),'United Kingdom')]")
	static WebElement ukSubmenu;

	public void cookiesHandling() {
		explicitWait(driver, cookiesPopup, 15);
		if (cookiesPopup.isDisplayed()) {
			Actions action = new Actions(driver);
			action.moveToElement(cookiesAcceptButton).build().perform();
			cookiesAcceptButton.click();
		}
	}

	public void clickDiscoverMenu() {
		explicitWait(driver, discoverMenu, 15);
		discoverMenu.click();
	}

	public void clickNewsAndPricesMenu() {
		explicitWait(driver, newsAndPricesMenu, 15);
		newsAndPricesMenu.click();
	}
	
	public void clickFTSE100Submenu() {
		explicitWait(driver, ftse100Submenu, 15);
		ftse100Submenu.click();
	}
	
	public UKPage clickUKSubmenu() {
		explicitWait(driver, ukSubmenu, 15);
		ukSubmenu.click();
		return new UKPage();
	}

}
