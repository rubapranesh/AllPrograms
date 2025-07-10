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

public class BrowserBaseTest {

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
				
				options.setDeviceName("praneshemulator");
				//options.setApp("C:\\Users\\91852\\Downloads\\theScore_Apkpure.apk");		
				//options.setApp("C:\\Users\\91852\\eclipse-workspace\\Appium_Mobile\\src\\test\\java\\resource\\ApiDemos-debug.apk");		
			//	options.setApp("C:\\Users\\91852\\eclipse-workspace\\Appium_Mobile\\src\\test\\java\\resource\\General-Store.apk");		
				options.setChromedriverExecutable("C:\\Users\\91852\\eclipse-workspace\\Appium_Mobile\\src\\test\\java\\resource\\chromedriver.exe");
				options.setCapability("browserName", "Chrome");
				driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
				System.out.println("Driver launched");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

	}
	/*@BeforeTest
	public void beforeTest()
	{
		extent.attachReporter(spark);
	}*/
	

	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		extent.flush();
		driver.quit();
		service.stop();
			
	}
	
	
	
}
