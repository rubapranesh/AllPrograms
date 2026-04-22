package testone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.findElement(By.xpath("//div[@class='gb_Id gb_J gb_3f gb_Tf']/div[1]//a[@class='gb_H']")).click();
	
	}

}
