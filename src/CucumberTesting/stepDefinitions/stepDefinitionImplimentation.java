package CucumberTesting.stepDefinitions;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitionImplimentation {
	@Given("I landed on Ecommerce page")
	public void I_landed_on_Ecommerce_page()
	{
System.setProperty("webdriver.chrome.driver","C://CHromeDriverJava/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
System.out.println("Inside Background, first execution");

	}
	
	@Given("^Logged in with username (.+) and Password (.+)$")
	public void Logged_in_with_username_and_Password(String username,String password)
	{
		System.out.println("The username is "+username+"Password is"+password);
	}
	
	@When("^I add product (.+) from cart$")
	public void I_add_product_from_cart(String productName)
	{
		System.out.println("The product name is"+productName);
	}
	
	@And("^CHeckout (.+) and submit the order$")
	public void CHeckout_and_submit_the_order(String productName)
	{
		System.out.println("The product name is"+productName);
	}
	
	@Then("{string} message is displayed on confirmationpage")
	public void message_is_displayed_on_confirmationpage(String message)
	{
		System.out.println("the Message is"+message);
	}
}
