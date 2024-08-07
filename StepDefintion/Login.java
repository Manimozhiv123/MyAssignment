package StepDefintion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
public ChromeDriver driver;

		@Given("Launch the browser and load the url")
		public void launchBrowser() {
			driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		}
		
		@Given ("Enter the username")
		public void enterUsername() {
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		}
		
		@Given("Enter the password")
		public void enterPassword() {
			driver.findElement(By.id("password")).sendKeys("crmsfa");
		}
		
		@When ("Click on the Login button")
		public void clickLogin() {
			driver.findElement(By.className("decorativeSubmit")).click();
		}
		
		@Then ("Verify the login is Successfull")
		public void verifyLogin() {
			System.out.println(driver.getTitle());
		}
	
		
		@Given("Close the browser")
		public void closeBrowser() {
			driver.close();
		}
		
}