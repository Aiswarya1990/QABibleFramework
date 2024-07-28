package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities { // moving common items to a GeneralUtility
	WebDriver driver;

	public String getElementText(WebElement element) // changing items are getting parameterized
	{
		String text = element.getText();
		return text;
	}

	public String getStylePropertyValue(WebElement element, String propertyType) {
		String propertyValue = element.getCssValue(propertyType);
		return propertyValue;
	}

	public boolean isCheckBoxradioButtonSelection(WebElement element) {
		element.click();
		boolean flag = element.isSelected();
		return flag;

	}

	public String getToolTipValue(WebElement element, String attributeType) {
		String ToolTipValue = element.getAttribute(attributeType);
		return ToolTipValue;

	}

	public boolean isPresenceofElement(WebElement element) {

		boolean display = element.isDisplayed();
		return display;
	}

	public String getSelectedOptionFromDropdown(WebElement element, String text) {
		element.click();
		Select s = new Select(element);
		s.selectByVisibleText(text); // either use any of them ie visibletext or Index
		WebElement selectvalue = s.getFirstSelectedOption();
		String value = selectvalue.getText();
		return value;

	}

	public void scrollBy(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", " ");
	}

}
