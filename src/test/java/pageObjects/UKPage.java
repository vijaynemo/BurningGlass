package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDef.TestBase;

public class UKPage extends TestBase {

	public UKPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='bubbles mobile-flex-wrapper']")
	static WebElement financeInfo;

	public void financeInfo() {
		explicitWait(driver, financeInfo, 15);
		Assert.assertTrue(financeInfo.isDisplayed());
	}
}
