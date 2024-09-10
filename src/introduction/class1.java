package introduction;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class class1 {
	
 @BeforeSuite
 public static void beforesuite() {
		
		System.out.println("beforesuite");	
		}
 
 @AfterSuite
 public static void Aftersuite() {
		
		System.out.println("Aftersuite");	
		}
 
 @BeforeTest
 public static void BeforeTest() {
		
		System.out.println("BeforeTest");	
		}
 @AfterTest
 public static void Aftertest() {
		
		System.out.println("Aftertest");	
		}
 @BeforeMethod
 public static void Beforemethod() {
		
		System.out.println("Beforemethod");	
		}
 @AfterMethod
 public static void Aftermethod() {
		
		System.out.println("Aftermethod");	
		}
 
 
	@Test
	public static void firsttestcase1() {
		
	System.out.println("firsttestcase");	
	}


	@Test
	public static void firsttestcase2() {
		
	System.out.println("firsttestcase2");	
	}


	@Test
	public static void firsttestcase3() {
		
	System.out.println("firsttestcase3");	
	}
	
}
