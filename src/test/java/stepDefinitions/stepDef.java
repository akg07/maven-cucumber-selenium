package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef {
	WebDriver driver;
	
	@Given("^Flipcart website is loaded\\.$")
	public void flipcart_website_is_loaded() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "./src/test/resources/Driver/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@type=\"text\" and @class=\"_2zrpKA _1dBPDZ\"]")).sendKeys("Aayush");
		driver.findElement(By.xpath("//input[@type=\"password\" and @class=\"_2zrpKA _3v41xv _1dBPDZ\"]")).sendKeys("Lucifer");
		driver.findElement(By.xpath("//*[@type='submit' and @class = \"_2AkmmA _1LctnI _7UHT_c\"]")).click();
	}

	@Then("^login should not be successful and verify the message$")
	public void login_should_not_be_successful_and_verify_the_message() throws Throwable {
		assertEquals("Please enter valid Email ID/Mobile number", driver.findElement(By.xpath("//*[@class=\"ZAtlA-\"]")).getText());
	}
	
//	Cartie Search option automation
	WebDriver cartier;
	
	@Given("^user open the http://www\\.cartier\\.com/$")
	public void user_open_the_http_www_cartier_com() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "./src/test/resources/Driver/chromedriver.exe");
	    cartier = new ChromeDriver();
	    cartier.get("https://www.en.cartier.com/");
	 
	}
	
	@Given("^user fill Watch in search bar$")
	public void user_fill_Watch_in_search_bar() throws Throwable {
	    cartier.findElement(By.xpath("//input[@id=\"js-search-form-input\" and @class=\"c-search__form-input\"]")).sendKeys("Watches");
	}

	@Given("^user click on the search button$")
	public void user_click_on_the_search_button() throws Throwable {
	    cartier.findElement(By.xpath("//*[@type=\"submit\" and @title=\"Search\" and @class=\"c-search__form-btn\"]")).click();
	}
}
