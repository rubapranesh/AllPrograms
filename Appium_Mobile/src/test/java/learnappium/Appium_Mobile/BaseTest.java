package learnappium.Appium_Mobile;

import java.io.File;
import static io.appium.java_client.service.local.flags.GeneralServerFlag.BASEPATH;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public AndroidDriver driver;
    public AppiumDriverLocalService service;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");

	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
		
		
		//to start the server
		AppiumServiceBuilder builder =new AppiumServiceBuilder();
		builder.withAppiumJS(new File("C:\\Users\\91852\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
						.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
						.usingPort(4723).withArgument (GeneralServerFlag.LOCAL_TIMEZONE)
						.withLogFile(new File("appiumlog.txt"))
						.withIPAddress("127.0.0.1");
						
		service =AppiumDriverLocalService.buildService(builder);
				
		service.start();

				UiAutomator2Options options= new UiAutomator2Options();
				//Xcuite
				options.setDeviceName("praneshemulator");
				//options.setApp("C:\\Users\\91852\\Downloads\\theScore_Apkpure.apk");		
				//options.setApp("C:\\Users\\91852\\eclipse-workspace\\Appium_Mobile\\src\\test\\java\\resource\\ApiDemos-debug.apk");		
				options.setApp("C:\\Users\\91852\\eclipse-workspace\\Appium_Mobile\\src\\test\\java\\resource\\General-Store.apk");		
				options.setChromedriverExecutable("C:\\Users\\91852\\eclipse-workspace\\Appium_Mobile\\src\\test\\java\\resource\\chromedriver.exe");
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
				System.out.println("Driver launched");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

	}
	/*@BeforeClass
	public void beforeTest()
	{
		extent.attachReporter(spark);
	}
	*/
	/**
	 * this method will long press the element
	 * @param ele
	 */
	public void longpressAction(WebElement ele) {
		((JavascriptExecutor)driver).executeScript("mobile:longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),"duration",2000
				));
	}
	
	/**
	 * this method used to swipe the element
	 * @param ele
	 */
	public void swipeAction(WebElement ele) {
	((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			   "elementId",((RemoteWebElement)ele).getId(),
			    "direction", "left",
			    "percent", 0.75
			));
	}
	
	/**
	 * this method used to scroll to the end
	 * 
	 */
	public void ScrolluptoEnd() {
	boolean canScrollMore;
	do {
	 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 3.0
		));
	}while(canScrollMore);
	}
	
	
	public void clickElement(By locatorobj) {
		 driver.findElement(locatorobj).click();
	}
	
	public void enterText(By locatorobj,String Text) {
		driver.findElement(locatorobj).sendKeys(Text);
	}
	
	public boolean pageIsDisplayed(By locatorobj) {
	return	driver.findElement(locatorobj).isDisplayed();	
	}
	
	public void navigateBack() 
	{
		driver.navigate().back();
	}
	
	public void verifyText(By locatorobj,String arg,String message) 
	{
	String Element=driver.findElement(locatorobj).getText();
	Assert.assertEquals(Element, arg, message);
	}
	
	public void verifyPage(By locatorobj,String message) 
	{
		boolean pageElement=pageIsDisplayed(locatorobj);
		Assert.assertTrue(pageElement, message);
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		extent.flush();
		driver.quit();
		service.stop();
			
	}
	
	
	
}
