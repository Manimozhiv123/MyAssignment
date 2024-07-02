package Week3.Day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		
		alert.sendKeys("manimozhi");
		alert.dismiss();
		
		String message = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(message);
		
		
		

	}

}
