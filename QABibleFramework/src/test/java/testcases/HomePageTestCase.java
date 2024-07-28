package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementrepository.Homepage;
import elementrepository.LoginPage;
import utilities.ExcelRead;

public class HomePageTestCase extends BaseClass {
	@Test(groups="High",retryAnalyzer=retry.Retry.class)
	
	public void verifytheLogoutFeature() throws IOException {

		LoginPage lp = new LoginPage(driver);
		lp.inputusername(ExcelRead.getStringData(1, 0));
		  lp.inputpassword(ExcelRead.getStringData(1, 1));
		lp.validatelogin();
		

		Homepage hp = new Homepage(driver);
		hp.clickuser();
		hp.clicklogout();
		boolean actual = lp.checkpresenceofusername();
		boolean expected = true;
		Assert.assertEquals(actual, expected);

	}
}
