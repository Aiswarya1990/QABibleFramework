package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;
import utilities.WaitUtility;

public class LoginPage {
	WebDriver driver;
	GeneralUtilities obj = new GeneralUtilities();
	WaitUtility wu = new WaitUtility();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "loginform-username")
	WebElement username;

	@FindBy(id = "loginform-password")
	WebElement password;

	@FindBy(name = "login-button")
	WebElement login;

	public void inputusername(String uname) {
		username.sendKeys(uname);
		// Inorder to test with any uname & pwd its better not to hardcode the same
		// just need to change in Testcase

	}

	public void inputpassword(String pwd) {
		password.sendKeys(pwd);

	}

	public void validatelogin() {
		login.click();

	}

	public boolean checkpresenceofusername() 
	{
		wu.waitfforPresenceofUserNameDisplayedonPage(driver,"//input[@id='loginform-username']");
		return obj.isPresenceofElement(username);
	}

	
		

}
