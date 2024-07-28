package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class Homepage {
	WebDriver driver;
	GeneralUtilities obj = new GeneralUtilities(); // created object for GeneralUtilities

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='#']")
	WebElement loggedinUser;

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement user;

	@FindBy(xpath = "//a[@data-method='post']")
	WebElement logout;

	public void clickuser() {
		user.click();
	}

	public void clicklogout() {
		logout.click();
	}

	public String getLoggedinUserText() {
		return obj.getElementText(loggedinUser); // and we have called the function (getElementText) created generic
													// from UtilityyClass

	}
}
