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
}
