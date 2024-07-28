package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	
	public void waitforpresenceofelementlocated(WebDriver driver,String locator)
	{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(10000)); //explicit wait
	wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(locator)));
}
	public void waitforAlertTobePresent(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(10000));
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	public void waitfforPresenceofUserNameDisplayedonPage(WebDriver driver,String locator)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(10000));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	}
	
}

