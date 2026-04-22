package seleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  WebDriver driver=new FirefoxDriver();
		  
		    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		    new WebDriverWait(driver, Duration.ofSeconds(10));
		    //*[@id="alertButton"]
		    
	 /*   WebElement checkbooklink=driver.findElement(By.xpath("//*[@id=\"tabButton\"]"));
		checkbooklink.click();
			Thread.sleep(4000);
			String originalWindow = driver.getWindowHandle();
			driver.switchTo().newWindow(WindowType.TAB);
			//*[@id="sampleHeading"]
			  WebElement netab=driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
			System.out.println( netab.getText());
			Thread.sleep(4000);*/
		    
		    
			
		  
		    WebElement AlertOK=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		    AlertOK.click();
		    Thread.sleep(5000);
		 //  driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		 driver.switchTo().alert().sendKeys("pranesh");
		 // Thread.sleep(2000);
		  driver.switchTo().alert().accept();
		   // System.out.println(s);
	    Thread.sleep(5000);
		    driver.close();
    
	}

}
