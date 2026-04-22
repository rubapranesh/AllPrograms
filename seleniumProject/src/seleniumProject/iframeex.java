package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframeex {
	 public static void main(String[] args){
	WebDriver driver=new FirefoxDriver();
    
     //navigate to url
	  driver.get("https://demoqa.com/nestedframes");
      WebElement pageHeadingElement=driver.findElement(By.xpath("//div[@id='framesWrapper']//div[1]"));
      String pageHeading=pageHeadingElement.getText();
      System.out.println("Page Heading is :"+pageHeading);
      
      //Switch to Parent frame
      WebElement frame1=driver.findElement(By.id("frame1"));
      driver.switchTo().frame(frame1);
      
      WebElement frame1Element= driver.findElement(By.tagName("body"));
      String frame1Text=frame1Element.getText();
      System.out.println("Frame1 is :"+frame1Text);
      
      //Switch to child frame
      driver.switchTo().frame(0);
     
      WebElement frame2Element= driver.findElement(By.tagName("p"));
      String frame2Text=frame2Element.getText();
      System.out.println("Frame2 is :"+frame2Text);
      
      //Switch to default content
      driver.switchTo().defaultContent();
      
      WebElement mainPageText=driver.findElement(By.xpath("//*[@id='framesWrapper']/div[1]"));
      System.out.println("mainpae text:" + mainPageText.getText());
      driver.close();
}
}