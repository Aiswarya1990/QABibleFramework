package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ClientPage {
	WebDriver driver;
	GeneralUtilities obj = new GeneralUtilities();

	public ClientPage(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/payrollapp/client/index']")
	WebElement client;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton;

	@FindBy(xpath = "//a[@href='/payrollapp/client/update?id=1']")
	WebElement editIcon;

	@FindBy(linkText = "Create Client")
	WebElement createClient;

	@FindBy(id = "client-require_po")
	WebElement requirePO;

	public void clickClientIcon() {
		client.click();

	}

	public void clickCreateClientSubpage() {
		createClient.click();

	}

	public String bgvcolourofsearchbutton() {
		return obj.getStylePropertyValue(searchButton, "background-color");
	}

	public String getTooltipvalueofEditicon() {
		return obj.getToolTipValue(editIcon, "title");

	}
	public void toscroll()
	{
	obj.scrollBy(driver);
	}

	public boolean radiobuttonseletion() {
		return obj.isCheckBoxradioButtonSelection(requirePO);
	}

}
