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

public class ListenersTest implements ITestListener
{

	WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
	
		System.out.println("On test start  "+result.getName());
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On test success  "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("On test failure  "+result.getName());
		

		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("./screenshots/Image1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("On test skipped  "+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On test start  "+result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On start  "+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("On finish  "+context.getName());
		
	}
	

}
