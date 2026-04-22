package seleniumProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WEbtable {


	public static void main(String args[]) throws InterruptedException{  
		WebDriver driver = new FirefoxDriver();
		 ArrayList<String> Arraylist = new ArrayList<String> ();
		 new WebDriverWait(driver, Duration.ofSeconds(1));
		driver.get("https://demoqa.com/webtables");
		//int sRow = 1;
		//int sCol = 2;
		Thread.sleep(10000);
		
		
		/*List<WebElement> row =driver.findElements(By.xpath("//div[@class='rt-tbody']/div"));
		
		System.out.println("row size=====" + row.size());*/
		
		for(int sRow1 = 1;sRow1<=3;sRow1++) {
		for(int sCol = 1;sCol<=7;sCol++)
		{
		//Here we are locating the xpath by passing variables in the xpath
			
	    //String sCellValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div["+sCol+"]/div/div["+sRow1+"]")).getText();
		String sCellValue = driver.findElement(By.xpath("//div[@class='ReactTable -striped -highlight']//div[@class='rt-tbody']/div["+ sRow1 +"]/div/div["+sCol+"]")).getText();
		//String scolumnValue = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]")).getText();
		 System.out.println(sCellValue);
		
		 Arraylist.add(sCellValue);
		if(sCellValue.equals("Gentry")){
			System.out.println("it is present");
		}
		}
		}
		 
		 System.out.println("collection data" + Arraylist);
		
	//	String sRowValue = "Clock Tower Hotel";

		driver.close();
		}}
