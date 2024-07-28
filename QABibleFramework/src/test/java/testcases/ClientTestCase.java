package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementrepository.ClientPage;
import elementrepository.LoginPage;
import utilities.ExcelRead;

public class ClientTestCase extends BaseClass {
	@Test
	public void verifythebackgroundcolourofSearchButtonfromClientsPage() throws IOException

	{
		LoginPage lp = new LoginPage(driver);
		lp.inputusername(ExcelRead.getStringData(1, 0));
		  lp.inputpassword(ExcelRead.getStringData(1, 1));
		lp.validatelogin();

		ClientPage cp = new ClientPage(driver);
		cp.clickClientIcon();
		cp.clickCreateClientSubpage();
		String actualcolour = cp.bgvcolourofsearchbutton();
		String expectedcolour = "rgba(51, 122, 183, 1)";
		Assert.assertEquals(actualcolour, expectedcolour);

	}

	@Test
	public void verifytheTooltipvalueofEditiconinClientsPage() throws IOException

	{
		LoginPage lp = new LoginPage(driver);
		lp.inputusername(ExcelRead.getStringData(1, 0));
		  lp.inputpassword(ExcelRead.getStringData(1, 1));
		lp.validatelogin();

		ClientPage cp = new ClientPage(driver);
		cp.clickClientIcon();
		String expected = "Update";
		String actual = cp.getTooltipvalueofEditicon();
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void verificationofRequirePoCheckboxfromCreateClientSubPage() throws IOException

	{
		LoginPage lp = new LoginPage(driver);
		lp.inputusername(ExcelRead.getStringData(1, 0));
		  lp.inputpassword(ExcelRead.getStringData(1, 1));
		lp.validatelogin();

		ClientPage cp = new ClientPage(driver);
		cp.clickClientIcon();
		cp.clickCreateClientSubpage();
		cp.toscroll();
		boolean expectedcheck = true;
		Boolean actualcheck = cp.radiobuttonseletion();
		Assert.assertEquals(expectedcheck, actualcheck);

	}
}
