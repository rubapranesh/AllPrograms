package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testingmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   	
				String baseurl="https://www.google.com";
				WebDriver driver=new FirefoxDriver();
				driver.get(baseurl);
				
			
				driver.findElement(By.xpath("//*[@name='q']")).sendKeys("iphone");
				Thread.sleep(3000);
				List<WebElement> li=driver.findElements(By.xpath("//*[@class='aajZCb']//ul//li//div[@class='wM6W7d']/span"));
				for(WebElement a:li) {
					System.out.println("aa");
					if(a.getText().equalsIgnoreCase("iphone 15"))
					{
				         a.click();
					}
				}
				System.out.println("bb");
				
				Thread.sleep(5000);
				
				
				
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				/*		List<WebElement> a = driver.findElements(By.xpath("//span[@class='text' and contains(text(),'Frames')]"));
				WebElement b=a.get(0);
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.navigate().forward();
				Thread.sleep(2000);
				driver.navigate().refresh();
				Thread.sleep(2000);
				driver.navigate().to("https://www.google.com");
*/
	}

}
