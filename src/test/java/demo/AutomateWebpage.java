package demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateWebpage {

	public static void main(String[] args) throws InterruptedException {

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
		
		// convert lowercase letter to uppercase letter
		
		WebElement lowerToUpper = driver.findElement(By.id("fullname"));
		lowerToUpper.sendKeys(Keys.SHIFT + "ram");
		lowerToUpper.sendKeys(Keys.ENTER);
		
		// enter email
		
		driver.findElement(By.id("email")).sendKeys("ram@gmail.com");
		
		// enter address
		
		driver.findElement(By.id("address")).sendKeys("H no:2-33,Kurnool");
		
		// enter password
		
		driver.findElement(By.id("password")).sendKeys("ram@23262");
		
		// click sub-mitt button

		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		// Next click check box element option 
		
		driver.findElement(By.xpath("//a[text()=' Check Box']")).click();
		
		// check box webpage is displayed or not
		
		boolean checkBoxWebpage = driver.findElement(By.xpath("//h1[text()='Check Box']")).isDisplayed();
		System.out.println("check box webpage is displayed:" + checkBoxWebpage);

		// check box is selected or not
		
		WebElement checkBox = driver.findElement(By.id("c_bs_1"));
		checkBox.click();
		System.out.println("Check box is selected ?:" + checkBox.isSelected());

		// click on radio button element option
		
		driver.findElement(By.xpath("//a[text()=' Radio Button']")).click();

		// click radio button yes
		
		driver.findElement(By.xpath("//input[@type='radio'][@name='tab']")).click();

		// get text message on console
		
		WebElement getTextMessage = driver.findElement(By.id("check"));
		String checked = getTextMessage.getText();
		System.out.println("Get text message:" + checked);

		// click web element option
		
		driver.findElement(By.xpath("//a[text()=' Web Tables']")).click();

		// print all data from the table
		
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-striped mt-3']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (WebElement row : rows) {
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for (WebElement col : cols) {
				System.out.print(col.getText() + " | ");
			}
			System.out.println();
		}
		
		// delete one item on the table

		driver.findElement(By.xpath("//tbody/tr[1]/td[7]/a[2]//*[name()='svg']")).click();

		// click buttons option
		
		driver.findElement(By.xpath("//a[text()=' Buttons']")).click();
		
		// click right click me button
		
		WebElement clickRight = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		Actions actions = new Actions(driver);
		actions.contextClick(clickRight).perform();

		// click double click button
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		Actions actions1 = new Actions(driver);
		actions.doubleClick(doubleClick).perform();

		// click on click button
		
		WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
		Actions actions2 = new Actions(driver);
		actions.click(clickMe).perform();
		
		// check Buttons text displayed or not
		
		boolean buttons = driver.findElement(By.xpath("//h1[text()='Buttons']")).isDisplayed();
		System.out.println("Buttons heading displayed:?" + buttons);

		// click on links element option
		
		driver.findElement(By.xpath(" //a[text()=' Links']")).click();

		boolean links = driver.findElement(By.xpath("//h1[text()='Links']")).isDisplayed();
		System.out.println("Links webpage is displayed:?" + links);

		List<WebElement> links1 = driver.findElements(By.tagName("a"));

		int urlCount = links1.size();
		System.out.println("Total Urls : " + urlCount);
		int notUrlLinks = 0;
		for (WebElement link : links1) {
			String url = link.getAttribute("href");

			if (url.isEmpty() || url == null) {
				System.out.println("url is empty" + url);

				notUrlLinks++;
				continue;
			}

			if (!url.startsWith("http")) {
				System.out.println("urls doesn't have http-------" + url);
				notUrlLinks++;
				continue;
			}
		}
		System.out.println("valid links : " + (urlCount - notUrlLinks));
		System.out.println("invalid links : " + notUrlLinks);

		// click on upload and download element option

		driver.findElement(By.xpath("//a[text()=' Upload and Download']")).click();

		// Download and upload webpage is displayed or not
		
		boolean display1 = driver.findElement(By.xpath("//h1[text()='Upload and Download']")).isDisplayed();
		System.out.println("Display download and upload webpage:" + " " + display1);

		// select choose file and then upload file
		
		WebElement picture = driver.findElement(By.id("uploadFile"));
		Thread.sleep(3000);
		picture.sendKeys("D:\\Ram Files");

		// click download button
		
		driver.findElement(By.id("downloadButton")).click();

		// click dynamic properties element

		driver.findElement(By.xpath(" //a[text()=' Dynamic Properties']")).click();

		// Dynamic properties web page or not
		
		boolean dynamicWebpage = driver.findElement(By.xpath("//h1[text()='Dynamic Properties']")).isDisplayed();
		System.out.println("Dynamic properties web page:?" + " " + dynamicWebpage);

		// click color change button
		
		driver.findElement(By.id("colorChange")).click();
		Thread.sleep(6000);
		
		// Visibility after 5 seconds

		boolean visibility = driver.findElement(By.id("visibleAfter")).isDisplayed();

		System.out.println(" Visibility after 5 seconds?:" + " " + visibility);

		// click on alerts,frames and window element option
		
		driver.findElement(By.xpath(" //button[text()=' Alerts, Frames & Windows ']")).click();
		
		// select browser window option
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //a[text()=' Browser Windows']")).click();

		// check browser window webpage
		boolean browserWindow = driver.findElement(By.xpath("//h1[text()='Browser Windows']")).isDisplayed();
		System.out.println("display browser window wepage?:" + " " + browserWindow);
		
		// click new window message button
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='New Window Message']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h1[text()='Browser Windows']")).click();
		Set<String> windowIDs = driver.getWindowHandles();

		List<String> windowList = new ArrayList(windowIDs);

		String parentID = windowList.get(0);
		String childID = windowList.get(1);

		// Switch to child window

		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());

		driver.close();
		

		
	    driver.switchTo().window(windowList.get(0));
	    
		// click alerts element option
		
	    driver.findElement(By.xpath("//a[text()=' Alerts']")).click();
		
	    // check alerts webpage or not
		
	    boolean alerts = driver.findElement(By.xpath("//h1[text()='Alerts']")).isDisplayed();
		System.out.println("display alerts web page or not?:" + " " + alerts);
		
		// click on click me button
		
		driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
		Thread.sleep(2000);
		
		// get alert text
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		// click cancel button
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

		// click ok button
		
		driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
		Alert myalert1=driver.switchTo().alert();
		Thread.sleep(2000);
		myalert1.sendKeys("Hey Ram");
		myalert1.accept();
		
		// click on Frames option
		
		driver.findElement(By.xpath("//a[text()=' Frames']")).click();
		List<WebElement> framesList=driver.findElements(By.tagName("iframe"));
		System.out.println("list of frames:"+" "+framesList.size());
		
		// switched to first frame
		
		driver.switchTo().frame(0);
		
		// Get text from first frame
		
		WebElement textFrame=driver.findElement(By.xpath("//h1[normalize-space()='Selenium - Automation Practice Form']"));
	    System.out.println(textFrame.getText());
		driver.switchTo().defaultContent();
		
		// click modal dialog option

		driver.findElement(By.xpath("//a[text()=' Modal Dialogs']")).click();
		
		// click small modal button
		
		driver.findElement(By.xpath("//button[text()='Small Modal']")).click();
		
		// click close option
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		// click large modal button
		
		driver.findElement(By.xpath("//button[text()='Large Modal']")).click();
		
		// click X-mark 
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal-dialog modal-lg']//button[@aria-label='Close']")).click();
		
		// click widgets option
		
		driver.findElement(By.xpath(" //button[text()=' Widgets']")).click();
		
		// select Accordion
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' Accordion']")).click();
		
		// select why we do option?
		
		driver.findElement(By.id("headingTwentyTwo")).click();
		
		// Text is displayed or not
		
		boolean textAvailable=driver.findElement(By.id("collapseTwentyOne")).isDisplayed();
		Thread.sleep(2000);
		System.out.println("Text available or not:"+" "+textAvailable);
		
		driver.findElement(By.xpath(" //button[text()=' Widgets']")).click();
		
		// click auto complete option
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //a[text()=' Auto Complete']")).click();
		
		// check auto complete web page or not
		
		boolean autoComplete=driver.findElement(By.xpath("//h1[text()='Auto Complete']")).isDisplayed();
        System.out.println("display auto complete web page?"+" "+autoComplete);
        
        // click tag text box
        
        WebElement checkbox=driver.findElement(By.id("tags"));
        checkbox.click();
        checkbox.sendKeys("action");
        Thread.sleep(2000);
        checkbox.sendKeys(Keys.ARROW_DOWN);
        checkbox.sendKeys(Keys.ENTER);
        
        // select Slider option

        driver.findElement(By.xpath("//a[text()=' Slider']")).click();
        WebElement move=driver.findElement(By.id("ageInputId"));
        Actions  sliderAction=new Actions(driver);
        sliderAction.clickAndHold(move).moveByOffset(10, 0).release().perform();
        
        // select tool tips option
        
        driver.findElement(By.xpath(" //a[text()=' Tool Tips']")).click();
        boolean toolTips=driver.findElement(By.xpath("//h1[text()='Tool Tips']")).isDisplayed();
        System.out.println("Tool tips webpage?"+" "+toolTips);
        Actions actioTool=new Actions(driver);
        WebElement moveCursor=driver.findElement(By.xpath("//button[@title='Tooltip on bottom']"));
        String toolTip=moveCursor.getAttribute("title");
       
        //get tool tip text
        
        System.out.println("Tool bootom text:"+toolTip);
        actioTool.moveToElement(moveCursor).perform();
        driver.findElement(By.xpath(" //button[text()=' Widgets']")).click();
        
        // click interaction option
        Thread.sleep(3000);
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); // declaration
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Interaction']"))).click();
        
        // select droppable option
       
		WebDriverWait mywait1=new WebDriverWait(driver,Duration.ofSeconds(10)); // declaration
		mywait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //a[text()=' Droppable']"))).click();
        
        WebElement drag=driver.findElement(By.id("draggable"));
        WebElement drop=driver.findElement(By.id("droppable"));
        
        Actions action3=new Actions(driver);
        action3.dragAndDrop(drag, drop).build().perform();
		
	}

}
