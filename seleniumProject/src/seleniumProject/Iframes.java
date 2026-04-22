package seleniumProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			 
		driver.get("https://demoqa.com/frames");
		

		/*//By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);
		*/
		//By finding all the web elements using iframe tag
		/*List<WebElement> iframeElements = driver.findElements(By.tagName("iframes"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		*/
		//driver.get("https://demoqa.com/frames");

		//Switch by Index
	/*	
	   WebElement e=driver.findElement(By.xpath("//div[@id='frame1Wrapper']//iframe"));
		driver.switchTo().frame(e);
		String variable=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("text : " +variable);
		
		driver.switchTo().parentFrame(); // parent frame
		String mainpage=driver.findElement(By.xpath("//div[@id='framesWrapper']//div[1]")).getText();
		System.out.println(mainpage);*/
		
		//Switch by frame name
		//driver.switchTo().frame(0);
		//*[@id="sampleHeading"]
		
		
		//driver.quit();
		
		//Switch by frame ID
		//driver.switchTo().frame("IF1");
		//driver.quit();*/
				
				
		//First find the element using any of locator stratedgy
		WebElement iframeElement = driver.findElement(By.xpath("//*[@id='frame1']"));

		//now use the switch command
		driver.switchTo().frame(iframeElement);
		

		WebElement iframeElementss = driver.findElement(By.xpath("//*[@id='sampleHeading']"));
		System.out.println(	iframeElementss.getText());
		Thread.sleep(2000);
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		
		//now use the switch command
				/*driver.switchTo().frame(0);

				//Do all the required tasks in the frame 0
				//Switch back to the main window
				driver.switchTo().defaultContent();*/
			
driver.close();
	}
}
