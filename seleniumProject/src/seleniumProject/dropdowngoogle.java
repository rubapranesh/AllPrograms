package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dropdowngoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("iphone");
		Thread.sleep(4000);
		//List<WebElement> dropobj=driver.findElements(By.xpath("//ul[@class='G43f7e']//li/div/div[2]/div//*[contains(@class,'wM6W7d')]/span"));
		//List<WebElement> dropobj=driver.findElements(By.xpath("//div[@class='erkvQe']//ul[@class='G43f7e']/li[1]//div[@class='wM6W7d']/span"));
		List<WebElement> dropobj=driver.findElements(By.xpath("//div[@class='erkvQe']//ul[@class='G43f7e']/li//*[contains(@class,'wM6W7d')]/span"));
		System.out.println("SIZE === "+ dropobj.size());
		
	for(WebElement i :dropobj)
	{
		System.out.println(i.getText());
	}
	
	    /*dropobj.get(6).click();
	     Thread.sleep(5000);
	 	driver.navigate().back();
		Thread.sleep(5000);*/
	driver.close();
		
	}

}
