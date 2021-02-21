package stepDef;

import org.junit.Assert;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjects.DynWebPage;
import pageObjects.LSEHomePage;
import pageObjects.UKPage;

public class TimeoutHandlingSteps extends TestBase {
	LSEHomePage hp;
	UKPage ukp;
	DynWebPage dwp;

	@Before
	public void initialization() {
		setUp();
	}

	@After
	public void clearDown() {
		tearDown();
	}

	@Given("I am on {string}")
	public void i_am_on(String url) {
		driver.get(url);
	}

	@When("I click on discover menu")
	public void i_click_on_discover_menu() {
		hp = new LSEHomePage();
		Assert.assertEquals("London Stock Exchange homepage | London Stock Exchange", driver.getTitle());
		hp.cookiesHandling();
		hp.clickDiscoverMenu();
	}

	@When("I click on United Kingdom submenu")
	public void i_click_on_united_kingdom_submenu() {
		ukp = hp.clickUKSubmenu();
	}

	@Then("United Kingdom page should open")
	public void united_kingdom_page_should_open() {
		Assert.assertEquals("United Kingdom | London Stock Exchange", driver.getTitle());
	}

	@Then("providing info about finance")
	public void providing_info_about_finance() {
		ukp.financeInfo();
	}
	
	@When("I click on the iframe")
	public void i_click_on_the_iframe() {
		dwp = new DynWebPage();
		Assert.assertEquals("Iframe Example", driver.getTitle());
		dwp.iFrameSelect();
	}

	@Then("I should be able to get the iframe text")
	public void i_should_be_able_to_get_the_iframe_text() {
		dwp.iFrameVerify();
	}
}
