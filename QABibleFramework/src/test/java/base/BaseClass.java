package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.CaptureScreenshotforFailedTestCase;

public class BaseClass {

	public WebDriver driver;
	public static Properties prop; // prop is a reference variable of the (java class) properties

	public static void readFromPropertiesFile() throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//Properties//Config.properties");
		prop.load(ip);
	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
//calling the function created  
		readFromPropertiesFile();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("baseURL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void afterMethod(ITestResult itestResult) throws IOException {
		// we use Listener to call screenshot utility
		if (itestResult.getStatus() == ITestResult.FAILURE) {
			CaptureScreenshotforFailedTestCase screenshot = new CaptureScreenshotforFailedTestCase();
			screenshot.captureScreenShotForFailedTestcase(driver, itestResult.getName());
		}
		driver.close();
	}
}
