package introduction;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day2 {
	
	@BeforeSuite
	
	public void test6day2()
	 {
		
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	
	public void test7day2()
	 {
		
		System.out.println("AfterSuite");
	}
	
	@BeforeClass
	public void test8day2()
	 {
		
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void test9day2()
	 {
		
		System.out.println("AfterClass");
	}
	

	@Test
	(groups= {"smoke"})
	public void test1day2()
	 {
		
		System.out.println("TestCase1Day2");
	}
	@BeforeMethod
	public void test2day2()
	{
		
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void test3day2 ()
	 {
		
		System.out.println("AfterMethod");
	}
	@Test
	public void test4day2 ()
	 {
		
		System.out.println("TestCase2Day2");
	}
	@Test
	public void test5day2()
	 {
		
		System.out.println("TestCase3Day2");

	 }
}
