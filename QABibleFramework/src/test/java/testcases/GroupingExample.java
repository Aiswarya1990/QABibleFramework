package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class GroupingExample {
	@Test
	public void testcase1() {

		System.out.println("First test case executed");
	}

	@Test(groups = "Critical")
	public void testcase2() {
		System.out.println("Second test case executed");
	}

	@Test(groups = "High")
	public void testcase3() {
		System.out.println("Third test case executed");
	}

	@Test(groups = "Critical")
	public void testcase4() {
		System.out.println("Fourth test case executed");
	}

	@Test
	public void testcase5() {
		System.out.println("Fifth test case executed");
	}

	@BeforeMethod(alwaysRun = true) // to consider beforemethod
	public void beforeMethod() {
		System.out.println("Before Print");
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {

		System.out.println("After Print");
	}

}
