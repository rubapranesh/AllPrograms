package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findelements {

		public static void main(String[] args) throws InterruptedException {

		  // System.setProperty("webdriver.chrome.driver", "X://chromedriver.exe");
		    WebDriver driver=new FirefoxDriver();
		    driver.get("http://demo.guru99.com/test/ajax.html");
		    
		    WebElement radiobutton = driver.findElement(By.id("yes"));
		    WebElement radiobuttondeselectyes = driver.findElement(By.id("no"));
		    radiobutton.click();
		    Thread.sleep(2000);
		    radiobuttondeselectyes.click();
		    Thread.sleep(2000);
		    
		    
		    List<WebElement> elements = driver.findElements(By.name("name"));
		    System.out.println("Number of elements:" +elements.size());

		    for (int i=0; i<elements.size();i++){
		      System.out.println("Radio button text:" + elements.get(i).getAttribute("id"));
		    }
		  }
		
		
		
		
	

}
