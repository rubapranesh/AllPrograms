package seleniumProject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class basiclocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shalini\\Downloads\\Driver\\chromedriver.exe");
	
		//instantiate the driver
		FirefoxDriver driver = new FirefoxDriver();
		
		//specify the URL of the webpage
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("pranesh");
				
		/*List<WebElement> Dropdownname = driver.findElements(By.xpath("//div[@class='erkvQe']//li//div[@class='wM6W7d WggQGd']/span"));
		
		for (WebElement searchElement : Dropdownname) {
		String options = searchElement.getText();
			System.out.println(options);
		}
	*/
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
