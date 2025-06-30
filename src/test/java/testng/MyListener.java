package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	WebDriver driver;
	public void onStart(ITestContext context) {
		System.out.println("Test execution is started...........");   // execute only once
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test started...........");  // execute multiple times
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test passed.......");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test failed.......");
		
		// Screenshot
				TakesScreenshot screenshot = (TakesScreenshot) driver;
				File file = screenshot.getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(file, new File("./screenshots/Image1.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped.......");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test execution is completed...........");   // execute only once
	}
}