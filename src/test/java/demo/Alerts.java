package demo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		WebElement clickbutton=driver.findElement(By.xpath("//*[text()='Alert']"));
		
		clickbutton.click();
		
		Alert al=driver.switchTo().alert();
		
		al.accept();
		
		//======================================second alert
		
		WebElement AppearAfterseconds=driver.findElement(By.xpath("//*[@onclick='myMessage()']"));
		
		AppearAfterseconds.click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert al1=driver.switchTo().alert();
		
		al1.accept();
		
		
		//====================================Third alert
		
		
		WebElement ExCancelButton=driver.findElement(By.xpath("//*[@onclick='myDesk()']"));
		
		ExCancelButton.click();
		
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.alertIsPresent());
		
		Alert al2=driver.switchTo().alert();
		
		Thread.sleep(2000);
		String textinthealert=al2.getText();
		
		System.out.println(textinthealert);
		
		
		al2.dismiss();
		
		
		//=======================================fourth alert
		
		WebElement sendkeysexample=driver.findElement(By.xpath("//*[@onclick='myPromp()']"));
		
		sendkeysexample.click();
		
		Alert al3=driver.switchTo().alert();
		
		Thread.sleep(3000);
		al3.sendKeys("Hello selenium");
		
		Thread.sleep(3000);
		
		al3.accept();
		
		//switch to alert, accept,dismiss, gettext, sendKeys
		
		
	}

}
