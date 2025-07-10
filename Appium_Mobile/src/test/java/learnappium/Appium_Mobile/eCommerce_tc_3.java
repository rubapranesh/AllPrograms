package learnappium.Appium_Mobile;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_3 extends BaseTest  {

	@Test
	public void set() throws InterruptedException  {
		
		 driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ruba");
		 //to hide the keyboard
		 driver.hideKeyboard();
		 driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		 driver.findElement(By.id("android:id/text1")).click();
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		 driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		 Thread.sleep(3000);
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 9 Retro\"));"));
	//scrolling has an issue we dont know where will it stop inorder to click shoping cart
		 int productCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		 for(int i=0;i<productCount;i++)
		 {
			 String  productname= driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			 
			 if(productname.equalsIgnoreCase("Air Jordan 9 Retro"))
			 {
				 driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
		     }
	     }	
		 
		 driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		 
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.attributeContains( driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
		 
		String lastPageProduct= driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		
		 Assert.assertEquals("Air Jordan 9 Retro", lastPageProduct);
	}}
