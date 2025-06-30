package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("7799394205");
		//driver.findElement(By.className("r4vIwl BV+Dqf")).sendKeys("7799394205");
		driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
	}

}
