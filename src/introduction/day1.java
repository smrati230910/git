package introduction;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@BeforeSuite
	
	public void test6day1()
	 {
		
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	
	public void test7day1()
	 {
		
		System.out.println("AfterSuite");
	}
	
	@BeforeClass
	public void test8day1()
	 {
		
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void test9day1()
	 {
		
		System.out.println("AfterClass");
	}
	
	
	@Test
	
	public void test1day1()
	 {
		
		System.out.println("TestCase1Day1");
	}
	
@BeforeTest
	
	public void test10day1()
	 {
		
		System.out.println("BeforeTest");
	}
@AfterTest

public void test11day1()
 {
	
	System.out.println("AfterTest");
}

	@BeforeMethod
	public void test2day1()
	{
		
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void test3day1 ()
	 {
		
		System.out.println("AfterMethod");
	}
	@Test
	public void test4day1 ()
	 {
		
		System.out.println("TestCase2Day1");
	}
	@Test
	(groups= {"smoke"})
	public void test5day1()
	 {
		
		System.out.println("TestCase3Day1");
	}
}


