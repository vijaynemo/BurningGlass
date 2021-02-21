package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDef.TestBase;

public class DynWebPage extends TestBase {
	public DynWebPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='ifrm']")
	static WebElement iframe1;
	
	@FindBy(xpath = "//*[body/h1]")
	static WebElement iframeBody;
	
	
	public void iFrameSelect() {
		explicitWait(driver, iframe1, 15);
		Assert.assertTrue(iframe1.isDisplayed());
		driver.switchTo().frame(iframe1);
		
	}
	
	public void iFrameVerify() {
		explicitWait(driver, iframeBody, 15);
		Assert.assertTrue(iframeBody.isDisplayed());
		System.out.println(iframeBody.getText());	
	}
}
