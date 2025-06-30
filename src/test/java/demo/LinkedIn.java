package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedIn {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("ramanaidu610@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ram@7777");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='btn__primary--large from__button--floating']")).click();
		
		//driver.findElement(By.cssSelector("button.btn__primary--large")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
