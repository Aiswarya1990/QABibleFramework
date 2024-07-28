package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class WorkerPage {
	WebDriver driver;
	GeneralUtilities obj = new GeneralUtilities();

	public WorkerPage(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/payrollapp/worker/index']")
	WebElement clickworkers;

	@FindBy(xpath = "//a[@href='/payrollapp/worker/create']")
	WebElement createworker;

	@FindBy(id = "worker-title")
	WebElement title;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchbutton;

	public void selectworkerstab() {
		clickworkers.click();
	}

	public void selectcreaterworkertab() {
		createworker.click();
	}

	public String getTextofSearchButtonInWorkersPage() {
		return obj.getElementText(searchbutton);
	}

	public String getValueofSelectedTitle() {
		return obj.getSelectedOptionFromDropdown(title, "Mr");

	}
}
