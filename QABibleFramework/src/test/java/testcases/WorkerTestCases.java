package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementrepository.LoginPage;
import elementrepository.WorkerPage;
import utilities.ExcelRead;

public class WorkerTestCases extends BaseClass {
	@Test
	public void verifytheTextofSearchButtonInWorkersPage() throws IOException

	{
		LoginPage lp = new LoginPage(driver);
		lp.inputusername(ExcelRead.getStringData(1, 0));
		  lp.inputpassword(ExcelRead.getStringData(1, 1));
		lp.validatelogin();
	

	 
		WorkerPage wp = new WorkerPage(driver);
		wp.selectworkerstab();
		String actualtext = wp.getTextofSearchButtonInWorkersPage();
		String expectedtext = "Search";
		Assert.assertEquals(actualtext, expectedtext);

	}
	
	@Test
	public void verificationOfTitleDropDownfromtheCreateWorkersubpage() throws IOException

	{
		LoginPage lp = new LoginPage(driver);
		lp.inputusername(ExcelRead.getStringData(1, 0));
		  lp.inputpassword(ExcelRead.getStringData(1, 1));
		lp.validatelogin();
	

	 
		WorkerPage wp = new WorkerPage(driver);
		wp.selectworkerstab();
		wp.selectcreaterworkertab();
		String actual=wp.getValueofSelectedTitle();
		String expected="Mr";
		Assert.assertEquals(actual, expected);
		

	}
	
	
}