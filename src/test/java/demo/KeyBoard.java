package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard {

	public static void main(String[] args) throws Exception   {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		WebElement name=driver.findElement(By.id("fullname"));
		name.sendKeys("Ram");
		Thread.sleep(2000);
		// key
		name.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		name.sendKeys("Tarak");Thread.sleep(2000);
		name.sendKeys(Keys.ENTER);Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email"));
		Thread.sleep(2000);
		email.sendKeys("ram@gmail.com");
		email.sendKeys(Keys.ARROW_LEFT);Thread.sleep(1000);
		email.sendKeys(Keys.ARROW_LEFT);Thread.sleep(1000);
		email.sendKeys(Keys.ARROW_RIGHT);Thread.sleep(1000);
		email.sendKeys(Keys.ARROW_RIGHT);Thread.sleep(1000);
		email.sendKeys(Keys.ENTER);Thread.sleep(2000);
		WebElement address=driver.findElement(By.id("address"));
		Thread.sleep(2000);
		String add="Peddanelatur village";
		address.sendKeys(Keys.SHIFT+add);
		WebElement password=driver.findElement(By.id("password"));

		name.sendKeys(Keys.CONTROL+"a");Thread.sleep(2000);
		name.sendKeys(Keys.CONTROL+"c");Thread.sleep(2000);
		password.sendKeys(Keys.CONTROL+"v");Thread.sleep(2000);
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
