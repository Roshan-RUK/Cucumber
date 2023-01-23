package CucumberTesting.stepDefinitions;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class stepDefinitionImplimentation {
	@Given("I landed on Ecommerce page")
	public void I_landed_on_Ecommerce_page()
	{
System.setProperty("webdriver.chrome.driver","C://CHromeDriverJava/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();

	}
}
