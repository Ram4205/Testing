package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ram");
	
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ram@gmail.com");
		driver.findElement(By.xpath("//input[@id='gender']")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7799394205");
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("10-06-1999");
		driver.findElement(By.xpath("//input[@id='subjects']")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		
		WebElement picture=driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(2000);
		picture.sendKeys("D:\\Ram Files");
		
		driver.findElement(By.xpath("//textarea[@id='picture']")).sendKeys("Kurnool, H no:2-33");
		
		WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
		Select chooseState = new Select(state);
		chooseState.selectByIndex(4);
		WebElement city = driver.findElement(By.xpath("//select[@id='city']"));
		Select chooseCity = new Select(city);
		chooseCity.selectByIndex(2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
	}

}
