package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver","D://Automation notes JAVA//Selenium Drivers//Drivers//FirefoxDriver.exe");

				WebDriver driver=new FirefoxDriver();

				String baseurl="https://the-internet.herokuapp.com/";
				driver.get(baseurl);
				// verify the current page
			   WebElement Dropdpwn=driver.findElement(By.linkText("Dropdown"));
			  Dropdpwn.click();
				
				//checkbox
				/*WebElement checkbooklink=driver.findElement(By.linkText("Checkboxes"));
				checkbooklink.click();
			   

				Thread.sleep(3000);
				List<WebElement> checkbooklinkclickone=driver.findElements(By.cssSelector("input[type='checkbox']"));
		    	checkbooklinkclickone.get(0).click();
				Thread.sleep(3000);
				System.out.println( checkbooklinkclickone.get(0).isEnabled());
				System.out.println( checkbooklinkclickone.get(0).isSelected());
				System.out.println( checkbooklinkclickone.get(0).isDisplayed());
			 
				 
			    driver.close();
			  */
            //synatx
			  WebElement dropdownproperty=driver.findElement(By.id("dropdown"));
			Select drpCountry = new Select(dropdownproperty);
				Thread.sleep(3000);
				drpCountry.selectByVisibleText("Option 2"); //innertext
				Thread.sleep(4000);
				drpCountry.selectByIndex(1);   //index
				Thread.sleep(3000);
				drpCountry.selectByValue("2"); //attribute value
		System.out.println("fjgsufsuifsif");
				driver.close();
	}
}
