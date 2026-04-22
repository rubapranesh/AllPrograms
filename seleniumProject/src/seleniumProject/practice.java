package seleniumProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
	//selenium	system.setproperty
		//webdriver driver=new chromedriver();
		//get(url)
		//gettitle
		//getpagesource
		//driver.click
		//driver.isdisplayed 
		//isenabled
		//isselected
		//waits-implicity(weddriver wait) ->WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		//implicit
		//fluent
		//navigate-> back, froward, refresh, navigate.to(url)
		//findelmenet(webelemet) and findelements(list)
		//sendkeys
		//getText
		//getAttribute
		//Select - selectbyvisibletext , selectby Index, Select by value
		//iframes - driver.switchto.(webelemet) , driver.switchto.defaultcontent ,driver.switchto.parentframe
		//windowhandel - windowhandel(unique key) ,windowhandels(set - unique key)
		//tab ->set to list and use get method to access individually
		//scroll->((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", checkbooklink);
		
		WebDriver driver=new FirefoxDriver();
		System.out.println("first    ");
		//driver install
		driver.get("https://www.google.com/");
		
		List<WebElement> obj=driver.findElements(By.tagName("a"));
		
		System.out.println(obj.size());
		System.out.println(driver.getTitle());
		System.out.println("First check    ");
	
		
		
	
	}

}
