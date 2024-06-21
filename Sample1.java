package FirstCode;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.id("accountName")).sendKeys("Manimozhi123");
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			driver.findElement(By.id("numberEmployees")).sendKeys("10");
			driver.findElement(By.id("officeSiteName")).sendKeys("“LeafTaps”");
			driver.findElement(By.className("smallSubmit")).click();
			Thread.sleep(2000);
			driver.close();
			

			
			
		}

	

}
