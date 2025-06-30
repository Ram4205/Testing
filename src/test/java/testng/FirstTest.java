package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	void openapp() {
		System.out.println("opening application");
	}
	@Test
	void login() { 
		System.out.println("Login to application");
	}
	@Test
	void logout() {
		System.out.println("logout from application");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		
		// click on elements option

		driver.findElement(By.xpath("//*[@id='headingOne']/parent::*")).click();
		
		// click on text box option
		
		driver.findElement(By.xpath("//a[text()=' Text Box']")).click(); 
		
		// text box content is diplayed or not
		
		boolean textBoxWebpage = driver.findElement(By.xpath("//form[@id='TextForm']")).isDisplayed();
		System.out.println("Text box page displayed:" + textBoxWebpage); 
		
	}
	
	
	
	
}
