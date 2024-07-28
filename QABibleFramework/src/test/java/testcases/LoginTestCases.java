package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import elementrepository.Homepage;
import elementrepository.LoginPage;
import utilities.ExcelRead;

import java.io.IOException;

import org.testng.Assert;


public class LoginTestCases extends BaseClass {
	
  @Test
  public void  verifyTheLoginisworkingwithValidUser() throws IOException 
  
  {
	  LoginPage lp = new LoginPage(driver);
	  lp.inputusername(ExcelRead.getStringData(1, 0));
	  lp.inputpassword(ExcelRead.getStringData(1, 1));
		lp.validatelogin();
		
		Homepage hp=new Homepage(driver);
		String actual =hp.getLoggedinUserText();
		String expected="CAROL THOMAS";
		Assert.assertEquals(actual, expected);
		
	
  }
}